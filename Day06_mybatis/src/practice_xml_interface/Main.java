package practice_xml_interface;

import vo.MartVO;

public class Main {

	public static void main(String[] args) {
		MartDao dao = new MartDao();
		MartVO mart = new MartVO();
		mart.setType("½ÄÇ°");
		mart.setCount(10);
		mart.setName("Á¶¸®Æþ");
		mart.setPrice(1000);
		int result = 0;
		result = dao.insert(mart);
		System.out.println(result);
		for (MartVO m : dao.selectList()) {
			System.out.println(m);
		}
	}
}
