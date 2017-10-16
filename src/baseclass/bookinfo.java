package baseclass;

import mysqlcon.sqlconnect;
import java.sql.*;
public class bookinfo {
    private String ISBNcode;
    private String bookname;
    private String producename;
    private String outtime;
    private String price;
    private String bookindex;
    
    public String getISBNcode() {
        return ISBNcode;
    }
    public void setISBNcode(String ISBNcode) {
        this.ISBNcode = ISBNcode;
    }
    
    public String getbookname() {
        return bookname;
    }
    public void setbookname(String bookname) {
        this.bookname = bookname;
    }
    
    public String getproducename() {
        return producename;
    }
    public void setproducename(String producename) {
        this.producename = producename;
    }
    
    public String getouttime() {
        return outtime;
    }
    public void setouttime(String outtime) {
        this.outtime = outtime;
    }
    
    public String getprice() {
        return price;
    }
    public void setprice(String price) {
        this.price = price;
    }
    
    public String getbookindex() {
        return bookindex;
    }
    public void setbookindex(String bookindex) {
        this.bookindex = bookindex;
    }
    
    public  bookinfo(String ISBNcode,String bookname,String producename, String outtime, String price,String bookindex )
    {
    	super();
    	this.ISBNcode = ISBNcode;
    	this.bookname = bookname;
    	this.producename = producename;
    	this.outtime = outtime;
    	this.price = price;
    	this.bookindex = bookindex;
    	
    	
    }

}