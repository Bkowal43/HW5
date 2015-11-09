/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Players;

/**
 *
 * @author Bryan
 */
public class SearchQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public SearchQuery() throws ClassNotFoundException, SQLException{
        try {
            Properties props = new Properties();
            InputStream instr = getClass().getResourceAsStream("dbConn.properties");
            props.load(instr);
            instr.close();
            
            String driver= props.getProperty("driver.name");
            String url = props.getProperty("server.name");
            String username= props.getProperty("user.name");
            String passwd= props.getProperty("user.password");
            
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
   }
    
    public void doSearch(String lastName) throws SQLException{
        
        String query= "SELECT * FROM BLACKHAWKS_PLAYERS WHERE UPPER(lastName) LIKE ?";
        
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, "%" + lastName.toUpperCase() + "%");
        this.results=ps.executeQuery();
    }    
        
    public String getHTMLTable() throws SQLException{
        
       String table ="";
        table +="<table>";
        table+="<tr>";
        table +="<th>ID</th>";
        table +="<th>First Name</th>";
        table +="<th>Last Name</th>";
        table +="<th>Number</th>";
        table +="<th>Position</th>";
        table +="<th></th>";
        table +="</tr>";
                
        while(this.results.next()){
            Players player = new Players();
            player.setPlayerID(this.results.getInt("playerID"));
            player.setFirstName(this.results.getString("firstName"));
            player.setLastName(this.results.getString("lastName"));
            player.setPlayerNumber(this.results.getInt("playerNumber"));
            player.setPlayerPosition(this.results.getString("playerPosition"));
           
            table += "<tr>";
                table += "<td>";
                    table +=player.getPlayerID();
                table += "</td>";  
                
                table += "<td>";
                    table +=player.getFirstName();
                table += "</td>";
                
                table += "<td>";
                    table +=player.getLastName();
                table += "</td>";
                
                table += "<td>";
                    table +=player.getPlayerNumber();
                table += "</td>";
                
                table += "<td>";
                    table +=player.getPlayerPosition();
                table += "</td>";
                    
                table += "<td>";
                table += "<a href=update?playerID=" + player.getPlayerID()+ ">Update </a>"+ "<a href=delete?playerID=" + player.getPlayerID()+ "> Delete </a>";
                table += "</td>";
                        
                 table += "</tr>";       
                        }
                 table += "</table>";
                return table;
    }
    }
    
    
