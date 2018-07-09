package com.tuxpuckpepe.java_for_beginners.cap_1_2_introduction.control_structures;

import java.util.Scanner;

/**
 * 
 * @author tuxpuckpepe
 *
 */
public class SelectionStatementSwitch {
	private static Scanner sc;
	
	public static void main(String args[]) {
		//String is available only for the last Java versions
		String languageSelected;
		String option;
		
		sc = new Scanner(System.in);
		
		System.out.println("Choose an option");
		System.out.println("A for French");
		System.out.println("B for Spanish");
		System.out.println("C for English");
		
		option = sc.nextLine();
		
		switch(option) {
		case "A":
			languageSelected = "French";
			break;
		case "B":
			languageSelected = "Spanish";
			break;
		case "C":
			languageSelected = "English";
			break;
		default:
			languageSelected = "English by default";
			break;
		}
		System.out.println("you have chosen: " + languageSelected);
	}
}
