package com.rays.OOPs;

public class Animal {
	public void eat() {
		
		System.out.println("i am eating");
		
	}
	
	
	
	 
public static void main(String[] args) {
	System.out.println("1");
	 Animal buzo  = new Animal();
	
	 buzo.eat();
	 buzo.run();
	 buzo.play();
	
}
public  void  run() {
	System.out.println("I am runing");
}

public void play() {
	System.out.println("  i am playing");
}
}
