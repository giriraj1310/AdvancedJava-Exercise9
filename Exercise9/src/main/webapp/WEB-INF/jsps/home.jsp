<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cartoon</title>
</head>
<body>
	<h1>Cartoon information</h1>

	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Show</th>
				<th>Character</th>
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${cartoon}" var="item">
				<tr>
					<td>${item.id }</td>
					<td>${item.show }</td>
					<td>${item.character }</td>
					<td><c:url value="/delete/${item.id }" var="delete"></c:url></td>
					<td><c:url value="/update/${item.id }" var="update"></c:url></td>
					<td><a href="${update }">Update</a></td>
					<td><a href="${delete }">Delete</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

</body>

</body>
</html>