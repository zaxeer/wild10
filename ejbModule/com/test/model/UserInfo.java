package com.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement 
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -9026377766695117875L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column    
    private String email;
    @Column
    private String land;
    @Column
    private String city;
    @Column
    private String street;
    @Column
    private String postcode;
    @Column
    private String houseNumber;
    @Column
    private String extraAddressInfo;
    @Column
    private String mobile;
    @Column
    private String phone;
    @Column
    private Boolean isEmailShared;
    @Column
    private Boolean isAddressShared;
    @Column
    private Boolean isMobileShared;
    @Column
    private Boolean isPhoneShared;
    
     
    public String getCity() {
        return city;
    }


    public String getEmail() {
        return email;
    }


    public String getExtraAddressInfo() {
        return extraAddressInfo;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getHouseNumber() {
        return houseNumber;
    }


    public long getId() {
        return id;
    }


    public String getLand() {
        return land;
    }


    public String getLastName() {
        return lastName;
    }


    public String getMobile() {
        return mobile;
    }


    public String getPhone() {
        return phone;
    }


    public String getPostcode() {
        return postcode;
    }


    public String getStreet() {
        return street;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setExtraAddressInfo(String extraAddressInfo) {
        this.extraAddressInfo = extraAddressInfo;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }


    public void setId(long id) {
        this.id = id;
    }


    public void setLand(String land) {
        this.land = land;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public Boolean getIsEmailShared() {
        return isEmailShared;
    }


    public void setIsEmailShared(Boolean isEmailShared) {
        this.isEmailShared = isEmailShared;
    }


    public Boolean getIsAddressShared() {
        return isAddressShared;
    }


    public void setIsAddressShared(Boolean isAddressShared) {
        this.isAddressShared = isAddressShared;
    }


    public Boolean getIsMobileShared() {
        return isMobileShared;
    }


    public void setIsMobileShared(Boolean isMobileShared) {
        this.isMobileShared = isMobileShared;
    }


    public Boolean getIsPhoneShared() {
        return isPhoneShared;
    }


    public void setIsPhoneShared(Boolean isPhoneShared) {
        this.isPhoneShared = isPhoneShared;
    }
}
