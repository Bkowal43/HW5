
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="mystyle.css">
        <title>JSP Page</title>
    </head>
    
    <% String table= (String) request.getAttribute("table"); %>
    
    
    
        <h1>Blackhawks Players</h1>
        <table> 
       <%= table %>
        </table>
        
        <br><br>
        <a href ="add"> Add A New Player </a>
    
</html>
