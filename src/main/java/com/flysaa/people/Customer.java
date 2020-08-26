package com.flysaa.people;

import java.time.*;
import java.util.Date;
import com.flysaa.airline.Flight;
import com.flysaa.airline.FlightTicket;
import java.util.Scanner;

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

public void bookTicket(FlightTicket ticket, String name, int pin, String phoneNumber, String dateOfBirth, String idNumber, String nationality, String emailAddress, int seatNumber, String type,String ticketNumber,LocalDateTime tDepatureDate, LocalDateTime tArrivalDate,String destination , ZonedDateTime tdepatureTimeZone, ZonedDateTime tarrivaltimeZone){//Flight[] flights, String flightNumber, String flightName, String from, String to, LocalDateTime depatureDate, LocalDateTime arrivalDate, int nums, int pin,  ZonedDateTime depatureTimeZone, ZonedDateTime arrivaltimeZone ) 
      //Flight flight = flights[nums];
    //this.setNumberOfTicket(numberOfTicket);
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
    
public void display( ) {
    System.out.println("------------------------------------------------");
                System.out.println("Pin=" + this.getPin());
                System.out.println("Name=" + this.getName());
                System.out.println("ID Number=" + this.getIdNumber());
                System.out.println("Email Address=" + this.getEmailAddress());
                System.out.println("Nationality=" + this.getNationality());
                System.out.println("Date Of Birth=" + this.getDateOfBirth());
                System.out.println("Phone Number=" + this.getPhoneNumber());
                System.out.println("Seat Number=" + ticket.getSeatNumber());
        System.out.println("Airline Name=" + ticket.getAirlineName());
         System.out.println("Destination=" + ticket.getDestination());
                System.out.println("Type=" + ticket.getType());
        System.out.println("Ticket Price=" + ticket.getTicketPrice());
         // System.out.println("depature date=" + ticket.getDepatureDate());
              System.out.println(" Depature Time =" + ticket.getDepatureTimeZone());
           //System.out.println("Arrival Date=" + ticket.getArrivalDate());
             System.out.println(" Arrival Time  =" + ticket.getArrivaltimeZone());
        System.out.println("_______________________________________________");
            } // end of display

public void display(Customer[] cust ) { //method overloading
     for(int m = 0; m < cust.length; m++){
        if(cust[m] != null){
    System.out.println("name =" + cust[m].getName());
     System.out.println("pin=" + cust[m].getPin());
      System.out.println("Seat Number=" + ticket.getSeatNumber());       
             }//else {
           // break;
            //}
    }
} //end of display
public void cancelTicket(Customer[] cust, String cname){
        for(int m = 0; m < cust.length; m++){
        if(cust[m] != null && cust[m].getName().equals(cname)){
                cust[m]  = null;
                    System.out.println("ticket successfully cancel");
                    break;
        }else{
            System.out.println("ticket not found");
           // break;
            }
        }
} // end of cancelticket

    public void boardFlight(Customer[] cust, String cname){
        for(int m = 0; m < cust.length; m++) {
            if(cust[m] != null && cust[m].getName().equals(cname)){
        System.out.println("Boarding successfull");
        break;
        }else{
        System.out.println("Boarding unsuccessfull");
       // break;
            }
        }
    } // board flight ends here
  /* public static void avaliableSeats(int[] seats){
        System.out.println("\n<<<<<<<<<<<< AVAILABLE SEATS >>>>>>>>>>>>>>>>");
        for(int m = 0; m < seats.length; m++) {
            if(seats[m] == 0){
            System.out.print(m +1 + " | ");
            }
        }
    }
    public  static String chooseSeatNumber(int[] seats, FlightTicket ticket, int seatNumber) {
        for(int m = 0; m < seats.length; m++){
            if(seats[seatNumber - 1] == 0){
            ticket.setSeatNumber(seatNumber);
            seats[seatNumber - 1] = seatNumber;
            break;
            }else{
                return "Seat Already Take";

		}
	   }
                	return null;
    }*/
    public void displayCustomer(FlightTicket ticket, Customer[] cust, String ticketNo){
        for(int n = 0; n < cust.length; n++){
             if(cust[n] != null) {
            if(cust[n].ticket.getTicketNumber().equalsIgnoreCase(ticketNo)){
               
               System.out.println("name =" + cust[n].getName());
                 System.out.println("pin=" + cust[n].getPin()); 
                    }
               // break;    
            }/*else{
            System.out.println("flight not found");
            
            }*/
        } // loop ends here
    } // display customers ends here
} // class ends here