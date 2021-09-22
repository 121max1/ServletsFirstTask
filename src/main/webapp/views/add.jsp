<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 22.09.2021
  Time: 0:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
    <form method="post">
        <label>Name:
            <input type="text" name="name"><br />
        </label>

        <label>Mark:
            <input type="number" name="mark"><br />
        </label>

        <label>Knowledge of blockchain
            <select name = "blockchain">
                <option>True</option>
                <option>False</option>
            </select>
        </label>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
