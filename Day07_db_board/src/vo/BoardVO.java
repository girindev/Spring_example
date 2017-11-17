package vo;

public class BoardVO {
	private int write_num;
	private String write_date;
	private int review_cnt;
	private String writer;
	private String password;
	private String title;
	private String content;
	private int reply_num;
	
	/////////////////////////////////////
	public int getWrite_num() {
		return write_num;
	}
	public void setWrite_num(int write_num) {
		this.write_num = write_num;
	}
	public String getWrite_date() {
		return write_date;
	}
	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}
	public int getReview_cnt() {
		return review_cnt;
	}
	public void setReview_cnt(int review_cnt) {
		this.review_cnt = review_cnt;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getReply_num() {
		return reply_num;
	}
	public void setReply_num(int reply_num) {
		this.reply_num = reply_num;
	}
	@Override
	public String toString() {
		return "BoardVO [write_num=" + write_num + ", write_date=" + write_date + ", review_cnt=" + review_cnt
				+ ", writer=" + writer + ", password=" + password + ", title=" + title + ", content=" + content
				+ ", reply_num=" + reply_num + "]";
	}
	
}
