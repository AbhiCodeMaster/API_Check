package com.cricket.ipl.core;
import java.util.Scanner;
public class Test {
	
	public static void main(String[] args) {
		
		BulbService bulbservice = new BulbService();
		System.out.println(bulbservice.askbulb());
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name of a bulb");
		String name = scanner.next();
		try {
			Bulb bulb = (Bulb)Class.forName(name).newInstance();
			bulbservice.setBulb(bulb); 
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
