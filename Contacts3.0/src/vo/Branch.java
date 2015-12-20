/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author Malith
 */
public class Branch {
    private int branchCode;
    private String branchName;
    private String telephone;
    private String fax;
    private String email;
    private String address;

    public Branch(int branchCode, String branchName, String telephone, String fax, String email, String address) {
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.telephone = telephone;
        this.fax = fax;
        this.email = email;
        this.address = address;
    }

    public Branch() {
        
    }

    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
