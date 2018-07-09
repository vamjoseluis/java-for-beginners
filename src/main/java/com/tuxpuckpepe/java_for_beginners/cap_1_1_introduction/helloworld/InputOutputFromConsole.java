package com.tuxpuckpepe.java_for_beginners.cap_1_1_introduction.helloworld;

import java.util.Scanner;

/**
 * 
 * @author tuxpuckpepe
 *
 */
public class InputOutputFromConsole {
	private static Scanner sc;

	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.println("Hello: " + name);
		System.out.println("End");
	}
	
}
