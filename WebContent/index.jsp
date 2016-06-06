<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h4>首页面111</h4>
	<a href="helloworld">Hello World</a>
	<br><br>
	<form action="helloworld" method="post" >
		<input type="text" name="age">
		<input type="text" name="sex">
		<input type="text" name="higth">
		<input type="submit" value ="POJO Submit" >
	</form>
	<br>
	<a href="testRequestHeader">Test RequestHeader</a>
	<br><br>
	<form action="testRestPut/1144" method="post">
		<input type="hidden" name="_method" value="PUT"/>
		<input type="submit" value="TestRest PUT"/>
	</form>
	<br><br>
	<form action="testModelAttribute" method="Post">
		<input type="hidden" name="id" value="6090193"/>
		age: <input type="text" name="age" value="12"/>
		<br>
		sex: <input type="text" name="sex" value="男"/>
		<br>
		higth: <input type="text" name="higth" value="175"/>
		<br>
		<input type="submit" value="Submit"/>
	</form>
	<br><br>
</body>
</html>