<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/todo/register" method="post">
        <div>
            Title:<input type="text" name="title">
        </div>
        <div>
            DueDate:<input type="date" name="dueDate" value="2024-04-09">
        </div>
        <div>
            Finished:<input type="checkbox" name="finished">
        </div>
        <div>
            <button type="submit">Register</button>
        </div>
    </form>
</body>
</html>
