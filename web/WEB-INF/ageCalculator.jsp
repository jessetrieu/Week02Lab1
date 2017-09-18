<%-- 
    Document   : ageCalculator
    Created on : Sep 18, 2017, 8:46:54 AM
    Author     : 579957
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week02Lab1</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <div>
        <form action="AgeCalculator" method="GET">
        Enter your current age: <input type="text" name="age" value="${age}">
        <input type="submit" value="Age Next Birthday">
        </form>
        </div>
        ${errorMessage}
        ${ageNextYear}
    </body>
</html>
