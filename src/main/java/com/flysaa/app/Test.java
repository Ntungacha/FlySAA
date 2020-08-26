package com.flysaa.app;

import java.util.Scanner;
import com.flysaa.people.Person;
import com.flysaa.people.Employee;
import com.flysaa.people.Customer;
import com.flysaa.transaction.Payment;
import com.flysaa.airline.FlightTicket;
import com.flysaa.airline.Flight;

public class Test  {
public Test () {}
static int a = 0;
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
Employee[] emps = new Employee[3];
Customer[] cust = new Customer[20];
Flight[] flights = new Flight[5];
//Customer [] capeTown = new Customer[20];
//Customer [] joburg = new Customer[20];
int seats[] = new int[20];
Customer cus = null;
Payment pay = new Payment();
Employee emp = null;
FlightTicket ticket = null;
Flight flight = null;

    for(int i = 1; i < 100; i++) {  
        int option = 0,f=0,e=0;
                    for(;;) {
                    scan.nextLine();
                    try{
                    System.out.println("\t\tWELCOME TO FLYSAA");
                    System.out.println("Choose an option from the list below");
                    System.out.println("choose 1 : TO REGISTER");
                    System.out.println("Choose 2 : TO LOGIN");
                    System.out.println("Choose 0 : TO EXIT");
                    option = scan.nextInt();
                    break;
                    }catch(Exception ex){
                    System.out.println("please enter option.");
                    }
                    }
            if(option == 1) {
            emp = new Employee();
                System.out.println("\tREGISTER");
                scan.nextLine();
                System.out.print("enter your name: ");
                String name = scan.nextLine();
                System.out.print("Enter phone number: ");
                String phoneNumber = scan.nextLine();
                System.out.print("Enter date of birth: ");
                String dateOfBirth = scan.nextLine();
                System.out.print("Enter ID number: ");
                String idNumber = scan.nextLine();
                System.out.print("Enter Nationality: ");
                String nationality = scan.nextLine();
                System.out.print("Enter Email address: ");
                String emailAddress = scan.nextLine();
                System.out.print("Enter Position: ");
                String position = scan.nextLine();
                System.out.print("Enter username: ");
                String username = scan.nextLine();
              //  System.out.print("Enter password: ");
                int password = 0;//scan.nextInt();
                        for(;;) {
                        scan.nextLine();
                        try{
                        System.out.print("Enter password: ");
                        password = scan.nextInt();
                        break;
                        }catch(Exception ex){
                        System.out.println("Please enter password.");
                        }
                        }// to catch exception for password when registring rmployee
emp.register(name,phoneNumber, dateOfBirth, idNumber, nationality, emailAddress, position, username, password);
emps[a] = emp;
a++;
emp.display();
            }
            if(option == 2) {
                    for(int c = 0; c < emps.length; c++) {
               System.out.println();
               System.out.println(" \tLOGIN ");        
                System.out.println();
                scan.nextLine();
                System.out.print("Enter username: "); 
                String uname = scan.nextLine();
                int pass = 0;
                            for(;;) {
                            scan.nextLine();
                            try{
                            System.out.print("Enter password: ");
                            pass = scan.nextInt();
                            break;
                            }catch(Exception ex){
                            System.out.println("Please enter password.");
                            }
                            }
                //System.out.print("Enter password: ");
                //int pass = scan.nextInt();
                   for(int b = 0; b < emps.length; b++) {
                    if(uname.equals(emps[b].getUsername()) && pass == (emps[b].getPassword())){
                    System.out.println("\t\t\tWELCOME TO FLYSAA" + emps[b].getName());
                        for(int z = 0; z < cust.length; z++){
cus = new Customer();
ticket = new FlightTicket();
                        int choice = 0; 
                                    for(;;) {
                                    scan.nextLine();
                                    try{
                                    System.out.println("choose from the list below");
                                    System.out.println("\tENter 0:TO EXIT");
                                    System.out.println("\tEnter 1:TO  Add flight");
                                    System.out.println("\tEnter 2:TO  BOOK TICKET");
                                    System.out.println("\tEnter 3:TO CANCEL TICKET");
                                    System.out.println("\tEnter 4:To BROAD FLIGHT");
                                     System.out.println("\tEnter 5:To ");
                                     System.out.println("\tEnter 6:To Display Flight");
                                     System.out.println("\tEnter 7:To Display customers in a particular Flight");
                                    choice = scan.nextInt(); 
                                    break;
                                    }catch(Exception ex){
                                    System.out.println("enter your choice from the list below.");
                                    }
                                    } 
                                if(choice == 1){
                                flight = new Flight();
                                 scan.nextLine();
                              System.out.print("Enter flight number:");
                                String flightNumber= scan.nextLine();
                              System.out.print("Enter flight name:");
                                String flightName = scan.nextLine();
                                System.out.print("Enter from:");
                                String from = scan.nextLine();
                                System.out.print("Enter to:");
                                String to =scan.nextLine();
                                System.out.print("Enter depatureDate:");
                                String depatureDate = scan.nextLine();
                                System.out.print("Enter arrival Date:");
                                String arrivalDate = scan.nextLine();
                                flight.addFlight(flightNumber, flightName, from, to, depatureDate, arrivalDate);
                                flights[f] = flight;
                                f++;
                                cus.flight = flight;                
                                }
                                else if(choice == 2){
                                System.out.println("");
                                System.out.println(" \tBOOK TICKET ");
                                flight.displayFlight(flights);
                                System.out.print("choose:");
                                    int nums = scan.nextInt();
                                    
                                scan.nextLine();
                                System.out.print("Enter name : ");
                                String name = scan.nextLine();
                                System.out.print("Enter id number : ");
                                String idNumber = scan.nextLine();
                                System.out.print("Enter nationality : ");
                                String nationality = scan.nextLine();
                                System.out.print("Enter emailAddress : ");
                                String emailAddress = scan.nextLine();
                                System.out.print("Enter date of birth : ");
                                String dateOfBirth = scan.nextLine();
                                System.out.print("Enter phone number : ");
                                String phoneNumber = scan.nextLine();
                               // System.out.print("Enter number of ticket : ");
                                //int numberOfTicket = scan.nextInt();
                               // System.out.print("Enter ticket number: ");
                                /*int ticketNumber = 0;
                                for(;;) {
                            scan.nextLine();
                            try{
                            System.out.print("Enter ticket number: ");
                            ticketNumber = scan.nextInt();
                            break;
                            }catch(Exception ex){
                            System.out.println(" Please enter ticket number.");
                            }
                            }
                                System.out.print("Enter depature time: ");
                                scan.nextLine();
                                String depatureTime = scan.nextLine();
                                System.out.print("Enter depature date: ");
                                String depatureDate = scan.nextLine();
                                System.out.print("Enter arrivaltime: ");
                                String arrivaltime = scan.nextLine();
                                System.out.print("Enter arrivalDate: ");
                                String arrivalDate = scan.nextLine();
                                System.out.print("Enter destination: ");
                                String destination = scan.nextLine();*/
                               // System.out.print("Enter airline name: ");
                                //String airlineName = scan.nextLine();
                                //System.out.print("Enter ticket price: ");
                                //double ticketPrice = scan.nextDouble();
                                //System.out.print("Enter seat number: ");
                                System.out.print("\nEnter flightNumber:");//+ flights[nums].getFlightNumber());
                                String flightNumber = flights[nums].getFlightNumber();
                                System.out.println("\nEnter name:" );//+ flights[nums].getFlightName());
                                String flightName = flights[nums].getFlightName();
                                System.out.print("\nEnter from:");//  + flights[nums].getFrom());
                                String from = flights[nums].getFrom();
                                System.out.print("\nEnter to:");//+ flights[nums].getTo());
                                String to = flight.getTo();
                                System.out.print("\nEnter depature date:");//+  flights[nums].getDepatureDate());
                                String depatureDate =  flights[nums].getDepatureDate();
                                System.out.print("\nEnter arrival date:");//+ flights[nums].getArrivalDate());
                                String arrivalDate = flights[nums].getArrivalDate();
                                int seatNumber = 0;
                                        for (int p = 0; p < 20; p++) {
                                			cus.avaliableSeats(seats);
                                                 for(;;) {
                                                    scan.nextLine();
                                                    try{
                                                 System.out.print("\nSelect Seat Number: ");
                                                    seatNumber = scan.nextInt();
                                                    break;
                                                    }catch(Exception ex){
                                                    System.out.println(" Please enter seat number.");
                                                    }
                                                    }
                                            	String result = cus.chooseSeatNumber(seats, ticket, seatNumber);
                                    			if (result != null) {
				                                System.out.println(result);
				                                continue;
			                                     }
			                                         System.out.println("After Continue");
                                                        break;
                                                }
                                String type = null;
                                int num = 0;//scan.nextInt();
                                      invalid:for(;;){
                                                  for(;;) {
                                                  scan.nextLine();
                                                  try{
                                                  System.out.println("\n\t select from the type below:");
                                                  System.out.println("\t1. Economy");
                                                  System.out.println("\t2. FIRST CLASS");
                                                  System.out.println("\t3. BUSINESS CLASS");
                                                  num = scan.nextInt();
                                                  break;
                                                  }catch(Exception ex){
                                                  System.out.println("enter your choice from the list below.");
                                                  }
                                                  }
                                             if(num ==1){
                                             type ="Economy";
                                                    break invalid;
                                             }
                                             else  if(num ==2){
                                                    type ="FIRST CLASS";
                                                 break invalid;
                                             }
                                             else  if(num ==3){
                                                type = "BUSINESS CLASS";
                                                     break invalid;
                                            }else{
                                                System.out.println("invalid number");                                                 
                                            } 
                                       }                                                          

cus.bookTicket(ticket, name, phoneNumber, dateOfBirth, idNumber, nationality, emailAddress, seatNumber, type,flights, flights[nums].getFlightNumber(), flights[nums].getFlightName(), flights[nums].getFrom(), flights[nums].getTo(), flights[nums].getDepatureDate(), flights[nums].getArrivalDate(), nums);
cust[e] = cus;
e++;
//cus.display();  
                           /* else if(choose == 2){
                                    System.out.println("FLIGHT NUMBER GBF2468B");
                                 scan.nextLine();
                                System.out.print("Enter name : ");
                                String name = scan.nextLine();
                                System.out.print("Enter id number : ");
                                String idNumber = scan.nextLine();
                                System.out.print("Enter nationality : ");
                                String nationality = scan.nextLine();
                                System.out.print("Enter emailAddress : ");
                                String emailAddress = scan.nextLine();
                                System.out.print("Enter date of birth : ");
                                String dateOfBirth = scan.nextLine();
                                System.out.print("Enter phone number : ");
                                String phoneNumber = scan.nextLine();
                               // System.out.print("Enter number of ticket : ");
                                //int numberOfTicket = scan.nextInt();
                               // System.out.print("Enter ticket number: ");
                                int ticketNumber = 0;
                                for(;;) {
                            scan.nextLine();
                            try{
                            System.out.print("Enter ticket number: ");
                            ticketNumber = scan.nextInt();
                            break;
                            }catch(Exception ex){
                            System.out.println(" Please enter ticket number.");
                            }
                            }
                                System.out.print("Enter depature time: ");
                                scan.nextLine();
                                String depatureTime = scan.nextLine();
                                System.out.print("Enter depature date: ");
                                String depatureDate = scan.nextLine();
                                System.out.print("Enter arrivaltime: ");
                                String arrivaltime = scan.nextLine();
                                System.out.print("Enter arrivalDate: ");
                                String arrivalDate = scan.nextLine();
                                System.out.print("Enter destination: ");
                                String destination = scan.nextLine();
                               // System.out.print("Enter airline name: ");
                                //String airlineName = scan.nextLine();
                                //System.out.print("Enter ticket price: ");
                                //double ticketPrice = scan.nextDouble();
                                //System.out.print("Enter seat number: ");
                                int seatNumber = 0;
                                        for (int p = 0; p < 20; p++) {
                                			cus.avaliableSeats(seats);
                                                 for(;;) {
                                                    scan.nextLine();
                                                    try{
                                                 System.out.print("\nSelect Seat Number: ");
                                                    seatNumber = scan.nextInt();
                                                    break;
                                                    }catch(Exception ex){
                                                    System.out.println(" Please enter seat number.");
                                                    }
                                                    }
                                            	String result = cus.chooseSeatNumber(seats, ticket, seatNumber);
                                    			if (result != null) {
				                                System.out.println(result);
				                                continue;
			                                     }
			                                         System.out.println("After Continue");
                                                        break;
                                                }
                                String type = null;
                                int num = 0;//scan.nextInt();
                                      invalid:for(;;){
                                                  for(;;) {
                                                  scan.nextLine();
                                                  try{
                                                  System.out.println("\n\t select from the type below:");
                                                  System.out.println("\t1. Economy");
                                                  System.out.println("\t2. FIRST CLASS");
                                                  System.out.println("\t3. BUSINESS CLASS");
                                                  num = scan.nextInt();
                                                  break;
                                                  }catch(Exception ex){
                                                  System.out.println("enter your choice from the list below.");
                                                  }
                                                  }
                                             if(num ==1){
                                             type ="Economy";
                                                    break invalid;
                                             }
                                             else  if(num ==2){
                                                    type ="FIRST CLASS";
                                                 break invalid;
                                             }
                                             else  if(num ==3){
                                                type = "BUSINESS CLASS";
                                                     break invalid;
                                            }else{
                                                System.out.println("invalid number");                                                 
                                            } 
                                       }                                                          

cus.bookTicket(ticket, name, phoneNumber, dateOfBirth, idNumber, nationality, emailAddress, ticketNumber, depatureTime, depatureDate, seatNumber, arrivaltime, arrivalDate, destination, type);
cust[z] = cus;
cus.display();  
                            }*/
                            } //end of choice 1
                           else if(choice == 3){
                            System.out.println("\tCANCEL TICKET ");
                            scan.nextLine();        
                            System.out.print("Enter name: ");
                            String cname = scan.nextLine();
                            cus.cancelTicket(cust, cname);
                            }
                           else if(choice == 4){
                            System.out.println("\tBOARD FLIGHT ");
                            scan.nextLine();
                            System.out.print("Enter name: ");
                            String cname = scan.nextLine();
                            cus.boardFlight(cust, cname);
                            }
                            else if(choice == 5){
                            cus.display(cust);

                           /* for(int m = 0; m < cust.length ; m++) {
                                if(cust[m].ticket.getDestination().equalsIgnoreCase("johannesburg")){
                                      joburg[m] = cus;
                                System.out.println(joburg[m]);
                                }else if(cust[m].ticket.getDestination().equalsIgnoreCase("cape town")){
                                    capeTown[m] = cus;
                                System.out.println(capeTown[m]);
                                }
                            }*/
                            }
                                /*else if(choice == 5){
                                flight = new Flight();
                              System.out.print("Enter flight number:");
                                String flightNumber= scan.nextLine();
                                 scan.nextLine();
                              System.out.print("Enter flight name");
                                String name = scan.nextLine();
                                System.out.print("Enter from:");
                                String from = scan.nextLine();
                                System.out.print("Enter to:");
                                String to =scan.nextLine();
                                System.out.print("Enter depatureDate:");
                                String depatureDate = scan.nextLine();
                                System.out.print("Enter arrival Date:");
                                String arrivalDate = scan.nextLine();
                                flight.addFlight(flightNumber, name, from, to, depatureDate, arrivalDate);
                                flights[z] = flight;
cus.flight = flight;
                             }*/
                            else if(choice == 6){
                             System.out.println("\t\tDISPLAY FLIGHT");
                                flight.displayFlight(flights);
                           }
                            else if(choice == 7){
                            scan.nextLine();
                            System.out.print("enter flight number:");
                            String flightname = scan.nextLine();
                            cus.displayCustomer(flights, cust ,flightname);
                             /*for(int n = 0; n < cust.length; n++){
            if(flights[n].getFlightName().equalsIgnoreCase(flightNo)){
            System.out.println("\n\tlist of customers in flight number :" + flights[n].getFlightNumber());
                    for(int o = 0; o < cust.length; o++){
                System.out.println("name =" + cust[0].getName());
                    }
                    break;               
            }else{
            System.out.println("flight not found");
            break;
            }
        }*/
                            //System.out.println(cus.toString());
                           } 
                           else if(choice == 0){
                            z = 100;
                            } // end of choice 
                        } //end of loop z
                 c=30;
                   b=90;
                    }else{
                    System.out.println("login unsuccessfull");
break;
                    } //end of login                       
                    } //end of loop b
                } //end of loop c
            }//end of option 2                               
            if(option == 0) {
            i = 500;
            } // end of option 0

} //main loop ends here
}
}
