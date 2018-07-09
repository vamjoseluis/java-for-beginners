package com.tuxpuckpepe.java_for_beginners.cap_1_2_introduction.control_structures;

import java.util.Scanner;

public class SelectionStatementIf {
	private static Scanner sc;
	
	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.println("Compare if two numbers are equals");
		
		System.out.print("Enter the first number: ");
		int firstNumber = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int secondNumber = sc.nextInt();

		if(firstNumber== secondNumber) {
			System.out.println("Equals!");
		}else {
			System.out.println("Not Equals!");
		}
		
	}
}
