package org.subha.concept.innerclass;

public class OuterClassType11 {

	int i=10;
	static int j=14;
	static void m1(){
		class InnerClass{
			void m2(){
	//			System.out.println(i); - compilation error- cnt reference non-static members from static area/context
				System.out.println(j);		
			}
		}
		InnerClass i = new InnerClass();
		i.m2();
		
		i.m2();
	}
	public static void main(String[] arr){
		
	}
}
/*Note:
 * we can declare method local inner class both instance and static method.
 * 
 * decalring inner clss Inside static method then from that method local inner class we can access only static members of outer class directly from that method local inner class. 
 * decalring inner clss Inside instance method then from that method local inner class we can access both static and non-static members of outer class directly from that method local inner class.
 * 
 * 
 * */
