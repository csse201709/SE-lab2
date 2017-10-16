package action;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import baseclass.*;
public class authorsearch {
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
		String sql="select * from books";
		psmt=con.createStatement();
		rs=psmt.executeQuery(sql);
		while(rs.next())
		{
			String ISBNcode=rs.getString("ISBNcode");
			String bookname=rs.getString("bookname");
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
	public List authorlist(){
		List<authorinfo> listauthorinfo =new ArrayList<authorinfo>();
		Connection conauthorinfo=null;
		Statement psmtauthorinfo=null;
		ResultSet rsauthorinfo=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			 e.printStackTrace();
		}
		try {
			conauthorinfo=DriverManager.getConnection("jdbc:mysql://localhost:3306/setest2","root","root");
			String sqlauthorinfo="select * from authors";
			psmtauthorinfo=conauthorinfo.createStatement();
			rsauthorinfo=psmtauthorinfo.executeQuery(sqlauthorinfo);
			while(rsauthorinfo.next())
			{
				String authorname=rsauthorinfo.getString("authorname");
				String age=rsauthorinfo.getString("age");
				String wherefrom=rsauthorinfo.getString("wherefrom");
				String bookindexauthorinfo=rsauthorinfo.getString("bookindex");
				authorinfo tlauthorinfo=new authorinfo(bookindexauthorinfo,authorname,age,wherefrom);
				listauthorinfo.add(tlauthorinfo);
			}
		}catch (SQLException e) {
			 e.printStackTrace();
		}finally
		{
			try {
				 if(rsauthorinfo!=null)
				 {
					 rsauthorinfo.close(); 
				 }
				 if(psmtauthorinfo!=null)
				 {
					 psmtauthorinfo.close();
				 }
				 if(conauthorinfo!=null)
				 {
					 conauthorinfo.close();
				 }
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return listauthorinfo;

		}
}
