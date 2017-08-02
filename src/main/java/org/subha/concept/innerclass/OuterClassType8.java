package org.subha.concept.innerclass;

public class OuterClassType8 {
	int x= 10;
	class InnerClass{
		int x= 100;
		public void m1(){
			int x=1000;
			System.out.println(x);//1000
			System.out.println(this.x);//100
			System.out.println(InnerClass.this.x);//100
			System.out.println(OuterClassType8.this.x);//10
		}
	}
	public static void main(String[] a){
		new OuterClassType8().new InnerClass().m1();
	}

}
