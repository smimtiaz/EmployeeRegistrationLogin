package com.example.rajit.employeeregistrationlogin;

import java.util.ArrayList;
import java.util.List;

public class Employee {
     private String mEmployeeName;
     private String mEmployeeEmail;
     private String mEmployeePassword;
     private String mEmployeeAge;
     private List<String> mLanguages = new ArrayList<>();
     private String mGender;
     private String mSalary;
     private String mLocation;

    public Employee() {
    }

    public Employee(String mEmployeeName, String mEmployeeEmail, String mEmployeePassword, String mEmployeeAge, List<String> mLanguages, String mGender, String mSalary, String mLocation) {
        this.mEmployeeName = mEmployeeName;
        this.mEmployeeEmail = mEmployeeEmail;
        this.mEmployeePassword = mEmployeePassword;
        this.mEmployeeAge = mEmployeeAge;
        this.mLanguages = mLanguages;
        this.mGender = mGender;
        this.mSalary = mSalary;
        this.mLocation = mLocation;
    }


    public String getmEmployeeName() {
        return mEmployeeName;
    }

    public void setmEmployeeName(String mEmployeeName) {
        this.mEmployeeName = mEmployeeName;
    }

    public String getmEmployeeEmail() {
        return mEmployeeEmail;
    }

    public void setmEmployeeEmail(String mEmployeeEmail) {
        this.mEmployeeEmail = mEmployeeEmail;
    }

    public String getmEmployeePassword() {
        return mEmployeePassword;
    }

    public void setmEmployeePassword(String mEmployeePassword) {
        this.mEmployeePassword = mEmployeePassword;
    }

    public String getmEmployeeAge() {
        return mEmployeeAge;
    }

    public void setmEmployeeAge(String mEmployeeAge) {
        this.mEmployeeAge = mEmployeeAge;
    }

    public List<String> getmLanguages() {
        return mLanguages;
    }

    public void setmLanguages(List<String> mLanguages) {
        this.mLanguages = mLanguages;
    }

    public String getmGender() {
        return mGender;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender;
    }

    public String getmSalary() {
        return mSalary;
    }

    public void setmSalary(String mSalary) {
        this.mSalary = mSalary;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "mEmployeeName ='" + mEmployeeName + '\'' +
                ", mEmployeeEmail ='" + mEmployeeEmail + '\'' +
                ", mEmployeePassword ='" + mEmployeePassword + '\'' +
                ", mEmployeeAge ='" + mEmployeeAge + '\'' +
                ", mLanguages =" + mLanguages +
                ", mGender ='" + mGender + '\'' +
                ", mSalary ='" + mSalary + '\'' +
                ", mLocation ='" + mLocation + '\'' +
                '}';
    }
}
