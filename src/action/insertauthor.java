package action;

import mysqlcon.sqlconnect;

public class insertauthor {
    private String bookindex;//此处名称应与jsp表单名一致
    private String authorname;
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
    public void setwherefrom(String wherefrom) {
        this.wherefrom = wherefrom;
    }
    
    
    public String excute()
    {
    	sqlconnect mycon = new sqlconnect();
        String insert = "insert into authors values('"+getbookindex()+"','"+getauthorname()+"','"+getage()+"','"+getwherefrom()+"');";
        mycon.executeUpdate(insert);
        return "SUCCESS";
    }

}