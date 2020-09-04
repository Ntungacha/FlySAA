package com.flysaa.people;

import java.time.*;
import java.util.Date;
import com.flysaa.airline.Flight;
import com.flysaa.airline.FlightTicket;
import java.util.Scanner;
import java.util.ArrayList;

public class Customer extends Person {

private int numberOfTicket;
private int pin;
public FlightTicket ticket;
public Flight flight;
public Customer () {}

public int getNumberOfTicket() {
return numberOfTicket;
}
public void setNumberOfTicket(int numberOfTicket) {
this.numberOfTicket = numberOfTicket;
}
public int getPin(){
return pin;
}
public void setPin(int pin) {
this.pin = pin;
}

    public void bookTicket(FlightTicket ticket, String name, int pin, String phoneNumber, String dateOfBirth, String idNumber,      String nationality, String emailAddress, int seatNumber, String type,String ticketNumber,LocalDateTime tDepatureDate, LocalDateTime tArrivalDate,String destination , ZonedDateTime tdepatureTimeZone, ZonedDateTime tarrivaltimeZone){
        this.setPin(pin);
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setDateOfBirth(dateOfBirth);
        this.setIdNumber(idNumber);
        this.setNationality(nationality);
        this.setEmailAddress(emailAddress);
        ticket.setTicketNumber(ticketNumber);
       ticket.setDepatureDate(tDepatureDate);
       ticket.setDepatureTimeZone(tdepatureTimeZone);
       ticket.setArrivalDate(tArrivalDate);
       ticket.setArrivaltimeZone(tarrivaltimeZone);
        ticket.setDestination(destination);
        ticket.setSeatNumber(seatNumber);
        ticket.setType(type);
            if(type.equalsIgnoreCase("ECONOMY")){
                ticket.setTicketPrice(1000);
            }
            else if(type.equalsIgnoreCase("FIRST CLASS")){
                ticket.setTicketPrice(2000);
            }
            else if(type.equalsIgnoreCase("BUSINESS CLASS")){
                ticket.setTicketPrice(4000);
            }
        this.ticket = ticket;
        
} //end of bookticket
    
public void display(ArrayList < Customer > cust) { //method overloading
     for(int m = 0; m < cust.size(); m++){
        if(cust.get(m) != null){
        System.out.println("name =" +cust.get(m).getName());
        System.out.println("pin=" + cust.get(m).getPin());
        System.out.println("Seat Number=" + ticket.getSeatNumber());       
             }
    }
} //end of display all customers
public void cancelTicket(ArrayList < Customer > cust, String cname){
        for(int m = 0; m < cust.size(); m++){
        if(cust.get(m) != null && cust.get(m).getName().equals(cname)){
                cust.remove(m);
                    System.out.println("ticket successfully cancel");
                    break;
        }else{
            System.out.println("ticket not found");
            }
        }
} // end of cancelticket

    public void boardFlight(ArrayList < Customer > cust, String cname){
        for(int m = 0; m < cust.size(); m++) {
            if(cust.get(m) != null && cust.get(m).getName().equals(cname)){
            System.out.println("Boarding successfull");
            break;
            }else{
            System.out.println("Boarding unsuccessfull");
            }
        }
    } // board flight ends here
 
    public void displayCustomer(FlightTicket ticket, ArrayList < Customer > cust, String ticketNo){
        for(int n = 0; n < cust.size(); n++){
             if(cust.get(n) != null) {
                    if(cust.get(n).ticket.getTicketNumber().equalsIgnoreCase(ticketNo)){
                     System.out.println("name =" + cust.get(n).getName());
                     System.out.println("pin=" + cust.get(n).getPin()); 
                    }    
            }
        } // loop ends here
    } // display customers in a particular flight ends here
    
    public String toSting(){
        return "\nPin= " + getPin() + "\nName= " + getName() + "ID Number= " + getIdNumber() + "\nEmail Address=" +        getEmailAddress() + "\nNationality = " + getNationality() + "\nDate Of Birth = " + getDateOfBirth() + "\nPhone Number = " +          getPhoneNumber() + "\nSeat Number = " + ticket.getSeatNumber() + "\nAirline Name = " + ticket.getAirlineName() + "\nDestination   = " + ticket.getDestination() + "\nType = " + ticket.getType() + "\nTicket Price = " + ticket.getTicketPrice() + "\nDepature   Time = " + ticket.getDepatureTimeZone() + "\nArrival Time = " + ticket.getArrivaltimeZone();
    } //toString method ends here

} // class ends here