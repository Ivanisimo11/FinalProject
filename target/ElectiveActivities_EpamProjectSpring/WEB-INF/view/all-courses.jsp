<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Courses</title>
</head>
<body>
<h3>All Courses</h3>
<br><br>
<table>
    <tr>
        <th>Name</th>
        <th>studyHours</th>
    </tr>
    <c:forEach var="course" items="${allCourses}">

<%--        <c:url var="updateButton" value="/updateInfo">--%>
<%--            <c:param name="empId" value="${course.id}"/>--%>
<%--        </c:url>--%>
<%--        <c:url var="deleteButton" value="/deleteCourse">--%>
<%--            <c:param name="empId" value="${course.id}"/>--%>
<%--        </c:url>--%>

        <tr>
            <td>${course.name}</td>
            <td>${course.study_hours}</td>
<%--            <td>--%>
<%--                <input type="button" value="Update"--%>
<%--                       onclick="window.location.href = '${updateButton}'">--%>
<%--                <input type="button" value="Delete"--%>
<%--                       onclick="window.location.href = '${deleteButton}'">--%>
<%--            </td>--%>
        </tr>
    </c:forEach>
</table>

<br><br>
<input type="button" value="Add"
       onclick="window.location.href = 'addNewCourse'"
/>
</body>
</html>