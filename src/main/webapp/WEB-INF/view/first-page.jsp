<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Course Info</title>
</head>
<body>
<br><br>
<center>
    <form:form action="saveStudent" modelAttribute="student">

        <form:hidden path="id"/>

        Name <form:input path="name"/><br>
        <form:errors path="name"/>
        <br>
        <br>
        Login<input type="text" name="login"><br>
        <form:errors path="login"/>
        <br>
        <br>
        Password<input type="password" name="password"><br>
        <form:errors path="password"/>
        <br>
        <br>
<%--        Repeat password<input type="password" name="password2">--%>
<%--        <br>--%>
<%--        <br>--%>

        <input type="submit" value="Register"/>

    </form:form>
</center>

</body>
</html>
