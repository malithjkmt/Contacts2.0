/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dac;

import data.Branch;
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
public class BranchDAC {

    Connection myConn;

    public BranchDAC(Connection myConn) {
        this.myConn = myConn;
    }

    public void addBranch(Branch branch) throws SQLException {
        PreparedStatement myStmt = null;
        try {
            //prepare statement
            myStmt = myConn.prepareStatement("INSERT INTO `branch` (BranchCode, BranchName, Telephone, Fax, Email, Address)values (?,?,?,?,?,?)");

            //set params
            myStmt.setInt(1, branch.getBranchCode());
            myStmt.setString(2, branch.getBranchName());
            myStmt.setString(3, branch.getTelephone());
            myStmt.setString(4, branch.getFax());
            myStmt.setString(5, branch.getEmail());
            myStmt.setString(6, branch.getAddress());

            // execute the statement
            myStmt.executeUpdate();
        } finally {
            close(myStmt);
        }
    }

    public Branch searchBranch(String branchCode) throws Exception {
        branchCode = branchCode.trim();

        PreparedStatement myStmt = null;
        ResultSet myRs = null;
        String query;
        try {
            query = "select * from branch where BranchCode = ?";
            myStmt = myConn.prepareStatement(query);
            myStmt.setInt(1, Integer.parseInt(branchCode));

            // execute statement
            myRs = myStmt.executeQuery();

            //load branchs to a Branch List
            myRs.next();
            Branch branch = convertRowToBranch(myRs);

            return branch;
        } finally {
            close(myStmt, myRs);
        }
    }

    public Branch searchBranchCode(String branchName) throws Exception {
        branchName = branchName.trim();
       // branchName = "%" + branchName + "%";

        PreparedStatement myStmt = null;
        ResultSet myRs = null;
        String query;
        try {
            query = "select * from branch where BranchName like ?";
            myStmt = myConn.prepareStatement(query);
            myStmt.setString(1, branchName);

            // execute statement
            myRs = myStmt.executeQuery();

            //load branchs to a Branch List
            myRs.next();
            Branch branch = convertRowToBranch(myRs);

            return branch;
        } finally {
            close(myStmt, myRs);
        }
    }
    
    public List<Branch> getAllBranchOrderByBranchCode() throws Exception {

        List<Branch> list = new ArrayList<Branch>();
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select * from `branch` ORDER BY BranchCode");

            // load each branch object to the Branch List
            while (myRs.next()) {
                Branch tempBranch = convertRowToBranch(myRs);
                list.add(tempBranch);
            }
            return list;
        } finally {
            close(myStmt, myRs);
        }
    }
    
    public List<Branch> getAllBranchOrderByBranchName() throws Exception {

        List<Branch> list = new ArrayList<Branch>();
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select * from `branch` ORDER BY BranchName");

            // load each branch object to the Branch List
            while (myRs.next()) {
                Branch tempBranch = convertRowToBranch(myRs);
                list.add(tempBranch);
            }
            return list;
        } finally {
            close(myStmt, myRs);
        }
    }

    public void deleteBranch(int branchCode) throws SQLException {
        PreparedStatement myStmt = null;
        try {
            // prepare statement
            myStmt = myConn.prepareStatement("delete from `branch` where BranchCode=?");

            //set param
            myStmt.setInt(1, branchCode);

            //execute statement
            myStmt.executeUpdate();
        } finally {
            close(myStmt);
        }
    }

    public void updateBranch(Branch branch, int currentBranchCode) throws SQLException {
        PreparedStatement myStmt = null;
        try {
            // prepare statement
            myStmt = myConn.prepareStatement("UPDATE `branch` SET BranchCode=?, BranchName=?, Telephone=?, Fax=?, Email=?, Address=? Where BranchCode=?");

            //set param
            myStmt.setInt(1, branch.getBranchCode());
            myStmt.setString(2, branch.getBranchName());
            myStmt.setString(3, branch.getTelephone());
            myStmt.setString(4, branch.getFax());
            myStmt.setString(5, branch.getEmail());
            myStmt.setString(6, branch.getAddress());
            myStmt.setInt(7, currentBranchCode);

            //execute statement
            myStmt.executeUpdate();
        } finally {
            close(myStmt);
        }
    }

    private Branch convertRowToBranch(ResultSet myRs) throws SQLException {

        int branchCode = myRs.getInt(1);
        String branchName = myRs.getString(2);
        String telephone = myRs.getString(3);
        String fax = myRs.getString(4);
        String email = myRs.getString(5);
        String address = myRs.getString(6);

        Branch tempBranch = new Branch(branchCode, branchName, telephone, fax, email, address);
        return tempBranch;
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
