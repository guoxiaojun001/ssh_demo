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
 	<s:form action="findPersonRecord" namespace="/person" method="post">
		<s:label value="外键查询："></s:label>
		<s:textfield name="key"></s:textfield>
		<s:submit value="查询"></s:submit>
		<s:fielderror value="error:"></s:fielderror> 
		
		
		<!--  外键查询：<input type="text" name="key"> <br>
  		查询：  <input type="submit" value="提交">  -->
	</s:form>
	
</body>
</html>