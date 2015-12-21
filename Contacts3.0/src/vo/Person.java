
package vo;

import javax.swing.ImageIcon;

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
    
    private String acNumber;
    private String nickName;
    private String branch;
    private String cifNo;
   // private String acType;
    private String emailPersonal;
    private String emailBusiness;
    private String webPagePersonal;
    private String webPageBusiness;

    byte[] contactByteImage;
            
    public Person(){
        
    }
    //constructure (without pic)
    public Person(String firstName, String lastName, String group, String tags, String nic, String sex, String mobileOne, String mobileTwo, String home, String office, String fax, String personalAddress, String officeAddress, String business, String notes, String birthday, String acNumber, String nickName, String branch, String cifNo, String emailPersonal, String emailBusiness, String webPagePersonal, String webPageBusiness, byte[] contactByteImage) {
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
        this.contactByteImage = contactByteImage;
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

    public byte[] getContactByteImage() {
        return contactByteImage;
    }

    public void setContactByteImage(byte[] contactByteImage) {
        this.contactByteImage = contactByteImage;
    }

   
    
    public String getSummary(){
        String temp = "<html><body>";
        
        String name = "";
        if(firstName != null & !"".equals(firstName)){name+= "<h1><font color=\"#00BFFF\">"+firstName+"</font>&#160";}    
         if(lastName != null & !"".equals(lastName)){name+= "<font color=\"#00BFFF\">"+lastName+"</font></h1>";} 
        
        temp="<TABLE ALIGN=CENTER WIDTH=\"90%\" BORDER=0 CELLSPACING=1 CELLPADDING=1><caption>"+name+"</caption>";   
        
        
        if(nickName != null & !"".equals(nickName)){temp+=          "<tr><td><b>Nick&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160 </b></td><td>"+nickName+"</td></tr>";}            
        if(group != null & !"".equals(group)){temp+=                "<tr><td><b>Group</b></td><td>"+group+"</td></tr>";}
        if(nic != null & !"".equals(nic)){temp+=                    "<tr><td><b>NIC</b></td><td>"+nic+"</td></tr>";}
        if(mobileOne != null & !"".equals(mobileOne)){temp+=        "<tr><td><b>Mobile 1</b></td><td>"+mobileOne+"</td></tr>";}
        if(mobileTwo != null & !"".equals(mobileTwo)){temp+=        "<tr><td><b>Mobile 2</b></td><td>"+mobileTwo+"</td></tr>";}
        if(home != null & !"".equals(home)){temp+=                  "<tr><td><b>Home</b></td><td>"+home+"</td></tr>";}
        if(office != null & !"".equals(office)){temp+=              "<tr><td><b>Office</b></td><td>"+office+"</td></tr>";}
        if(fax != null & !"".equals(fax)){temp+=                    "<tr><td><b>Fax</b></td><td>"+fax+"</td></tr>";}
        if(personalAddress != null & !"".equals(personalAddress)){temp+=  "<tr><td><b>Personal Address</b></td><td>"+personalAddress+"</td></tr>";}
        if(officeAddress != null & !"".equals(officeAddress)){temp+=    "<tr><td><b>Office Address</b></td><td>"+officeAddress+"</td></tr></td></tr>";}        
        if(business != null & !"".equals(business)){temp+=           "<tr><td><b>Business</b></td><td>"+business+"</td></tr>";}        
        if(emailPersonal != null & !"".equals(emailPersonal)){temp+=    "<tr><td><b>Personal email</b></td><td>"+emailPersonal+"</td></tr>";}
        if(emailBusiness != null & !"".equals(emailBusiness)){temp+=    "<tr><td><b>Business email</b></td><td>"+emailBusiness+"</td></tr>";}
        if(webPagePersonal != null & !"".equals(webPagePersonal)){temp+=  "<tr><td><b>Personal web page</b></td><td>"+webPagePersonal+"</td></tr>";}
        if(webPageBusiness != null & !"".equals(webPageBusiness)){temp+=  "<tr><td><b>Business web page</b></td><td>"+webPageBusiness+"</td></tr>";}        
        if(acNumber != null & !"".equals(acNumber)){temp+=         "<tr><td><b>Account No</b></td><td>"+acNumber+"</td></tr>";}
        if(cifNo != null & !"".equals(cifNo)){temp+=            "<tr><td><b>CIF No</b></td><td>"+cifNo+"</td></tr>";}
        if(branch != null & !"".equals(branch)){temp+=           "<tr><td><b>Branch</b></td><td>"+branch+"</td></tr>";}
        temp+= "</table></body></html>";
        return temp;
    }
    
    
    
 
    
}
