package com.skilldistillery.foodtrucks;

public class FoodTruck {
	private int uniqueId;
	private String name;
	private String foodType;
	private double rating;
	
	public FoodTruck() {
	}

	public FoodTruck(int uniqueId, String name, String foodType, double rating) {
		super();
		this.uniqueId = uniqueId;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
}
