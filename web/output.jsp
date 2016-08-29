<%-- 
    Document   : output
    Created on : Aug 29, 2016, 10:46:37 PM
    Author     : DUBBRIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="e" scope="page" class="model.Member" />
        ${id}<br/>
        ${name}<br/>
        ${password}<br/>
        ${email}
    </body>
</html>
