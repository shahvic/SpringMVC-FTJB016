<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


 <form:form modelAttribute="student" action="savestudent" method="post">
      <label >Name: </label>
      <form:input path="studentName"  />
      <br/>

      <label >Roll: </label>
      <form:input path="studentRollNum" />
      <br/>

      <label >Course: </label>
      <form:input path="studentCourse"  />
      <br/>

      <label for="address">Address: </label>
     <form:input path="studentAddress" />
      <br/>
      <input type="submit" value="Submit" />
    </form:form>

</body>
</html>