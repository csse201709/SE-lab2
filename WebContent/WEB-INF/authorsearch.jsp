<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="baseclass.*,action.authorsearch"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search author</title>
</head>
<body>
	<form name="thisform"method="post">  
   <input type="text" name="authorname">   
   <input type="button" value="查询"onclick="sel()">  
  </form> 
<script language="javascript">  
 function sel(){  
     document.thisform.submit();  
}  
</script>    

        <%
        String authornametmp=request.getParameter("authorname"); 
        String authorindex=null;
        authorsearch dao=new authorsearch();
        List<bookinfo> listbook =dao.readFirstTitle(); 
        List<authorinfo> listauthorinfo =dao.authorlist(); 
           for(authorinfo tl:listauthorinfo)
           {
        	   if(tl.getauthorname().equals(authornametmp))
        	   {
        		   authorindex=tl.getbookindex();
        	   }
           }
           if(authorindex!=null)
           {
        	   %>
        	    <table border="1">
        	      <tr>
        	          <td>ISBNcode</td>
        	          <td>bookname</td>
        	          <td>producename</td>
        	          <td>outtime</td>
        	          <td>price</td>
        	          <td>bookindex</td>
        	      </tr>
        	       </table>
        	        <%
        	   for(bookinfo tlb:listbook)
        	   {
        		   if(tlb.getbookindex().equals(authorindex))
        		   {
        			   %>
        	           
        		          <tr>
        		              <td><%=tlb.getISBNcode() %></td>
        		              <td><%=tlb.getbookname() %></td>
        		              <td><%=tlb.getproducename() %></td>
        		              <td><%=tlb.getouttime() %></td>
        		              <td><%=tlb.getprice() %>></td>
        		              <td><%=tlb.getbookindex() %></td>
        		          </tr>
        		            <%
        		   }
        		   
        	   }
        	   
           }
           else{
        	   if(authornametmp!=null)
        	   {
            	   %>
            	   <td><%="作者不存在" %></td>
            	   <%
        	   }

           }
           
       %>
 
    <s:form action="returnfirstpage" method="post">
        <s:submit value="返回首页"></s:submit>
    </s:form>
</body>
</html>