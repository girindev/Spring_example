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

		System.out.println("--�ܼ� �Խ��� ���α׷� ����--");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.�� ��Ϻ���(��������ȣ �Է�) 2.�� ���� 3.�� �б�(�۹�ȣ �Է�) 4.�� ���� �����ϱ� 5.�� �����ϱ� 6.��� �ޱ�");
			System.out.print("select >> ");

			int select = sc.nextInt();
			if (select == -1)
				break;
			else if (select == 1) {
				System.out.print("�ʼ� �Է� : ");
				int page_num = sc.nextInt();
				HashMap<String, Integer> hashmap = new HashMap<>();
				// limit ������ ���
				int startRow = (page_num - 1) * 10;
				hashmap.put("startRow", startRow);
				hashmap.put("count", 10);
				List<BoardVO> list = service.selectAll(hashmap);
				if (list.size() == 0) {
					System.out.println("�ش�κп� ���� �����ϴ�!!");
				} else {
					for (BoardVO b : list) {
						if (b.getReply_num() == 0)
							System.out.println(b.toString());
					}
				}
			} else if (select == 2) {
				System.out.print("�ۼ��� : ");
				String name = sc.next();
				System.out.print("��й�ȣ : ");
				String pw = sc.next();
				System.out.print("���� : ");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("���� : ");
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
					System.out.println("�� ���� ����!");
				} else {
					System.out.println("�� ���� ����!");
				}
			} else if (select == 3) {
				System.out.print("�۹�ȣ �Է� : ");
				int board_num = sc.nextInt();
				BoardVO b = service.selectBoard(board_num);
				if (b != null) {
					System.out.println(b.toString());
					
					//////////////////////////////////////////////////
					List<BoardVO> list = service.selectReply(board_num);
					for (BoardVO vo : list) {
						System.out.println(" -----------��� -------------");
						System.out.println(vo.toString());
					}
					HashMap<String, Integer> hashmap = new HashMap<>();
					hashmap.put("review_cnt", b.getReview_cnt() + 1);
					hashmap.put("write_num", board_num);
					service.updateReviewCnt(hashmap);
				} else {
					System.out.println("�� ��ȣ Ȯ�� �ٶ�!!!!");
				}
			} else if (select == 4) {
				System.out.print("�۹�ȣ �Է� : ");
				int write_num = sc.nextInt();
				String pw = null;
				if (service.selectBoard(write_num) != null) {
					System.out.print("��й�ȣ : ");
					pw = sc.next();
					if (checkPassword(write_num, pw)) {
						System.out.print("�ۼ��� : ");
						String name = sc.next();
						System.out.print("���� : ");
						sc.nextLine();
						String title = sc.nextLine();
						System.out.print("���� : ");
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
							System.out.println("�� ���� ����!");
						} else {
							System.out.println("�� ���� ����!");
						}
					} else {
						System.out.println("Password Ȯ�� �ٶ�!!!!");
					}
				} else {
					System.out.println("�� ��ȣ Ȯ�� �ٶ�!!!!");
				}
			} else if (select == 5) {
				System.out.print("�۹�ȣ �Է� : ");
				int board_num = sc.nextInt();
				int result = service.deleteBoard(board_num);
				if (result == 1) {
					System.out.println("�� ���� ����!");
				} else {
					System.out.println("�� ���� ����!");
				}
			} else if (select == 6) {
				System.out.print("�۹�ȣ �Է� : ");
				int board_num = sc.nextInt();
				if (service.selectBoard(board_num) != null) {
					System.out.print("��й�ȣ : ");
					String pw = sc.next();
					System.out.print("�ۼ��� : ");
					String name = sc.next();
					System.out.print("���� : ");
					sc.nextLine();
					String title = sc.nextLine();
					System.out.print("���� : ");
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
						System.out.println("��� �ۼ� ����!");
					} else {
						System.out.println("��� �ۼ� ����!");
					}
				} else {
					System.out.println("�� ��ȣ Ȯ�� �ٶ�!!!!");
				}
			}
		}
		System.out.println("--�ܼ� �Խ��� ���α׷� ����--");
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
