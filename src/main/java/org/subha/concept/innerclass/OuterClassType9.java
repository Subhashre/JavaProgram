package org.subha.concept.innerclass;

public class OuterClassType9 {

	public static void main(String[] arg) {
		OuterClassNested o= new OuterClassNested();
		OuterClassNested.Inner1 i1= o.new Inner1();
		OuterClassNested.Inner1.Inner2 i2= i1.new Inner2();
		OuterClassNested.Inner1.Inner2.Inner3 i3= i2.new Inner3();
		i3.m1();
	}
}

class OuterClassNested {
	class Inner1 {
		class Inner2 {
			class Inner3 {
				public void m1() {
					System.out.println("Inside Innermost class");
				}
			}
		}
	}
}
//Note: Nested class inside inner class 