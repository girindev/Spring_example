import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.BoardService;
import vo.BoardVO;

public class Test {
	private static BoardService service;

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		service = context.getBean(BoardService.class);

		System.out.println("--콘솔 게시판 프로그램 시작--");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.글 목록보기(페이지번호 입력) 2.글 쓰기 3.글 읽기(글번호 입력) 4.글 내용 수정하기 5.글 삭제하기 6.댓글 달기");
			System.out.print("select >> ");

			int select = sc.nextInt();
			if (select == -1)
				break;
			else if (select == 1) {
				System.out.print("쪽수 입력 : ");
				int page_num = sc.nextInt();
				HashMap<String, Integer> hashmap = new HashMap<>();
				// limit 시작행 계산
				int startRow = (page_num - 1) * 10;
				hashmap.put("startRow", startRow);
				hashmap.put("count", 10);
				List<BoardVO> list = service.selectAll(hashmap);
				if (list.size() == 0) {
					System.out.println("해당부분에 글이 없습니다!!");
				} else {
					for (BoardVO b : list) {
						if (b.getReply_num() == 0)
							System.out.println(b.toString());
					}
				}
			} else if (select == 2) {
				System.out.print("작성자 : ");
				String name = sc.next();
				System.out.print("비밀번호 : ");
				String pw = sc.next();
				System.out.print("제목 : ");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String content = sc.nextLine();
				BoardVO b = new BoardVO();
				b.setReview_cnt(0);
				java.util.Date dt = new java.util.Date();
				java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String currentTime = sdf.format(dt);
				b.setWrite_date(currentTime);
				b.setWriter(name);
				b.setPassword(pw);
				b.setTitle(title);
				b.setContent(content);
				b.setReply_num(0);
				int result = service.insert(b);
				if (result == 1) {
					System.out.println("글 쓰기 성공!");
				} else {
					System.out.println("글 쓰기 실패!");
				}
			} else if (select == 3) {
				System.out.print("글번호 입력 : ");
				int board_num = sc.nextInt();
				BoardVO b = service.selectBoard(board_num);
				if (b != null) {
					System.out.println(b.toString());
					
					//////////////////////////////////////////////////
					List<BoardVO> list = service.selectReply(board_num);
					for (BoardVO vo : list) {
						System.out.println(" -----------댓글 -------------");
						System.out.println(vo.toString());
					}
					HashMap<String, Integer> hashmap = new HashMap<>();
					hashmap.put("review_cnt", b.getReview_cnt() + 1);
					hashmap.put("write_num", board_num);
					service.updateReviewCnt(hashmap);
				} else {
					System.out.println("글 번호 확인 바람!!!!");
				}
			} else if (select == 4) {
				System.out.print("글번호 입력 : ");
				int write_num = sc.nextInt();
				String pw = null;
				if (service.selectBoard(write_num) != null) {
					System.out.print("비밀번호 : ");
					pw = sc.next();
					if (checkPassword(write_num, pw)) {
						System.out.print("작성자 : ");
						String name = sc.next();
						System.out.print("제목 : ");
						sc.nextLine();
						String title = sc.nextLine();
						System.out.print("내용 : ");
						String content = sc.nextLine();
						BoardVO b = new BoardVO();
						b.setReview_cnt(0);
						java.util.Date dt = new java.util.Date();
						java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						String currentTime = sdf.format(dt);
						b.setWrite_date(currentTime);
						b.setWriter(name);
						b.setPassword(pw);
						b.setTitle(title);
						b.setContent(content);
						int result = service.updateBoard(b, write_num);
						if (result == 1) {
							System.out.println("글 수정 성공!");
						} else {
							System.out.println("글 수정 실패!");
						}
					} else {
						System.out.println("Password 확인 바람!!!!");
					}
				} else {
					System.out.println("글 번호 확인 바람!!!!");
				}
			} else if (select == 5) {
				System.out.print("글번호 입력 : ");
				int board_num = sc.nextInt();
				int result = service.deleteBoard(board_num);
				if (result == 1) {
					System.out.println("글 삭제 성공!");
				} else {
					System.out.println("글 삭제 실패!");
				}
			} else if (select == 6) {
				System.out.print("글번호 입력 : ");
				int board_num = sc.nextInt();
				if (service.selectBoard(board_num) != null) {
					System.out.print("비밀번호 : ");
					String pw = sc.next();
					System.out.print("작성자 : ");
					String name = sc.next();
					System.out.print("제목 : ");
					sc.nextLine();
					String title = sc.nextLine();
					System.out.print("내용 : ");
					String content = sc.nextLine();
					BoardVO b = new BoardVO();
					b.setReview_cnt(0);
					java.util.Date dt = new java.util.Date();
					java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String currentTime = sdf.format(dt);
					b.setWrite_date(currentTime);
					b.setWriter(name);
					b.setPassword(pw);
					b.setTitle(title);
					b.setContent(content);
					b.setReply_num(board_num);
					int result = service.replyInsert(b);
					if (result == 1) {
						System.out.println("댓글 작성 성공!");
					} else {
						System.out.println("댓글 작성 실패!");
					}
				} else {
					System.out.println("글 번호 확인 바람!!!!");
				}
			}
		}
		System.out.println("--콘솔 게시판 프로그램 종료--");
	}

	public static boolean checkPassword(int write_num, String password) {
		boolean result = false;
		String chkPassword = service.selectPassword(write_num);
		if (chkPassword.equals(password)) {
			result = true;
		}
		return result;
	}
}
