package vo;

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
