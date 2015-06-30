/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dac;

import app.Group;
import app.Tag;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Malith
 */
public class TagDAC {
     private final Connection myConn;

    public TagDAC(Connection myConn) {
        this.myConn = myConn;
    }
    
     public void addTag(Tag tag) throws SQLException{
        PreparedStatement myStmt = null;
        try{
            //prepare statement
            myStmt = myConn.prepareStatement("INSERT INTO `tag` (TagName)values (?)");
            
            //set params
            myStmt.setString(1,tag.getTagName());
                        
            // execute the statement
            myStmt.executeUpdate();
        }
        finally{
            close(myStmt);
        }
    }
     
      public List<Tag> getAllTags() throws Exception {
        
        List<Tag> list = new ArrayList<>();
        Statement myStmt = null;
        ResultSet myRs = null; 

        try {
                myStmt = myConn.createStatement();
                myRs = myStmt.executeQuery("select * from `tag`");
                
                // load each group object to the Group List
                while (myRs.next()) {
                        Tag tempTag = convertRowToTag(myRs);
                        list.add(tempTag);
                }
                return list;		
        }
        finally {
                close(myStmt, myRs);
        }
    }
    
     private Tag convertRowToTag(ResultSet myRs) throws SQLException {
				
       
        String tagName = myRs.getString(1);
        
		
	Tag tempTag = new Tag(tagName);
        return tempTag;
    }
     
      private static void close(Connection myConn, Statement myStmt, ResultSet myRs) throws SQLException {

        if (myRs != null) {
                myRs.close();
        }
        if (myStmt != null) {
                myStmt.close();
        }
        if (myConn != null) {
                myConn.close();
        }
    }
    
    private void close(Statement myStmt, ResultSet myRs) throws SQLException {
		close(null, myStmt, myRs);	
    }
    private void close(Statement myStmt) throws SQLException {
		close(null, myStmt, null);	
    }
    
}
