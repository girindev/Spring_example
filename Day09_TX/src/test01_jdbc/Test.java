package test01_jdbc;

public class Test {
	public static void main(String[] args) {
		BookService bs = new BookService();
		boolean result = bs.addBookSet();
		System.out.println(result);
	}
}
