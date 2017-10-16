<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body >
    <s:form action="turntoinsertauthor" method="post">
        <s:submit value="增加作者"></s:submit>
    </s:form>
    
    <s:form action="turntoaddbook" method="post">
        <s:submit value="增加书籍"></s:submit>
    </s:form>   
     
    <s:form action="turntodeletebook" method="post">
        <s:submit value="删除书籍"></s:submit>
    </s:form>    
        <s:form action="turntoupdatabook" method="post">
        <s:submit value="更新书籍"></s:submit>
    </s:form>   
     
    <s:form action="turntoauthorsearch" method="post">
        <s:submit value="查找作者"></s:submit>
    </s:form>   
     
    <s:form action="turntodisplayall" method="post">
        <s:submit value="展示全部书籍"></s:submit>
    </s:form> 
    
    <s:form action="turntousersearch" method="post">
        <s:submit value="输出全部作者"></s:submit>
    </s:form>                
</body>
</html>
