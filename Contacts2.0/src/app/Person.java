
package app;

/**
 *
 * @author Malith
 */
public class Person {
    
    //25 fields (without pic)
    private String firstName; 
    private String lastName;
    private String group;
    private String tags;
    private String nic;
    private String sex;
    private String mobileOne;
    private String mobileTwo;
    private String home;
    private String office;
    private String fax;
    private String personalAddress;
    private String officeAddress;
    private String business;
    private String notes;
    private String birthday;
   // private Blob picture; // later
    private String acNumber;
    private String nickName;
    private String branch;
    private String cifNo;
   // private String acType;
    private String emailPersonal;
    private String emailBusiness;
    private String webPagePersonal;
    private String webPageBusiness;

    public Person(){
        
    }
    //constructure (without pic)
    public Person(String firstName, String lastName, String group, String tags, String nic, String sex, String mobileOne, String mobileTwo, String home, String office, String fax, String personalAddress, String officeAddress, String business, String notes, String birthday, String acNumber, String nickName, String branch, String cifNo, String emailPersonal, String emailBusiness, String webPagePersonal, String webPageBusiness) {
        //super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.tags = tags;
        this.nic = nic;
        this.sex = sex;
        this.mobileOne = mobileOne;
        this.mobileTwo = mobileTwo;
        this.home = home;
        this.office = office;
        this.fax = fax;
        this.personalAddress = personalAddress;
        this.officeAddress = officeAddress;
        this.business = business;
        this.notes = notes;
        this.birthday = birthday;
        this.acNumber = acNumber;
        this.nickName = nickName;
        this.branch = branch;
        this.cifNo = cifNo;
      //  this.acType = acType;
        this.emailPersonal = emailPersonal;
        this.emailBusiness = emailBusiness;
        this.webPagePersonal = webPagePersonal;
        this.webPageBusiness = webPageBusiness;
    }
    

    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMobileOne(String mobileOne) {
        this.mobileOne = mobileOne;
    }

    public void setMobileTwo(String mobileTwo) {
        this.mobileTwo = mobileTwo;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setPersonalAddress(String personalAddress) {
        this.personalAddress = personalAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAcNumber(String acNumber) {
        this.acNumber = acNumber;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setCifNo(String cifNo) {
        this.cifNo = cifNo;
    }

   /* public void setAcType(String acType) {
        this.acType = acType;
    }*/

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    public void setEmailBusiness(String emailBusiness) {
        this.emailBusiness = emailBusiness;
    }

    public void setWebPagePersonal(String webPagePersonal) {
        this.webPagePersonal = webPagePersonal;
    }

    public void setWebPageBusiness(String webPageBusiness) {
        this.webPageBusiness = webPageBusiness;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public String getTags() {
        return tags;
    }

    public String getNic() {
        return nic;
    }

    public String getSex() {
        return sex;
    }

    public String getMobileOne() {
        return mobileOne;
    }

    public String getMobileTwo() {
        return mobileTwo;
    }

    public String getHome() {
        return home;
    }

    public String getOffice() {
        return office;
    }

    public String getFax() {
        return fax;
    }

    public String getPersonalAddress() {
        return personalAddress;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public String getBusiness() {
        return business;
    }

    public String getNotes() {
        return notes;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAcNumber() {
        return acNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public String getBranch() {
        return branch;
    }

    public String getCifNo() {
        return cifNo;
    }

  /*  public String getAcType() {
        return acType;
    }*/

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public String getEmailBusiness() {
        return emailBusiness;
    }

    public String getWebPagePersonal() {
        return webPagePersonal;
    }

    public String getWebPageBusiness() {
        return webPageBusiness;
    }
    
    public String getSummary(){
        String temp="<html><head>\n" +
"<style>\n" +
"table {\n" +
"    width:150%;\n" +
"}\n" +
"table, th, td {\n" +
"    border: 1px solid black;\n" +
"    border-collapse: collapse;\n" +
"}\n" +
"th, td {\n" +
"    padding: 2px;\n" +
"    text-align: left;\n" +
"}\n" +
"table#t01 tr:nth-child(even) {\n" +
"    background-color: #eee;\n" +
"}\n" +
"table#t01 tr:nth-child(odd) {\n" +
"   background-color:#fff;\n" +
"}\n" +
"table#t01 th	{\n" +
"    background-color: black;\n" +
"    color: white;\n" +
"}\n" +
"</style>\n" +
"</head><body><table id=\"t01\">";
        
        if(!"".equals(nickName)){temp+="<tr><td>Nick Name</td><td>"+nickName+"</td></tr>";}
        
        temp+= "<tr><td>Group</td><td>"+group+"</td></tr><tr><td>NIC</td><td>"+nic+"</td></tr>";
        
        if(mobileOne != null & !"".equals(mobileOne)){temp+=        "<tr><td><b>Mobile 1</b></td><td>"+mobileOne+"</td></tr>";}
        if(mobileOne != null & !"".equals(mobileTwo)){temp+=        "<tr><td>Mobile 2</td><td>"+mobileTwo+"</td></tr>";}
        if(mobileOne != null & !"".equals(home)){temp+=             "<tr><td>Home</td><td>"+home+"</td></tr>";}
        if(mobileOne != null & !"".equals(office)){temp+=           "<tr><td>Office</td><td>"+office+"</td></tr>";}
        if(mobileOne != null & !"".equals(fax)){temp+=              "<tr><td>Fax</td><td>"+fax+"</td></tr>";}
        
        if(mobileOne != null & !"".equals(personalAddress)){temp+=  "</td></tr>Personal Address</td><td>"+personalAddress+"</td></tr>";}
        if(mobileOne != null & !"".equals(officeAddress)){temp+=    "</td></tr>Office Address</td><td>"+officeAddress+"</td></tr></td></tr>";}
        
        if(mobileOne != null & !"".equals(business)){temp+=         "<tr><td>Business</td><td>"+business+"</td></tr>";}
        
        if(mobileOne != null & !"".equals(emailPersonal)){temp+=    "<tr><td>Personal email</td><td>"+emailPersonal+"</td></tr>";}
        if(mobileOne != null & !"".equals(emailBusiness)){temp+=    "<tr><td>Business email</td><td>"+emailBusiness+"</td></tr>";}
        if(mobileOne != null & !"".equals(webPagePersonal)){temp+=  "<tr><td>Personal web page</td><td>"+webPagePersonal+"</td></tr>";}
        if(mobileOne != null & !"".equals(webPageBusiness)){temp+=  "<tr><td>Business web page</td><td>"+webPageBusiness+"</td></tr>";}
        
        if(mobileOne != null & !"".equals(acNumber)){temp+=         "<tr><td>Account No</td><td>"+acNumber+"</td></tr>";}
        if(mobileOne != null & !"".equals(cifNo)){temp+=            "<tr><td>CIF No</td><td>"+cifNo+"</td></tr>";}
        if(mobileOne != null & !"".equals(branch)){temp+=           "<tr><td>Branch</td><td>"+branch+"</td></tr>";}
        temp+= "</table></body></html>";
        return temp;
    }
    
}
