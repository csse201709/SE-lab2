<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="baseclass.bookinfo,action.displayall"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ALL BOOKS</title>
</head>
<body>
  <table border="1">
      <tr>
          <td>ISBNcode</td>
          <td>bookname</td>
          <td>producename</td>
          <td>outtime</td>
          <td>price</td>
          <td>bookindex</td>
      </tr>
        <%
        displayall dao=new displayall();
        List<bookinfo> list =dao.readFirstTitle();    
           for(bookinfo tl:list)
           {%>
          <tr>
              <td><%=tl.getISBNcode() %></td>
              <td><%=tl.getbookname() %></td>
              <td><%=tl.getproducename() %></td>
              <td><%=tl.getouttime() %></td>
              <td><%=tl.getprice() %>></td>
              <td><%=tl.getbookindex() %></td>
          </tr>
            <%}
       %>
  </table>
        <s:form action="returnfirstpage" method="post">
        <s:submit value="返回首页"></s:submit>
    </s:form>
</body>
</html>