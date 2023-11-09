package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		double pricePerKm = 0.21;
		double discountMinors = 0.80;
		double discountOvers = 0.60;
		
		String userAge;
		String userDistance;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Your Age as Number: ");
		userAge = in.nextLine();
		
		System.out.print("Distance in KM: ");
		userDistance = in.nextLine();
		
		in.close();
		
		int ageInt = Integer.valueOf(userAge);
		int distanceInt = Integer.valueOf(userDistance);
		
		double price = distanceInt * pricePerKm;
		double endPrice;
		
		if(ageInt < 18) {
			
			endPrice = price * discountMinors;
		}
		else if(ageInt >= 65) {
			
			endPrice = price * discountOvers;
		}
		else {
			endPrice = price;
		}
		
		
		
		System.out.print("price: "+endPrice);
	}
}
