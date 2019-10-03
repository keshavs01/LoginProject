<%-- <%@page import="com.krawler.Student"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Videos Page</title>
</head>
<body>
	<%
		if(session.getAttribute("ssid") == null){
			response.sendRedirect("login.jsp");
		}
	
// 		Student obj = (Student)session.getAttribute("student");
// 		out.print(obj);
	%>
	<img src="https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png" alt="Trulli">
</body>
</html>