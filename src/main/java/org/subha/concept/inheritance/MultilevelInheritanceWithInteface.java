package org.subha.concept.inheritance;


public class MultilevelInheritanceWithInteface {

//	Syntax error on token "printMessage", Identifier expected after this token
//	AAA.printMessage();
	void MAIM(){
	AA.printMessage();
	}
}
interface AA{
	static void printMessage(){
		System.out.println("Inteface AA");
	}
}

interface AB extends AA{
	static void printMessage(){
		System.out.println("Inteface AB");
	}
}

interface AC extends AB{
	static void printMessage(){
		System.out.println("Inteface AC");
	}
}

class AAA implements AA,AB,AC{
	
}