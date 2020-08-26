package com.flysaa.airline;

import java.time.*;
import java.util.Date;
import com.flysaa.people.Customer;
public class Flight {

private String flightNumber;
private String flightName;
private String from;
private String to;
private LocalDateTime depatureDate;
private LocalDateTime arrivalDate;
private ZonedDateTime depatureTimeZone;
private ZonedDateTime arrivaltimeZone;
//public  int[] seats = new int[20];
public Customer cus;
public FlightTicket ticket;


public Flight() {}

public String getFlightNumber(){
return flightNumber;
}
public void setFlightNumber(String flightNumber){
this.flightNumber = flightNumber;
}
public String getFlightName(){
return flightName;
}
public void setFlightName(String flightName) {
this.flightName = flightName;
}
public String getFrom(){
return from;
}
public void setFrom(String from){
this.from = from;
}
public String getTo(){
return to;
}
public void setTo(String to){
this.to = to;
}
public LocalDateTime getDepatureDate() {
return depatureDate;
}
public void setDepatureDate(LocalDateTime depatureDate){
this.depatureDate = depatureDate;
}
public LocalDateTime getArrivalDate(){
return arrivalDate;
}
public void setArrivalDate(LocalDateTime arrivalDate){
this.arrivalDate = arrivalDate;
}
public ZonedDateTime getDepatureTimeZone(){
return depatureTimeZone;
}
public void setDepatureTimeZone(ZonedDateTime depatureTimeZone){
this.depatureTimeZone = depatureTimeZone;
}
public ZonedDateTime getArrivaltimeZone(){
return arrivaltimeZone;
}
public void setArrivaltimeZone(ZonedDateTime arrivaltimeZone){
this.arrivaltimeZone = arrivaltimeZone;
}

        public void addFlight(String flightNumber, String flightName, String from, String to, LocalDateTime depatureDate, LocalDateTime arrivalDate, ZonedDateTime depatureTimeZone, ZonedDateTime arrivaltimeZone){
        this.setFlightNumber(flightNumber);
        this.setFlightName(flightName);
        this.setFrom(from);
        this.setTo(to);
        this.setDepatureDate(depatureDate);
        this.setArrivalDate(arrivalDate);
        this.setDepatureTimeZone(depatureTimeZone);
        this.setArrivaltimeZone(arrivaltimeZone);
        } // add flight ends here
        public void displayFlight(){
        System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
         System.out.println("Name =" + this.getFlightName());
          System.out.println("Flight Number =" + this.getFlightNumber());
          System.out.println("From =" + this.getFrom());
         System.out.println("To = " + this.getTo());
         System.out.println("Depature Date =" + this.getDepatureDate());
         System.out.println(" D Time Zone =" + this.getDepatureTimeZone());
         System.out.println("Arrival Date =" + this.getArrivalDate());
         System.out.println(" A Time Zone =" + this.getArrivaltimeZone());
         System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        } // display flight ends here

 public void displayFlight(Flight [] flights){ // method overloading
        for(int n = 0; n < flights.length; n++){
            if(flights[n] != null){
        System.out.println(n + ". <<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
         System.out.println("name =" + flights[n].getFlightName());
          System.out.println("flightNumber =" + flights[n].getFlightNumber());
          System.out.println("from =" + flights[n].getFrom());
         System.out.println("to = " + flights[n].getTo());
         System.out.println("DepatureDate =" + flights[n].getDepatureDate());
         System.out.println("Depature Time Zone =" + flights[n].getDepatureTimeZone());
         System.out.println("ArrivalDate =" + flights[n].getArrivalDate());
          System.out.println("Arrival Time Zone =" + flights[n].getArrivaltimeZone());
         System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
            }
        }
        } // display flight ends here
    public void avaliableSeats(int[] seats){
        System.out.println("\n<<<<<<<<<<<< AVAILABLE SEATS >>>>>>>>>>>>>>>>");
        //for(int n = 0; n < flights.length; n++){
        for(int m = 0; m < seats.length; m++) {
            if(seats[m] == 0){
            System.out.print(m + 1 + " | ");
            }
        }
//break;
        //}
    }
     public String chooseSeatNumber(int[] seats, FlightTicket ticket, int seatNumber) {
         //for(int n = 0; n < flights.length; n++){
        for(int m = 0; m < seats.length; m++){
            if(seats[seatNumber - 1] == 0){
            ticket.setSeatNumber(seatNumber);
            seats[seatNumber - 1] = seatNumber;
            break;
            }else{
                return "Seat Already Take";

		   }
	   }
//break;
        //}
                	return null;
    }
}