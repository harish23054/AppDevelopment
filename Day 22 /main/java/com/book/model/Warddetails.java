package com.book.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Shipping_info1") // Replace with your desired table name
public class Warddetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
//    private String dob;
//    private String gender;
    private String address;
    private String email;
    private String phone;
//    private String emergencyContactName;
//    private String emergencyContactRelationship;
//    private String emergencyContactPhone;
//    private String emergencyContactAddress;
//    private String dropdownValue;

    // Constructors (you can add more constructors if needed)

    public Warddetails() {
    }

    public Warddetails(String name, String address, String email, String phone) {
        this.name = name;
//        this.dob = dob;
//        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phone = phone;
//        this.emergencyContactName = emergencyContactName;
//        this.emergencyContactRelationship = emergencyContactRelationship;
//        this.emergencyContactPhone = emergencyContactPhone;
//        this.emergencyContactAddress = emergencyContactAddress;
//        this.dropdownValue = dropdownValue;
    }

    // Getters and Setters (you can generate them in your IDE)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getDob() {
//        return dob;
//    }
//
//    public void setDob(String dob) {
//        this.dob = dob;
//    }

//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    public String getEmergencyContactName() {
//        return emergencyContactName;
//    }
//
//    public void setEmergencyContactName(String emergencyContactName) {
//        this.emergencyContactName = emergencyContactName;
//    }
//
//    public String getEmergencyContactRelationship() {
//        return emergencyContactRelationship;
//    }
//
//    public void setEmergencyContactRelationship(String emergencyContactRelationship) {
//        this.emergencyContactRelationship = emergencyContactRelationship;
//    }
//
//    public String getEmergencyContactPhone() {
//        return emergencyContactPhone;
//    }
//
//    public void setEmergencyContactPhone(String emergencyContactPhone) {
//        this.emergencyContactPhone = emergencyContactPhone;
//    }
//
//    public String getEmergencyContactAddress() {
//        return emergencyContactAddress;
//    }
//
//    public void setEmergencyContactAddress(String emergencyContactAddress) {
//        this.emergencyContactAddress = emergencyContactAddress;
//    }
//
//    public String getDropdownValue() {
//        return dropdownValue;
//    }
//
//    public void setDropdownValue(String dropdownValue) {
//        this.dropdownValue = dropdownValue;
//    }
}