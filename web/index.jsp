
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="mystyle.css">
        <title>Blackhawks Players</title>
    </head>
    <body>
        <div class="wrap">  <!--div to hold all other divs -->
                <%@ include file ="includes/header.jsp" %>
        
        
                <%@ include file ="includes/menu.jsp" %>
        
        <div class="main">
            <h1>Chicago Blackhawks Player Database</h1>
        
        <a href="read">View All Players</a>
        <br><br>
        <a href="search.jsp">Search Players</a>
        </div> <!--Closes main div-->
        <%@ include file ="includes/footer.jsp" %>
        
        </div>
      </div> <!-- close the wrap div -->      
    </body>
</html>
