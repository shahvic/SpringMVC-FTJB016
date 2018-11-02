<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Model Test

<%
String myname =(String)request.getAttribute("name"); 

%>


Id:
<%= request.getAttribute("id")%>
Name:
<%= myname%>

${name}
</body>
</html>