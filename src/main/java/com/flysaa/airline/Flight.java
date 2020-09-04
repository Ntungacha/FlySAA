package com.flysaa.airline;

import java.time.*;
import java.util.Date;
import com.flysaa.people.Customer;
import java.util.ArrayList;

public class Flight {

private String flightNumber;
private String flightName;
private String from;
private String to;
private LocalDateTime depatureDate;
private LocalDateTime arrivalDate;
private ZonedDateTime depatureTimeZone;
private ZonedDateTime arrivaltimeZone;
public Customer cus;
public FlightTicket ticket;
public static ArrayList < Integer > set = new ArrayList<>();
public Flight() {
}

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

 public void displayFlight(ArrayList < Flight > flights){ // method overloading
        for(int n = 0; n < flights.size(); n++){
            if(flights.get(n) != null){
        System.out.println(n + ". <<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
         System.out.println("name =" + flights.get(n).getFlightName());
          System.out.println("flightNumber =" + flights.get(n).getFlightNumber());
          System.out.println("from =" + flights.get(n).getFrom());
         System.out.println("to = " + flights.get(n).getTo());
         System.out.println("DepatureDate =" + flights.get(n).getDepatureDate());
         System.out.println("Depature Time Zone =" + flights.get(n).getDepatureTimeZone());
         System.out.println("ArrivalDate =" + flights.get(n).getArrivalDate());
          System.out.println("Arrival Time Zone =" + flights.get(n).getArrivaltimeZone());
         System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
            }
        }
        } // display flight ends here
/*public static void seats(){
                    for (int i = 1; i < 20; i++) {
			             set.add(i);
		}
 }      

public static void avaSeat(ArrayList<Integer> seats) {

		for (int i = 0; i < seats.size(); i++) {
			if (seats.get(i) != 0) {
				System.out.print(seats.get(i) + " | ");
			}
		}
		System.out.println();
	}*/     
   public void avaliableSeats(ArrayList < Integer > seats){
        System.out.println("\n<<<<<<<<<<<< AVAILABLE SEATS >>>>>>>>>>>>>>>>");
        for(int m = 0; m < seats.size(); m++) {
            if(seats.get(m) == 0){
            System.out.print(seats.get(m) + " | ");
            }
        }
    }
     public String chooseSeatNumber(ArrayList < Integer > seats, FlightTicket ticket, int seatNumber) {
        for(int m = 0; m < seats.size(); m++){
            if(seats.get(seatNumber - 1) == 0){
            ticket.setSeatNumber(seatNumber);
           //seats(seatNumber - 1) = seatNumber;
            break;
            }else{
                return "Seat Already Take";

		   }
	   }
                	return null;
    }
    
    public String toString(){
        return "\nFlight Name: " + getFlightName() + "\nFlight Number: " + getFlightNumber() + "\nFrom: " + getFrom() + 
"\nTo: " + getTo() + "\nDepature Time Zone: " + getDepatureTimeZone() + "\nArrival Time Zone: " + getArrivaltimeZone();
    }

}