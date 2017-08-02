package org.subha.concept.innerclass;

import org.subha.concept.innerclass.OuterClassType4.InnerClass;

public class OuterClassType5 {
	class InnerClass{
	public void m1(){
		System.out.println("Inside inner class");
	}
}
	public void m2(){
	
		InnerClass i = new InnerClass();
		i.m1();
	}
	public static void main(String[] args){
	OuterClassType5 o = new OuterClassType5();
	o.m2();
	
}

}
/*
Note: Accessing inner class code from instance area of outer class*/
