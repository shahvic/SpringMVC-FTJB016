<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
  
 <html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${name}

<% String data = (String)request.getAttribute("name");
System.out.println("data===>"+data);
%>
</body>
</html>