package vo;
//public class BookVO {
//    private int book_num;
//    private String title;
//    private String writer;
//    private int price;
//    private String publisher;
//	public int getBook_num() {
//		return book_num;
//	}
//	public void setBook_num(int book_num) {
//		this.book_num = book_num;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getWriter() {
//		return writer;
//	}
//	public void setWriter(String writer) {
//		this.writer = writer;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public String getPublisher() {
//		return publisher;
//	}
//	public void setPublisher(String publisher) {
//		this.publisher = publisher;
//	}
//	@Override
//	public String toString() {
//		return "BookVO [book_num=" + book_num + ", title=" + title + ", writer=" + writer + ", price=" + price
//				+ ", publisher=" + publisher + "]";
//	}
//}
public class BookVO {
	private int jBookNum;
	private String jTitle;
	private String jWriter;
	private String jPublisher;
	private int jPrice;
	
	
	///////////////////////////
	public int getjBookNum() {
		return jBookNum;
	}
	public void setjBookNum(int jBookNum) {
		this.jBookNum = jBookNum;
	}
	public String getjTitle() {
		return jTitle;
	}
	public void setjTitle(String jTitle) {
		this.jTitle = jTitle;
	}
	public String getjWriter() {
		return jWriter;
	}
	public void setjWriter(String jWriter) {
		this.jWriter = jWriter;
	}
	public String getjPublisher() {
		return jPublisher;
	}
	public void setjPublisher(String jPublisher) {
		this.jPublisher = jPublisher;
	}
	public int getjPrice() {
		return jPrice;
	}
	public void setjPrice(int jPrice) {
		this.jPrice = jPrice;
	}
	@Override
	public String toString() {
		return "BookVO [jBookNum=" + jBookNum + ", jTitle=" + jTitle + ", jWriter=" + jWriter + ", jPublisher="
				+ jPublisher + ", jPrice=" + jPrice + "]";
	}
}
