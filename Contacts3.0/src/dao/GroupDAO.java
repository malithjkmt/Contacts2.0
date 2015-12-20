/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import vo.Group;
import vo.Person;
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
public class GroupDAO {
    private final Connection myConn;

    public GroupDAO(Connection myConn) {
        this.myConn = myConn;
    }
    
     public void addGroup(Group group) throws SQLException{
        PreparedStatement myStmt = null;
        try{
            //prepare statement
            myStmt = myConn.prepareStatement("INSERT INTO `group` (GroupName)values (?)");
            
            //set params
            myStmt.setString(1,group.getGroupName());
                        
            // execute the statement
            myStmt.executeUpdate();
        }
        finally{
            close(myStmt);
        }
    }
    
    public List<Group> getAllGroups() throws Exception {
        
        List<Group> list = new ArrayList<>();
        Statement myStmt = null;
        ResultSet myRs = null; 

        try {
                myStmt = myConn.createStatement();
                myRs = myStmt.executeQuery("select * from `group`");
                
                // load each group object to the Group List
                while (myRs.next()) {
                        Group tempGroup = convertRowToGroup(myRs);
                        list.add(tempGroup);
                }
                return list;		
        }
        finally {
                close(myStmt, myRs);
        }
    }
    
     public void deleteGroup(String groupName) throws SQLException {
        PreparedStatement myStmt = null;
        try {
            // prepare statement
            myStmt = myConn.prepareStatement("delete from `group` where GroupName=?");

            //set param
            myStmt.setString(1, groupName);

            //execute statement
            myStmt.executeUpdate();
        } finally {
            close(myStmt);
        }
    }
     public void renameGroup(String newName, String previousName) throws SQLException{
         PreparedStatement myStmt = null;
        try {
            // prepare statement
            myStmt = myConn.prepareStatement("UPDATE `group` SET GroupName=? WHERE GroupName=?");

            //set param
            myStmt.setString(1, newName);
            myStmt.setString(2, previousName);

            //execute statement
            myStmt.executeUpdate();
        } finally {
            close(myStmt);
        }
     }
     private Group convertRowToGroup(ResultSet myRs) throws SQLException {
				
       
        String groupName = myRs.getString(1);
        
		
	Group tempGroup = new Group(groupName);
        return tempGroup;
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
