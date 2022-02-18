<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Course Info</title>
</head>
<body>
<h3>Course Info</h3>
<br><br>
<form:form action="saveCourse" modelAttribute="course">

    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Study Hours <form:input path="study_hours"/>
    <br><br>
    <input type="submit" value="OK"/>

</form:form>
</body>
</html>