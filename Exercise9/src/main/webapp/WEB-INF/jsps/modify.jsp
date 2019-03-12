<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Modify Value</h1>
	
	<form action="/modify/${cartoon.id}" method="post">
	ID: <input type="text" id="id" name="id" value="${cartoon.id }" disabled /><br />
	Show: <input type="text" id="show" name="show" value="${cartoon.show }" /><br />
	Character: <input type="text" id="character" name="character" value="${cartoon.character }" /><br />
	
	<input type="submit" value="Submit" />
	</form>
</body>
</html>