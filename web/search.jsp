
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="mystyle.css">
        <title>Search Players</title>
    </head>
    <body>
        <h1>Search Players by Last Name</h1>
        <form name="searchForm" action="search" methdo="get">
            
            <input type="text" name="searchVal" value="" />
            
            <br>
            
            <input type="submit" name="submt" value="Search"/> 
            
            
        </form>
    </body>
</html>
