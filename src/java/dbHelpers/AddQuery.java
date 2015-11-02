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
public class AddQuery {
    
    private Connection conn;
    
    public AddQuery() throws IOException, ClassNotFoundException, SQLException{
        
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
    
   }
    
    public void doAdd (Players player){
        try {
            String query = "INSERT INTO  BLACKHAWKS_PLAYERS (firstName, lastName, playerNumber, playerPosition) VALUES (?,?,?,?)";
            
            PreparedStatement ps= conn.prepareStatement(query);
            
            ps.setString(1, player.getFirstName());
            ps.setString(2, player.getLastName());
            ps.setInt(3, player.getPlayerNumber());
            ps.setString(4, player.getPlayerPosition());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
      
    }
    

