<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	h1{
		background-color: blue;
		text-align:center;
		color:red;
		font-size: 50px;
	}
</style>
</head>
<body>
		<h1>ScripletDemo....</h1>	
	<%
		for(int i=0;i<=10;i++){
			out.println(i+" ");
		}
		
	%>

</body>
</html>