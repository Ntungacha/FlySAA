package com.flysaa.transaction;

public class Payment {
public Payment () {}

private String type;
private double amount;
private double change;

public String getType(){
return type;
}
public void setType(String type) {
this.type = type;
}
public double getAmount(){
return amount;
}
public void setAmount(double amount){
this.amount = amount;
}

}