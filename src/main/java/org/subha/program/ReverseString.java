package org.subha.program;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		//using iterative method
		Scanner s= new Scanner(System.in);
		System.out.println("Enter String");
		String string = s.nextLine();
		System.out.println("Original String :"+string);
		char[] chars= string.toCharArray();
		
		string ="";
		for(int i=chars.length-1 ; i>=0 ;i--){
			string += chars[i];
		}
		System.out.println("Reversed String :"+string);
		//Recursive Method
		string = recursiveMethod(string);
		System.out.println("Original String :"+string);
		
		//StringBuffer 
		StringBuffer sbf = new StringBuffer("MyJava");
		System.out.println(sbf.reverse());    //Output : avaJyM
	}

	private static  String recursiveMethod(String string) {
		if ((null == string) || (string.length() <= 1))
	     {
	            return string;
	     }
	 
	     return recursiveMethod(string.substring(1)) + string.charAt(0);		
	}
	
	

}
