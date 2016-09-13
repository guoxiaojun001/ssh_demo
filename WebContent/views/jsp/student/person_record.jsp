<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>personRecord</title>
</head>
<body>
	<h2>关联查询结果</h2>
	
	${hello}
	${xmqq}

	<h2>${personRecord}</h2>

	<h2>${personRecord.name }</h2>
	<h2>${personRecord.age }</h2>

	<h2>${personRecord.msg }</h2>
	<h2>${personRecord.score }</h2>

</body>
</html>