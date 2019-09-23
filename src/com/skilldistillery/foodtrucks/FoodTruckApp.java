package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	Scanner kb = new Scanner(System.in);
	static boolean isChoose;
	FoodTruck[] foodTrucks = new FoodTruck [6];
	
	public static void main(String[] args) {
		
		FoodTruckApp methodCall = new FoodTruckApp();

		System.out.println("Welcome to Food Truck App,"
				+ " please select an option 1-5 below");
		do {
			isChoose = true;
			
		methodCall.printMenu();
		methodCall.menuOptions();
		
		} while (isChoose == true) ;
		
		System.out.println("End of program, have a nice day");
		
	}
	
	void menuOptions () {
		int choice = kb.nextInt();
			
			System.out.println("");
		
			switch (choice) {
				
				case 1:			
					newEntry();
					break;	
				case 2:			
					listAll();
					break;
				case 3: //see avg rating of food trucks	
					printFoodTruckRating();
					break;
				case 4:	//display highest rated food truck
					highestRated();
					break;
				case 5: //quit program
					isChoose = false;
					break;	
				default:
					System.out.println("Invalid selection, choose again 1-5");
					break;
			}
		}		
		
	void printMenu() {
		System.out.println("1: Add foodtruck");
		System.out.println("2: List all foodtrucks");
		System.out.println("3: Average rating of foodtrucks");
		System.out.println("4: Display highest-rated foodtruck");
		System.out.println("5: Quit program");
	}
	void printFoodTruckRating() {
		double total = 0.0, avg = 0.0;
		int i = 0, ratingCounter = 0;
		for (i = 0; i < foodTrucks.length ; i++) {
			if (foodTrucks[0] == null) {
				System.out.println("No reviews yet");
				break;
			}
			if (foodTrucks[i].getRating() > 0.5) {
				total = total + foodTrucks[i].getRating();
				ratingCounter ++;
			}
		}
		avg = total / (ratingCounter);
		System.out.println("Overall Average rating: " + avg); 
	}
	void listAll() {
		for (int i = 0; i < foodTrucks.length ; i++) {
			if (foodTrucks[0] == null) {
				System.out.println("No reviews yet");
				break;
			}
			if (foodTrucks[i].getName() != null) {
			System.out.println("Name: " + foodTrucks[i].getName() + 
				"  Food Type: " + foodTrucks[i].getFoodType() +
				"  Rating: " + foodTrucks[i].getRating() );
			}
		}
	}
	
	void newEntry() {
		
		// initializer so i don't get the null pointer exception
		for (int count = 0; count < foodTrucks.length; count++) {
			foodTrucks[count] = new FoodTruck();
			foodTrucks[count].setUniqueId(0+count);
		}
		
		for (int i = 0; i < foodTrucks.length ; i++) {
			if (i == 5) {
				System.out.println("Five foodtrucks entered, can't review more, "
						+ "adding another foodtruck will delete previous entries");
				break;
			}
			System.out.println("Enter name of food truck: ");
			String name = kb.next();
				if (name.equals("quit")) 
					break;
			System.out.println("What is the food type?: ");
			String foodType = kb.next();
			System.out.println("Rating from 1(bad)-5(best): ");
			int rating = kb.nextInt();
			
		
			foodTrucks[i].setUniqueId(i+1);
			foodTrucks[i].setName(name);
			foodTrucks[i].setFoodType(foodType);
			foodTrucks[i].setRating(rating);
			
			System.out.print("assigning inputed values for");
			System.out.println(" unique Id: " + foodTrucks[i].getUniqueId());
			System.out.println("Enter next food truck entry or type quit");
		}
	}
	void highestRated() {
		double highest = 0;
		String highestName = "none" ;
		
		for (int i = 0; i < foodTrucks.length ; i++) {
			if (foodTrucks[0] == null) {
				System.out.println("No foodtrucks have been reviewed yet");
				break;
			}
			if (foodTrucks[i].getRating() > highest) {
				highest = foodTrucks[i].getRating();
				highestName = foodTrucks[i].getName() ;
			}
		}
		System.out.println("Best food truck is: " + highestName + " " + highest);
	}
}
