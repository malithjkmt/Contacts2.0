 
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
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author Malith  - malith.13@cse.mrt.ac.lk
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
    
    /**
     * get all person to a List
     * */
    public List<Person> getAllPerson() throws Exception {
        
        List<Person> list = new ArrayList<>();
        Statement myStmt = null;
        ResultSet myRs = null; 

        try {
                myStmt = myConn.createStatement();
                myRs = myStmt.executeQuery("select * from person");
                
                // load each person object to the Person List
                while (myRs.next()) {
                        Person tempPerson = convertRowToPerson(myRs);
                        list.add(tempPerson);
                }
                return list;		
        }
        finally {
                close(myStmt, myRs);
        }
    }
    
    /**
     * search persons for given input parameters like last name, tel number, id, AC number
     * */
    public List<Person> searchPerson(String lastName) throws Exception {
        
        List<Person> list = new ArrayList<>();
        PreparedStatement myStmt = null;
        ResultSet myRs = null;

        try {
            lastName += "%";
            myStmt = myConn.prepareStatement("select * from person where lastName like ?");
            myStmt.setString(1, lastName);
            myRs = myStmt.executeQuery();
            
            //load persons to a Person List
            while (myRs.next()) {
                    Person tempPerson = convertRowToPerson(myRs);
                    list.add(tempPerson);
            }
            return list;
        }
        finally {
                close(myStmt, myRs);
        }
    }
    
    /**
     * add a new person
     * */
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
            
            // execute the statement
            myStmt.executeUpdate();
        }
        finally{
            close(myStmt);
        }
    }
   
    /**
     * update person
     * */
    public void updatePerson (Person person, String previousNIC) throws SQLException{
        PreparedStatement myStmt = null; 
        try{
            //prepare the statement
            myStmt = myConn.prepareStatement("update person set FirstName=?, LastName=?, `Group`=?, Tags=?, NIC=?, Sex=?, MobileOne=?, MobileTwo=?, Home=?, Office=?, Fax=?, PersonalAddress=?, OfficeAddress=?, Business=?, Notes=?, BirthDay=?, AccountNumber=?, NickName=?, Branch=?, CIFno=?, AccountType=?, EmailPersonal=?, EmailBusiness=?, WebPagePersonal=?, WebPageBusiness=? where NIC=?");// Why this Group has to be `Group` ?????
            
            // set params
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
            myStmt.setString(26, previousNIC);
            
            //execute statement
            myStmt.executeUpdate();
        }
        finally {
            close(myStmt);
        }
    }
    
    /**
     * delete person
     * @param nic
     * @throws SQLException 
     */
    public void deletePerson (String nic) throws SQLException{
        PreparedStatement myStmt = null;
        try{
            // prepare statement
            myStmt = myConn.prepareStatement("delete from person where NIC=?");
            
            //set param
            myStmt.setString(1, nic);
            
            //execute statement
            myStmt.executeUpdate();
        }
        finally{
            close(myStmt);
        }
    }
    
    /**
     * close connections
     * @param myConn
     * @param myStmt
     * @param myRs
     * @throws SQLException 
     */
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
        
    /**
     *  convert a row from DB in to a Person
     * @param myRs
     * @return
     * @throws SQLException 
     */
    private Person convertRowToPerson(ResultSet myRs) throws SQLException {
				
        String firstName = myRs.getString(1);
        String lastName = myRs.getString(2);
        String group = myRs.getString(3);
        String tags = myRs.getString(4);
        String nic = myRs.getString(5);
        String sex = myRs.getString(6);
        String mobileOne = myRs.getString(7);
        String mobileTwo = myRs.getString(8);
        String home = myRs.getString(9);
        String office = myRs.getString(10);
        String fax = myRs.getString(11);
        String personalAddress = myRs.getString(12);
        String officeAddress = myRs.getString(13);
        String business = myRs.getString(14);
        String notes = myRs.getString(15);
        String birthday = myRs.getString(16);
        //person_image // later
        String acNumber = myRs.getString(17);
        String nickName = myRs.getString(18);
        String branch = myRs.getString(19);
        String cifNo = myRs.getString(20);
        String acType = myRs.getString(21);
        String emailPersonal = myRs.getString(22);
        String emailBusiness = myRs.getString(23);
        String webPagePersonal = myRs.getString(24);
        String webPageBusiness = myRs.getString(25);
		
	Person tempPerson = new Person(firstName, lastName, group, tags, nic, sex, mobileOne, mobileTwo, home, office, fax, personalAddress, officeAddress, business, notes, birthday, acNumber, nickName, branch, cifNo, acType, emailPersonal, emailBusiness, webPagePersonal, webPageBusiness);
	return tempPerson;
    }
    
}
