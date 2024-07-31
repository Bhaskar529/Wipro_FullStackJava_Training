<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	h1{
		background-color: blue;
		text-align:center;
		color: red;
		font-size: 40px;
	}
</style>
<body>
	<h1>Include Directive</h1>
	<img src="jsp.jpeg" height="300px"/><br/>
	<%!
		int n=10;
	String name="My name is Varun";
	String getString(){
		return "I am learning jsp";
	}
	%>
	<table border="1">
	<tr>
	<td>Integer value</td>
	<td><%=n %></td>
	</tr>
	<tr>
		<td>String value</td>
		<td><%=name %></td>
	</tr>
	<tr>
		<td>Data from a function</td>
		<td><%=getString() %>
	</tr>
	</table>
	<%@ include file="test_include_Directive.html" %>
</body>
</html>