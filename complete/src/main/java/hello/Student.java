package hello;

import java.util.Date;

public class Student {
    public String reg_no,name, mobile,email,father_name,gender,nationality,adress,city,state,country,pincode,cv_link;
    public Date dob;

    public Student(String reg_no, String name, String mobile, String email, String father_name, String gender, String nationality, String adress, String city, String state, String country, String pincode, String cv_link, Date dob) {
        this.reg_no = reg_no;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.father_name = father_name;
        this.gender = gender;
        this.nationality = nationality;
        this.adress = adress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.cv_link = cv_link;
        this.dob = dob;
    }
}
