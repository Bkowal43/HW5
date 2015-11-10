
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="mystyle.css">
        <title>Search Players</title>
    </head>
    <body>
        <div class="wrap">  <!--div to hold all other divs -->
        <%@ include file ="includes/header.jsp" %>
        
        
        <%@ include file ="includes/menu.jsp" %>
        <h1>Search Players by Last Name</h1>
        <form name="searchForm" action="search" methdo="get">
            
            <input type="text" name="searchVal" value="" />
            
            <br>
            
            <input type="submit" name="submt" value="Search"/> 
            
            
        </form>
        <%@ include file ="includes/footer.jsp" %>
        
         </div>
         </div> <!-- close the wrap div -->  
    </body>
</html>
