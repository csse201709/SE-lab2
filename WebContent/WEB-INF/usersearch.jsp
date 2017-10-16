<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="baseclass.authorinfo,action.usersearch"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ALL authors</title>
</head>
<body>
    <table border="1">
      <tr>
          <td>bookindex</td>
          <td>authorname</td>
          <td>age</td>
          <td>wherefrom</td>
      </tr>
        <%
           usersearch dao=new usersearch();
           List<authorinfo> list =dao.readFirstTitle();    
           for(authorinfo tl:list)
           {%>
          <tr>
              <td><%=tl.getbookindex() %></td>
              <td><%=tl.getauthorname() %></td>
               <td><%=tl.getage() %></td>
              <td><%=tl.getwherefrom() %></td>
          </tr>
            <%}
       %>
  </table>
      <s:form action="returnfirstpage" method="post">
        <s:submit value="返回首页"></s:submit>
    </s:form>
</body>
</html>