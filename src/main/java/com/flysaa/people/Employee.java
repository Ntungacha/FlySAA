package com.flysaa.people;


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

    public void register(String name, String phoneNumber, String dateOfBirth, String idNumber, String nationality, String emailAddress,                                           String position, String username, int password) {
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

      public void display() {
                System.out.println("------------------------------------------------");
                System.out.println("name=" + this.getName());
                System.out.println("username=" + this.getUsername());
                System.out.println("password=" + this.getPassword());
                System.out.println("idNumber=" + this.getIdNumber());
                System.out.println("emailAddress=" + this.getEmailAddress());
                System.out.println("nationality=" + this.getNationality());
                System.out.println("position=" + this.getPosition());
                System.out.println("dateOfBirth=" + this.getDateOfBirth());
                System.out.println("phoneNumber=" + this.getPhoneNumber());
                System.out.println("---------------------------------------------------");
            } // display method ends here

} // end of class Employee
