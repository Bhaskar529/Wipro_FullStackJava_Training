<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h1{
		background-color: blue;
		text-align:center;
		color: red;
		font-size: 40px;
	}
</style>
</head>
<body>
	<h1>Page Directive</h1>
	<img src="jsp.jpeg" height="300px"/><br><br>
	<%
		Date date=new Date();
	%>
	<table border="1">
		<tr>
			<td>Current Date and Time is : </td>
			<td><%=date %>
		</tr>
	</table>

</body>
</html>