<%-- 
    Document   : add
    Created on : Oct 28, 2015, 12:59:48 PM
    Author     : Bryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a New Friend</title>
    </head>
    <body>
        <h1>Add a New Friend</h1>
        
        <form name="addForm" action="addFriend" method="get">
            <label>First Name:</label>
            <input type="text" name="first name" value=""/>
            <br>
            <label>Last Name:</label>
            <input type="text" name="last name" value=""/>
            <br>
            <label>Number:</label>
            <input type="text" name="number" value=""/>
            <br>
            <label>Position:</label>
            <input type="text" name="position" value=""/>
            <input type="submit" name="submit" value="Submit"/>
      
        
        </form>
    </body>
</html>
