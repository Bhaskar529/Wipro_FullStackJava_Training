<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h1{
		background-color: yellow;
		text-align:center;
		color:red;
		font-size: 50px;
	}
</style>
</head>
<body>
	<h1>DeclarativeTagDemo...</h1>
	<%!
		int factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	}
	
	%>
	<%
		int result=factorial(6);
		out.println("Factorial is :"+result);
	%>
</body>
</html>