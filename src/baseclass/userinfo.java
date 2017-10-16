package baseclass;

import mysqlcon.sqlconnect;
import java.sql.*;
public class userinfo {
    private String name;
    private String password;

    
    public  String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    
    public String getpassword() {
        return password;
    }
    public void setpassword(String password) {
        this.password = password;
    }
   
    public  userinfo(String name,String password)
    {
    	super();
    	this.name = name;
    	this.password = password;

    }

}