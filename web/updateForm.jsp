
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "model.Players"%>
<% Players player = (Players) request.getAttribute("player"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="mystyle.css">
        <title>Update Player</title>
    </head>
    <body>
        <h1>Update A Player Record</h1>
        
        <form name="updateForm" action="updatePlayer" method="get">
            <fieldset>
            <label>Player ID:</label>
            <input type="text" name="id" value="<%= player.getPlayerID() %>"readonly/>
            <br>
            <label>First Name:</label>
            <input type="text" name="first name" value="<%= player.getFirstName() %>"/>
            <br>
            <label>Last Name:</label>
            <input type="text" name="last name" value="<%= player.getLastName() %>"/>
            <br>
            <label>Number:</label>
            <input type="int" name="number" value="<%= player.getPlayerNumber() %>"/>
            <br>
            <label>Position:</label>
            <input type="text" name="position" value="<%= player.getPlayerPosition() %>"/>
            <br>
            <input type="submit" name="submit" value="Clear"/>
            <input type="submit" name="submit" value="Update"/>
   
        </form>
    </body>
</html>
