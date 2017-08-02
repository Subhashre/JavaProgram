package org.subha.concept.innerclass;

import org.subha.concept.innerclass.OuterClassType5.InnerClass;

public class OuterClassType6 {

	public static void main(String[] args) {
		OuterClass.InnerClass i = new OuterClass().new InnerClass();
		i.m1();

	}

}

class OuterClass {
	class InnerClass {
		public void m1() {
			System.out.println("Inside inner class");
		}
	}

}
/*
 * Note: Accessing inner class code from outerside of outer class
 */
