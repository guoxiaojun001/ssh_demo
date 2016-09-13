<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>user</title>
</head>
<body>
 	<s:form action="doLogin" namespace="/user" method="post">
		<s:label value="姓名："></s:label>
		<s:textfield name="user.name"></s:textfield>
		<s:label value="密码："></s:label>
		<s:textfield name="user.pwd"></s:textfield>
		<s:submit value="登录"></s:submit><s:fielderror value="error:"></s:fielderror>
	</s:form>
	
</body>
</html>