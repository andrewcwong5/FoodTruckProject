package com.skilldistillery.foodtrucks;

import java.util.Scanner;



public class FoodTruckApp {

	Scanner kb = new Scanner(System.in);
	static boolean isChoose;
	
	public static void main(String[] args) {
		
		
		FoodTruck[] foodTrucks = new FoodTruck[5];
		FoodTruckApp methodCall = new FoodTruckApp();
		FoodTruck fT1 = new FoodTruck();
		FoodTruck fT2 = new FoodTruck(002, "DosBrosTacos", "Mexican", 4);
		
		
//		foodTrucks[0] =  ;
		
		System.out.println(fT2.getName());
		
		do {
			isChoose = true;
			
		methodCall.printMenu();
		methodCall.menuOptions();
		
		} while (isChoose == true) ;
		
		System.out.println("End of program");
		
	}
	
	void menuOptions () {
		int choice = 0;
			
			System.out.println("");
			choice = kb.nextInt();
		
			switch (choice) {
				
				case 1:
					System.out.println("Enter name of food truck: ");
					String name = kb.next();
					System.out.println("What is the food type?: ");
					String foodType = kb.next();
					System.out.println("Rating from 1-5: ");
					int rating = kb.nextInt();
					System.out.println();
					break;
				
				case 2:
//					System.out.println(FoodTruck.getName());
					
				case 3:
				
				case 4:
				
				case 5:
					isChoose = false;
					break;
						
				}
			}		
		
	public void printMenu() {
		System.out.println("1: Add foodtruck");
		System.out.println("2: List all foodtrucks");
		System.out.println("3: Average rating of foodtrucks");
		System.out.println("4: Display highest-rated foodtruck");
		System.out.println("5: Quit program");
	}
	
	
	public void newEntry() {
//		uniqueId
//		name
//		food type
//		rating
	}
}
