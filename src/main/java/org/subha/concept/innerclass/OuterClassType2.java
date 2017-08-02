package org.subha.concept.innerclass;

public class OuterClassType2 {

class  InnerClass{
		
	}

	public static void main(String[] args) {
		System.out.println("Outer Class Main method");
	}

}

/*Note:
	java OuterClassType1
	-> Outer Class Main method
	java OuterClassType1$Inner
	-> NoSuchMethodError : main */
