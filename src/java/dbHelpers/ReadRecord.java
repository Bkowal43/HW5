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
import model.Players;

/**
 *
 * @author Bryan
 */
public class ReadRecord {
    private Connection conn;
    private ResultSet results;
    private Players player= new Players();
    private int playerID;
    
    public ReadRecord(int playerID) throws IOException, ClassNotFoundException, SQLException{
    Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
    props.load(instr);
    instr.close();
   
    String driver= props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username= props.getProperty("user.name");
    String passwd= props.getProperty("user.password");
    
    this.playerID = playerID;
    
    
    Class.forName(driver);
    conn = DriverManager.getConnection(url, username, passwd);
    
   }
    
    public void doRead() throws SQLException {
    
        //set up a string to hold our query
        String query= "SELECT * FROM BLACKHAWKS_PLAYERS WHERE playerID = ?";
   
        //create a prearedstatement using our query string
        PreparedStatement ps= conn.prepareStatement(query);
        //fill in the preparedstatement
        ps.setInt(1, playerID);
        //execute the query
        this.results = ps.executeQuery();
        
            this.results.next();
            
            player.setPlayerID(this.results.getInt("playerID"));
            player.setFirstName(this.results.getString("firstName"));
            player.setLastName(this.results.getString("lastName"));
            player.setPlayerNumber(this.results.getInt("playerNumber"));
            player.setPlayerPosition(this.results.getString("playerPosition"));
            
}
    
    public Players getPlayer(){
        
        return this.player;
    }
}
