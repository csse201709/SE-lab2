package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import baseclass.bookinfo;
import action.authorsearch;
public class authorsearchdisplay {
	private String name;

	public List readFirstTitle(){
		List<bookinfo> list =new ArrayList<bookinfo>();
		Connection con=null;
		Statement psmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			 e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/setest2","root","root");
			String sql="select '"+"' from books";
			psmt=con.createStatement();
			rs=psmt.executeQuery(sql);
			while(rs.next())
			{
				String ISBNcode=rs.getString("ISBNcode");
				String bookname=rs.getString("bookname");
				String authorname=rs.getString("authorname");
				String producename=rs.getString("producename");
				String outtime=rs.getString("outtime");
				String price=rs.getString("price");
				String bookindex=rs.getString("bookindex");
				bookinfo tl=new bookinfo(ISBNcode,bookname,producename,outtime,price,bookindex);
				list.add(tl);
			}
		}catch (SQLException e) {
			 e.printStackTrace();
		}finally
		{
			try {
				 if(rs!=null)
				 {
					 rs.close(); 
				 }
				 if(psmt!=null)
				 {
					 psmt.close();
				 }
				 if(con!=null)
				 {
					 con.close();
				 }
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;

		}
}
