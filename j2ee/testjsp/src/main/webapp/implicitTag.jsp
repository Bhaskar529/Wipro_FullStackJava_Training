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
		font-size: 70px;
	}
</style>
</head>
<body>
	<h1>Request Implicit Tag...</h1>
	<h2>Displaying name using request Implicit object</h2><br><br>
	<form>
		<label>Enter your name :</label>&nbsp &nbsp
		<input type="text" placeholder=Ex.John... name="name"/>&nbsp &nbsp
		<input type="submit">
	</form>
	<br><br>
	
	<%
		String name=request.getParameter("name");
		if(name!=null)
			out.println("Hello welcome "+name);
	%>

</body>
</html>