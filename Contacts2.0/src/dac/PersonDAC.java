
package dac;

import app.Person;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Malith
 */
public class PersonDAC {
    private final Connection myConn;

    public PersonDAC() throws IOException, SQLException {
        // get db properties from properties file (inside the project)
        Properties prop = new Properties();
        prop.load(new FileInputStream("user.properties"));

        String user = prop.getProperty("user");
        String password = prop.getProperty("password");
        String dburl = prop.getProperty("dburl");

        //connect to database
        myConn = DriverManager.getConnection(dburl, user, password);
        System.out.println("DB connection successful to : " + dburl);
         
    }
    
    // add a new person(contact)
    public void addPerson(Person person) throws SQLException{
        PreparedStatement myStmt = null;
        try{
            //prepare statement
            myStmt = myConn.prepareStatement("INSERT INTO person (FirstName, LastName, `Group`, Tags, NIC, Sex, MobileOne,MobileTwo,Home, Office, Fax,PersonalAddress, OfficeAddress, Business, Notes, BirthDay, AccountNumber,NickName, Branch, CIFno, AccountType, EmailPersonal, EmailBusiness,WebPagePersonal,WebPageBusiness)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            //set params
            myStmt.setString(1,person.getFirstName() );
            myStmt.setString(2, person.getLastName() );
            myStmt.setString(3, person.getGroup() );
            myStmt.setString(4, person.getTags());
            myStmt.setString(5, person.getNic() );
            myStmt.setString(6, person.getSex());
            myStmt.setString(7, person.getMobileOne());
            myStmt.setString(8, person.getMobileTwo());
            myStmt.setString(9, person.getHome());
            myStmt.setString(10, person.getOffice());
            myStmt.setString(11, person.getFax());
            myStmt.setString(12, person.getPersonalAddress());
            myStmt.setString(13, person.getOfficeAddress());
            myStmt.setString(14, person.getBusiness());
            myStmt.setString(15, person.getNotes());
            myStmt.setString(16, person.getBirthday());
            //myStmt.setBytes(17, "jjjuj");//check
            myStmt.setString(17, person.getAcNumber());
            myStmt.setString(18, person.getNickName());
            myStmt.setString(19, person.getBranch());
            myStmt.setString(20, person.getCifNo());
            myStmt.setString(21, person.getAcType());
            myStmt.setString(22, person.getEmailPersonal());
            myStmt.setString(23, person.getEmailBusiness());
            myStmt.setString(24, person.getWebPagePersonal());
            myStmt.setString(25, person.getWebPageBusiness());
           /*  myStmt.setString(18, person.getAcNumber());
            myStmt.setString(19, person.getNickName());
            myStmt.setString(20, person.getBranch());
            myStmt.setString(21, person.getCifNo());
            myStmt.setString(22, person.getAcType());
            myStmt.setString(23, person.getEmailPersonal());
            myStmt.setString(24, person.getEmailBusiness());
            myStmt.setString(25, person.getWebPagePersonal());
            myStmt.setString(26, person.getWebPageBusiness());*/
            
            // execute SQL
            myStmt.executeUpdate();
        }
        finally{
            close(myStmt);
        }
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
    
    public static void main(String args[]) throws IOException, SQLException{
        new PersonDAC();
    }
    
}
