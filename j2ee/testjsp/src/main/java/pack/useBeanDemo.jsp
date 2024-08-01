<%@ page import="pack.testBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<style>
		h1{
		background-color:lightblue;
		text-align: center;
		font-size:70px;
		}
	</style>
	
	<h1>Use Bean....</h1>
	<img src="jsp1.jpg" height=300px/><br><br>
	
	<jsp:useBean id="testBean" class="pack.testBean">
	<jsp:setProperty name="testBean" property="name" value="Varun"/>
	</jsp:useBean>
	Value set in name is:<jsp:getProperty name="testBean" property="name" />
</body>
</html>