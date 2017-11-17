package test01_jdbc;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.BookVO;
//* �ڹ� �����ͺ��̽� ���α׷��� �Ŵ���
//1. ����̹� �ε�
//2. Ŀ�ؼ� ����
//3. SQL ��ɾ� �ۼ�
//4. PreparedStatement�� �� ����
//5. ��������
//6. ����� ����
//7. �ڿ� �ݳ�
public class BookDao {
    public int insertBook(BookVO book) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int result = 0;
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection
            ("jdbc:mysql://127.0.0.1/spring", "root", "sds1501");
         
            String sql = "INSERT INTO BOOK"
                    + "(TITLE,PRICE,PUBLISHER,WRITER)"
                    + "VALUES(?,?,?,?)";
             
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, book.getTitle());
            pstmt.setInt(2, book.getPrice());
            pstmt.setString(3, book.getPublisher());
            pstmt.setString(4, book.getWriter());
             
            result = pstmt.executeUpdate(); // SQL ����
        } catch (ClassNotFoundException e) {
            System.out.println("����̹� �ε� ����");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }           
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
     
    public List<BookVO> selectAll(){
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<BookVO> resultList = new ArrayList<>();
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection
            ("jdbc:mysql://127.0.0.1/spring", "root", "sds1501");
         
            String sql = "SELECT BOOK_NUM,TITLE,"
                    + "PRICE,PUBLISHER,WRITER FROM BOOK";
             
            pstmt = con.prepareStatement(sql);
                         
            rs = pstmt.executeQuery(); // SQL ����
             
            while(rs.next()) {
                BookVO b = new BookVO();
                b.setBookNum(rs.getInt(1));
                b.setTitle(rs.getString(2));
                b.setPrice(rs.getInt(3));
                b.setPublisher(rs.getString(4));
                b.setWriter(rs.getString(5));
                 
                resultList.add(b);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("����̹� �ε� ����");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }   
            if(pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }           
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultList;
    }
}