<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<title>Authentication Page</title>
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
			<div class="left-column">
				<div id="loginBox">
<s:form  action="login" method="POST" name="login" >
<div id="loginFormFields" class="clearfix">
  <ul>    
      <li class="clearfix">
   
      <label for="email">Email:</label><br/>
      <input type="text" name="Email" id="user_id" size="25"/>
      
      <br/><br/>
      <label for="password">Password:</label>
      <br/>
      <input size="25" name="Pwd" id="password" type="password" autocomplete="off"/>
    <br/><br/> 
      <input type="submit" value="Login" name="login" class="submit button-1"/>
  </ul>
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