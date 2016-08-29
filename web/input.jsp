<%-- 
    Document   : input
    Created on : Aug 29, 2016, 4:31:53 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Member</title>
        <style>
            body{
                text-align: center;
            }
            div{
                color: green;
            }
        </style>
    </head>
    <body>
        <div><h1>ค้นหาสมาชิก</h1></div>
        <form action="InputControl" method="post">
            หมายเลขสมาชิก : <input type="text" name="IdSearch" value="" /> <input type="submit" value="ค้นหา" />
        </form>
    </body>
</html>
