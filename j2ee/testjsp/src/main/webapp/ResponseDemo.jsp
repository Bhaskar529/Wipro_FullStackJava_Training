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
		color: yellow;
		font-size: 40px;
	}
	button{
		background-color: pink;
		padding: 15px 32px;
		font-size:16px;
		margin: 4px 2px;
		cursor:pointer;
	}
</style>
</head>
<body>
	<h1>Response implicit Demo</h1>
	<center>
	<img src="jsp.jpeg" height=300px weidth=300px title="searchengine">
	<form>
	<h3>Enter a string to search :</h3> 
	&nbsp&nbsp&nbsp<input type="text" name="searchString" size="30px"  placeholder="Ex.jsp,...."/><br><br><br>
	&nbsp&nbsp&nbsp<button   type="submit">Search</button>
	</center>
	</form>
	<%
		String searchString = request.getParameter("searchString");
		if(searchString!=null){
			String url="http://www.google.co.in/search?q="+searchString;
			response.sendRedirect(url);
		}
	%>
	
</body>
</html>