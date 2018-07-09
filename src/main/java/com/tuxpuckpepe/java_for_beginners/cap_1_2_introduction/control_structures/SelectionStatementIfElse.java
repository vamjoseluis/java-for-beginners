package com.tuxpuckpepe.java_for_beginners.cap_1_2_introduction.control_structures;

import java.util.Scanner;

/**
 * 
 * @author tuxpuxkpepe
 *
 */
public class SelectionStatementIfElse {
	private static Scanner sc;
	
	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.println("It will return the greatest of 2 integer numbers");
		
		System.out.print("Enter the first number");
		int firstNumber = sc.nextInt();
		
		System.out.print("Enter the second number");
		int secondNumber = sc.nextInt();

		if(firstNumber > secondNumber) {
			System.out.println("The first number is the greatest number");
		}
		else if(firstNumber < secondNumber) {
			System.out.println("The second number is the greatest number");
		}else {
			System.out.println("Both numbers are equals");
		}
	}
}
