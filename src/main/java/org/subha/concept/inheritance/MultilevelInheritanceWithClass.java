package org.subha.concept.inheritance;


class A{
	public static void printMessahe(){
		System.out.println("A method");
	}
}

class B extends A{
	public static void printMessahe(){
		System.out.println("B method");
	}
}

class C extends B{
	public static void printMessahe(){
		System.out.println("C method");
	}
}
public class MultilevelInheritanceWithClass {

	public static void main(String[] args) {
		
//		Type mismatch: cannot convert from B to C
//		C c = new B();
		
//		C c = (C) new B();
//		c.printMessahe();
		
		
//		Note:Exception in thread "main" java.lang.ClassCastException: org.subha.concept.inheritance.B cannot be cast to org.subha.concept.inheritance.C
//		at org.subha.concept.inheritance.MultilevelInheritanceWithClass.main(MultilevelInheritanceWithClass.java:27)

		
		B b = new C();
		b.printMessahe();//B method

	}

}
