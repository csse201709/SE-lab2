package action;

import mysqlcon.sqlconnect;

public class addbook {
    private String ISBNcode;
    private String bookindex;
    private String bookname;
    private String producename;
    private String outtime;
    private String price;
    
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
    
    public String addbook_excute()
    {
    	sqlconnect mycon = new sqlconnect();
        String insert = "insert into books(ISBNcode,bookindex,bookname,producename,outtime,price) values('"+ getISBNcode()
        +"','"+getbookindex()+"','"+getbookname()+"','"+getproducename()+"','"+getouttime()+"','"+getprice()+"');";
        mycon.executeUpdate(insert);
        return "SUCCESS";
    }
//test for git
}