package org.subha.concept.innerclass;

public class OuterClassType4 {
class InnerClass{
	public void m1(){
		System.out.println("Inside inner class");
	}
}
	public static void main(String[] args){
	OuterClassType4 o = new OuterClassType4();
	InnerClass i= o.new InnerClass();
	i.m1();

	InnerClass i1 = new OuterClassType4().new InnerClass();
	i1.m1();
	
	new OuterClassType4().new InnerClass().m1();
}

}

/*Note:
	Accessing inner class code from static area of outer class*/