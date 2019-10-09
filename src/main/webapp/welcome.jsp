<%@page import="com.krawler.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<%
		if(session.getAttribute("ssid") == null){
			response.sendRedirect("login.jsp");
		}
		Student studentobj = (Student)session.getAttribute("user");
		out.print("Welcome " + studentobj.toString());
	%>
	
	<a href="Videos.jsp">Click for Videos</a>
</body>
</html>