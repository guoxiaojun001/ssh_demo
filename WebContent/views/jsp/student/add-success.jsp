<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>students</title>
</head>
<body>
 	
 	<h3>add success</h3>
 	
	<table>
		<tr><td>ID</td><td>Name</td><td>Age</td></tr>
		<c:forEach items="${students }" var="s">
		<tr><td>${s.id}</td><td>${s.name}</td><td>${s.age}</td></tr>
		</c:forEach>
	</table>
</body>
</html>