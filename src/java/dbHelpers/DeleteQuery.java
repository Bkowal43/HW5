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
public class DeleteQuery {
    
    private Connection conn;
    
    public DeleteQuery() throws SQLException{
        try {
            Properties props = new Properties();
            InputStream instr = getClass().getResourceAsStream("dbConn.properties");
            props.load(instr);
            instr.close();
            
            String driver= props.getProperty("driver.name");
            String url = props.getProperty("server.name");
            String username= props.getProperty("user.name");
            String passwd= props.getProperty("user.password");
            
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DeleteQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (IOException ex) {
            Logger.getLogger(DeleteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
   }

    
    public void doDelete(int playerID) throws SQLException{
        
      //set up a string to hold our query
        String query= "DELETE FROM players WHERE playerID=?";
        
        PreparedStatement ps = conn.prepareStatement(query);
        
      //fill in the preparedstatement
        ps.setInt(1, playerID);
        
        // execute the query
        ps.executeUpdate();
    }


}
        
        
        
    
