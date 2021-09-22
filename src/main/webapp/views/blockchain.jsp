<%@ page import="app.entities.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 22.09.2021
  Time: 0:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students with knowledge of blockchain</title>
</head>
<body>
<h1>Students with knowledge of blockchain</h1>
<ul>
    <%
        List<Student> students = (List<Student>) request.getAttribute("studentList");

        if (students != null && !students.isEmpty()) {
            out.println("<ui>");
            for (Student s : students) {
                out.println("<li>" + s.getName() + "</li>");
                out.println("<li>" + s.getMark() + "</li>");
                out.println("<li>" + s.isBlockChainKnown() + "</li>");
                out.println("<li>" + "---------------------------------------" + "</li>");
            }
            out.println("<ui>");
        } else out.println("<p>There are no students yet!</p>");
    %>
</ul>
</body>
</html>
