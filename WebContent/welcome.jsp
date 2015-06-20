<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<title>Welcome</title>
</head>
<body>
welcome
<s:form action="next" method="post">
<input type="submit" value="next">
<s:token />
</s:form>
 
 
 <s:form action="logout" method="post">

<input type="submit" value="logout">
<s:token />

</s:form>


</body>

</html>