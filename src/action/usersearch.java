package action;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import baseclass.*;
public class usersearch {
	public List readFirstTitle(){
	List<authorinfo> list =new ArrayList<authorinfo>();
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
		String sql="select * from authors";
		psmt=con.createStatement();
		rs=psmt.executeQuery(sql);
		while(rs.next())
		{
			String authorname=rs.getString("authorname");
			String age=rs.getString("age");
			String wherefrom=rs.getString("wherefrom");
			String bookindex=rs.getString("bookindex");
			authorinfo tl=new authorinfo(bookindex,authorname,age,wherefrom);
			list.add(tl);
		}
	}catch (Exception e) {
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
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	return list;

	}
}
