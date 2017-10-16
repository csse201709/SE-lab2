package action;

import mysqlcon.sqlconnect;

public class updatabook {
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
    
    public String updata_excute()
    {
    	sqlconnect mycon = new sqlconnect();
    String update = "UPDATE "+"books"+" SET ISBNcode='"+getISBNcode()+"' ,bookindex='"+getbookindex()+"' ,bookname='"+getbookname()+"' ,producename='"+getproducename()+"' ,outtime='"+getouttime()+"' ,price='"+getprice()+"'" ;
    mycon.executeUpdate(update);
    return "SUCCESS";    
    }

}