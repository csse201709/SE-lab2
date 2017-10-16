package action;

import mysqlcon.sqlconnect;

public class deletebook {
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
    String Table_name="books";
    public String delete_excute()
    {
    sqlconnect mycon = new sqlconnect();
    String delete= "delete from "+Table_name+" where bookindex='"+getbookindex()+"';";
    mycon.executeUpdate(delete);
    return "SUCCESS";
}
}