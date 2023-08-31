package com.project.fayda.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty
    private String full_name;
    @NotEmpty
    private String full_name_et;
    @NotEmpty
    private String nationality;
    @NotEmpty
    private String gender;
    @NotEmpty
    private String date_of_birth;
    @NotEmpty
    private String region;
    private String zone;
    @NotEmpty
    private String sub_city;
    @NotEmpty
    private String woreda;
    @NotEmpty
    private String kebele;
    @NotEmpty
    private String phone_number;

    public Customer() {

    }

    public Customer(String fullName, String fullNamEt, String nationality, String gender, String dateOfBirth,
            String region, String sub_city, String woreda, String kebele, String phoneNumber) {
        this.full_name = fullName;
        this.full_name_et = fullNamEt;
        this.nationality = nationality;
        this.gender = gender;
        this.date_of_birth = dateOfBirth;
        this.region = region;
        this.sub_city = sub_city;
        this.woreda = woreda;
        this.kebele = kebele;
        this.phone_number = phoneNumber;
    }

    public Customer(String fullName, String fullNamEt, String nationality, String gender, String dateOfBirth,
            String region, String zone, String sub_city, String woreda, String kebele, String phoneNumber) {
        this.full_name = fullName;
        this.full_name_et = fullNamEt;
        this.nationality = nationality;
        this.gender = gender;
        this.date_of_birth = dateOfBirth;
        this.region = region;
        this.zone = zone;
        this.sub_city = sub_city;
        this.woreda = woreda;
        this.kebele = kebele;
        this.phone_number = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKebele() {
        return kebele;
    }

    public void setKebele(String kebele) {
        this.kebele = kebele;
    }

    public String getWoreda() {
        return woreda;
    }

    public void setWoreda(String woreda) {
        this.woreda = woreda;
    }

    public String getSub_city() {
        return sub_city;
    }

    public void setSub_city(String sub_city) {
        this.sub_city = sub_city;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDateOfBirth() {
        return date_of_birth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.date_of_birth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFullNamEt() {
        return full_name_et;
    }

    public void setFullNamEt(String fullNamEt) {
        this.full_name_et = fullNamEt;
    }

    public String getFullName() {
        return full_name;
    }

    public void setFullName(String fullName) {
        this.full_name = fullName;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phone_number = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{id=" + this.id +
                ",fullName=\'" + this.full_name + "\'" +
                ",fullNameEt=\'" + this.full_name_et + "\'" +
                ",nationality=\'" + this.nationality + "\'" +
                ",gender=\'" + this.gender + "\'" +
                ",dateOfBirth=\'" + this.date_of_birth + "\'" +
                ",region=\'" + this.region + "\'" +
                ",zone=\'" + this.zone + "\'" +
                ",sub_city=\'" + this.sub_city + '\'' +
                ",woreda=\'" + this.woreda + "\'" +
                ",kebele=\'" + this.kebele + "\'" +
                ",phoneNumber=\'" + this.phone_number + "\'}";
    }
}