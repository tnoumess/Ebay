<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<title>Registration Page</title>
</head>
<body class="login-page">
<noscript>
  <div class="receipt bad editmode">Please enable JavaScript in your browser for the Blackboard application to function.</div>
</noscript>
<br/><br/><br/><br/><br/><br/>
<div id="loginContainer">
<div class="container" class="container">
		<a href="index.jsp">		
		<img src="img/xtremlogo.GIF" class="loginLogo" border="0" height="150" width="500">
		</a>
<div class="loginWrapper">
  <div class="center">Create New Account</div>
  
  <hr>
		<div class="left-column">
			
				<div id="loginBox">
<s:form action="register" method="POST" name="register" >

<div id="loginFormFields" class="clearfix">
    <span class="clearfix">
         <label for="email">Email:</label><br/>
      
      <input type="text" name="Email" id="Email" size="25"/>
      <s:fielderror cssClass="errors" fieldName="email"/>
      <s:fielderror cssClass="errors" fieldName="email2"/>
      <s:fielderror cssClass="errors" fieldName="email3"/>
      <br/><br/>
      
      <label for="password">Password:</label><br/>
      <input size="25" name="Pwd" id="password" type="password" autocomplete="off"/>
      <s:fielderror cssClass="errors" fieldName="pwd"/>
      <s:fielderror cssClass="errors" fieldName="pwd2"/>
      <s:fielderror cssClass="errors" fieldName="pwd3"/>
      <br/> <br/>
      <label for="passwordc">Password Confirmation:</label> <br/>    
      <input size="25" name="PwdC" id="password" type="password" autocomplete="off"/>
      <s:fielderror cssClass="errors" fieldName="pwd"/>
      <s:fielderror cssClass="errors" fieldName="pwd2"/>
      <input size="25" name="Role" id="role" type="hidden" />
      <input size="25" name="Id" id="role" type="hidden" />
    <br/><br/>     
      <input type="submit" value="Submit" name="login" class="submit button-1"/>
     </span>  
  
</div>  
<s:token />
</s:form>
</div>
</div>

   <div class="right-column">
  some stuff

</div>
</div>
</div>
</div>

</body>
</html>