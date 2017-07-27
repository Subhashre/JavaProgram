package org.subha.program;

import java.util.Scanner;

public class RemoveVowel {

	public static void main(String[] args) {

		System.out.println("Program to remove the Vowel from a String");
		System.out.println("Please enter the string");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("String before Removal of vowel :"+ string);
		string = string.replaceAll("[AEIOUaeiou]", "");
		System.out.println("String after removal of vowel :"+ string);
	}

}
