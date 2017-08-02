package org.subha.concept.innerclass;

public class OuterClassType10 {
	int i=10;
	static int j=14;
	public void m1(){
		class InnerAdd{
			void add(int i,int j){
				System.out.println("The SUm of nos are :" +(i+ j));
			}
			
			void m2(){
				System.out.println(i);
				System.out.println(j);		
			}
		}
		InnerAdd ia = new InnerAdd();
		ia.add(10, 20);
		ia.add(27, 53);
		
		ia.m2();
		
	}
	public static void main(String[] arr){
		OuterClassType10 o= new OuterClassType10();
		o.m1();
	}
}
/*
 * Note: Method local Inner classes If in inside a method repeatative action is
 * there
 * 
 * The main purpose of method local inner class is to define method specific
 * repeatedly required functionality.
 * 
 * Method local inner class are best suitable to meet nested method requirement.
 * 
 * The scope of method level inner class is very less. We can access method
 * local inner class within the method where we declared outside of the method
 * we cant access .Beacuse of its less scope method local inner class are most
 * rarely inner classes.
 */