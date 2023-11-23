package com.rays.OOPs;

public class TestAutomobile {
public static void main(String[] args) {
	
	Automobile a  =  new Automobile();
	a.setColor("red");
	a.setSpeed(0356);
    a.setMake("engine");
//    Automobile.NO_OF_GEARS  =34;  
 //   kisi bhi 
   // data type ke variable ki value to 
    //constant rakhne ker liye-- final ---keyword use karte hai
	
	System.out.println(a.getColor());
	System.out.println(a.getSpeed());
	System.out.println(a.getMake());
	System.out.println(Automobile. NO_OF_GEARS);
	
}

}

