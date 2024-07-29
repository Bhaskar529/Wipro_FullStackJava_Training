<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h1{
		background-color: purple;
		text-align:center;
		color:Yellow;
		font-size: 40px;
	}
</style>
</head>
<body>
	<h1>Check Given number is even or odd</h1>
	<form target="_blank" method=post>
		<h3>Enter a number :</h3>&nbsp&nbsp<input  size="20" type="text" placeholder="Ex:1,2,3..." name="number"/>&nbsp&nbsp
		<input type = "submit"/>
	</form><br><br>
	<%
		if(request.getParameter("number")!=null){
			String string=request.getParameter("number");
			int number=Integer.parseInt(string);
			if(number%2==0)
				out.println("Given number is Even");
			else
				out.println("Given number is Odd");
		}
	%>
	
</body>
</html>