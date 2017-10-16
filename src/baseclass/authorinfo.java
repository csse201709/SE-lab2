package baseclass;
import mysqlcon.sqlconnect;
import java.sql.*;
public class authorinfo {
    private String bookindex;
    private String authorname;//此处名称应与jsp表单名一致
    private String age;
    private String wherefrom;
    public String getbookindex() {
        return bookindex;
    }
    public void setbookindex(String bookindex) {
        this.bookindex = bookindex;
    }    
    public String getauthorname() {
        return authorname;
    }
    public void setauthorname(String authorname) {
        this.authorname = authorname;
    }
    
    public String getage() {
        return age;
    }
    public void setage(String age) {
        this.age = age;
    }
    
    public String getwherefrom() {
        return wherefrom;
    }
    public void sewherefrom(String wherefrom) {
        this.wherefrom = wherefrom;
    }

    
    public  authorinfo(String bookindex,String authorname,String age,String wherefrom )
    {
    	super();
    	this.bookindex = bookindex;
    	this.authorname = authorname;
    	this.age = age;
    	this.wherefrom = wherefrom;
    }

}