package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		System.out.println("test");
		
		double pricePerKm = 0.21;
		int discountMinors = 80;
		int discountOvers = 60;
		
		String userAge;
		String userDistance;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Your Age as Number: ");
		userAge = in.nextLine();
		
		System.out.print("Your Age as Number: ");
		userDistance = in.nextLine();
		
		in.close();
	}
}
