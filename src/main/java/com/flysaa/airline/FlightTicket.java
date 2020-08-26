package com.flysaa.airline;

import java.time.*;
import java.util.Date;
public class FlightTicket {

private String ticketNumber;
private LocalDateTime depatureDate;
private LocalDateTime arrivalDate;
private String destination;
private ZonedDateTime depatureTimeZone;
private ZonedDateTime arrivaltimeZone;
private static final String airlineName;
private double ticketPrice;
private int seatNumber;
private String type;

public FlightTicket () {}

static{
airlineName = "FLYSAA";
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
public String getTicketNumber() {
return ticketNumber;
}
public void setTicketNumber(String ticketNumber) {
this.ticketNumber = ticketNumber;
}
public LocalDateTime getDepatureDate() {
return depatureDate;
}
public void setDepatureDate(LocalDateTime depatureDate){
this.depatureDate = depatureDate;
}
public LocalDateTime getArrivalDate() {
return arrivalDate;
}
public void setArrivalDate(LocalDateTime arrivalDate){
this.arrivalDate = arrivalDate;
}
public String getDestination() {
return destination;
}
public void setDestination(String destination) {
this.destination = destination;
}
public String getAirlineName() {
return airlineName;
}
/*public void setAirlineName(String airlineName) {
this.airlineName = airlineName;
}*/
public double getTicketPrice() {
return ticketPrice;
}
public void setTicketPrice(double ticketPrice) {
this.ticketPrice = ticketPrice;
}
public int getSeatNumber() {
return seatNumber;
}
public void setSeatNumber(int seatNumber) {
this.seatNumber = seatNumber;
}
public String getType(){
return type;
}
public void setType(String type){
this.type = type;
}
}
