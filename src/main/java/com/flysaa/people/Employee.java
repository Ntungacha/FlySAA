package com.flysaa.people;

import java.util.ArrayList;

public class Employee extends Person {

private String position;
private String username;
private int password;

public Employee() {}

public String getPosition() {
return position;
}
public void setPosition(String position) {
this.position = position;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public int getPassword() {
return password;
}
public void setPassword(int password) {
this.password = password;
}

    public void register(String name, String phoneNumber, String dateOfBirth, String idNumber, String nationality, String emailAddress, String position, String username, int password) {
        this.setName(name);  
        this.setPhoneNumber(phoneNumber);
        this.setDateOfBirth(dateOfBirth);
        this.setIdNumber(idNumber);
        this.setNationality(nationality);
        this.setEmailAddress(emailAddress);
        this.setPosition(position);
        this.setUsername(username);
        this.setPassword(password);
    } // register method ends here
        
     public String toString(){
        return "\nEmployee name : " + getName() + "\nusername: " + getUsername() + "\npassword: " + getPassword() +                 "\nidNumber: " + getIdNumber() + "\nEmail Address: " + getEmailAddress() + "\nNationality: " + getNationality() +                   "\nDate Of Birth: " + getDateOfBirth() + "\nPhone Number: " + getPhoneNumber() + "\nPosition: " + getPosition();    
    }

} // end of class Employee
