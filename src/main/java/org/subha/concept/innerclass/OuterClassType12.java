package org.subha.concept.innerclass;

public class OuterClassType12 {
	
	int n=10;
	static int m=20; 
	public void m1() {
		int i = 10;
		final int j = 20;
		class InnerClass {
			public void m2() {
//				System.out.println(i);//should give compilation error
				System.out.println(j);
				System.out.println(m);
				System.out.println(n);
			}
			
		}
		InnerClass inner = new InnerClass();
		inner.m2();
		inner.m2();
		i = 10;
	}

	
	public static void m3() {
		int i = 10;
		final int j = 20;
		class InnerClass {
			public void m2() {
				System.out.println(i);//should give compilation error
				System.out.println(j);
				System.out.println(m);//Only static variable can be accessed
			}
			
		}
		InnerClass inner = new InnerClass();
		inner.m2();
		inner.m2();
	}
	public static void main(String[] arr) {
		OuterClassType12 o = new OuterClassType12();
		o.m1();
		o.m3();
	}
}
/*Note :
 * From method level inner class we cant reference the local variable of the method inside the 
 * inner class so we have to declare the variable as final they there will b no issue.
 *    
 *    
 * Inside Inner calss we cant have static method
 *  
 * */
