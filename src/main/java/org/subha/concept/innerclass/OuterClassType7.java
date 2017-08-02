package org.subha.concept.innerclass;

public class OuterClassType7 {

	int i=10;
	static int j=10;
	class InnerClass{
		public void m1(){
			System.out.println("Inside Inner Class ");
			System.out.println(i);
			System.out.println(j);
		}
	}
	public static void main(String[] args){
		new OuterClassType7().new InnerClass().m1();
	}
}
/*Note:
	Inside inner class we can access static member of Outer class*/ 
