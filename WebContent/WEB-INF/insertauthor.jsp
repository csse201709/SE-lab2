<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ALL BOOKS</title>
</head>
<body>
    <s:form  action="insertauthor"  method="post">
        <s:textfield name="bookindex" label="输入图书索引"></s:textfield>        
        <s:textfield name="authorname" label="作者书名"></s:textfield>
        <s:textfield name="age"  label="年龄"></s:textfield>
        <s:textfield name="wherefrom"  label="作者地区"></s:textfield>

        <s:submit value="提交"></s:submit>
    </s:form>
        <s:form action="returnfirstpage" method="post">
        <s:submit value="返回首页"></s:submit>
    </s:form>
</body>
</html>