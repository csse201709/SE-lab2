<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register in</title>
</head>
<body>
    <s:form  action="updatabook"  method="post">
        <s:textfield name="ISBNcode" label="输入ISBN"></s:textfield>
        <s:textfield name="bookindex" label="输入图书索引"></s:textfield>        
        <s:textfield name="bookname" label="输入书名"></s:textfield>
        <s:textfield name="producename"  label="输入出版公司"></s:textfield>
        <s:textfield name="outtime"  label="输入出版日期"></s:textfield>
        <s:textfield name="price" label="输入价格"></s:textfield>
        <s:submit value="增加书目"></s:submit>
            </s:form>
    <s:form action="returnfirstpage" method="post">
        <s:submit value="返回首页"></s:submit>
    </s:form>
</body>
</html>