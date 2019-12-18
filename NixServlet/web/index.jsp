<%-- 
    Document   : index
    Created on : Dec 11, 2019, 4:49:48 PM
    Author     : Nick Hammond
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nix Servlet</title>
    </head>
    <body>
        <h1>Nix Servlet</h1>
        <div>Fill out the following fields:</div>
        <form action="NixServlet" method="post">
            <input type="text" name="title" placeholder="Title">
            <input type="text" name="body" placeholder="Note">
            <input type="submit" value="Enter">
        </form>
    </body>
</html>
