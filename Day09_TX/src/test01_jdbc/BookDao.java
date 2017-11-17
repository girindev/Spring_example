package test01_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import vo.BookVO;

public class BookDao {
	private Connection con;
	private PreparedStatement pstmt;

	public BookDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void makeConnection() {
		String url = "jdbc:mysql://localhost/spring";
		String id = "root";
		String pw = "sds1501";
		try {
			con = DriverManager.getConnection(url, id, pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int insert(BookVO book) throws SQLException {
		String sql = "Insert into book (title, writer, price, publisher) " + "values (?,?,?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, book.getTitle());
		pstmt.setString(2, book.getWriter());
		pstmt.setInt(3, book.getPrice());
		pstmt.setString(4, book.getPublisher());

		return pstmt.executeUpdate();
	}

	public void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void startTX() throws SQLException {
		con.setAutoCommit(false);
	}

	public void commitTX() throws SQLException {
		con.commit();
	}

	public void rollbackTX(){
		try {
			con.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
