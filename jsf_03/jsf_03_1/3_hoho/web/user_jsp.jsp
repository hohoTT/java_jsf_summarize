<%-- 
    Document   : user_jsp
    Created on : 2015-11-13, 8:19:54
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <hr>
        <form>
            <input type="text" name="name" value="<%= request.getParameter("name") %>" /><br>
            <input type="text" name="age" value="<%= request.getParameter("name") %>" /><br>
            <input type="submit"/>
        </form>
    </body>
</html>
