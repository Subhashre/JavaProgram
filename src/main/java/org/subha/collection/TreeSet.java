package org.subha.collection;

import java.util.Iterator;

import org.subha.dto.MyComparatorInteger;
import org.subha.dto.Employee;
import org.subha.dto.MyComparatorGeneric;

public class TreeSet {

	public static void main(String[] args) {
		// Customized Sorting
		java.util.TreeSet tree = new java.util.TreeSet(new MyComparatorGeneric());
		tree.add(10);
		tree.add(0);
		tree.add(40);
		tree.add(13);

		Iterator i = tree.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// Default Sorting
		java.util.TreeSet tree1 = new java.util.TreeSet();
		tree1.add(10);
		tree1.add(0);https://www.youtube.com/watch?v=dLxDMVxKoxM&list=PLd3UqWTnYXOkVR3OR9UZGyEt9RFUbaTMZ&index=39
		tree1.add(40);
		tree1.add(13);

		Iterator i1 = tree1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		// StringBuffer Sorting : ClassCast Exception
		java.util.TreeSet tree2 = new java.util.TreeSet( new MyComparatorGeneric());
		tree2.add(new StringBuffer("AM"));
		tree2.add(new StringBuffer("AZ"));
		tree2.add(new StringBuffer("AA"));
		tree2.add(new StringBuffer("AS"));

		Iterator i2 = tree2.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	
/*		java.util.TreeSet tree3 = new java.util.TreeSet();
		tree3.add(new StringBuilder("AM"));
		tree3.add(new StringBuilder("AZ"));
		tree3.add(new StringBuilder("AA"));
		tree3.add(new StringBuilder("AS"));

		Iterator i3 = tree3.iterator();
		while (i3.hasNext()) {
			System.out.println(i3.next());
		}
*/	
		java.util.TreeSet t4 = new java.util.TreeSet();
		t4.add(new Employee(1,"barsha"));
		t4.add(new Employee(100,"sid"));
		t4.add(new Employee(13,"kandhei"));
		t4.add(new Employee(41,"neha"));
		t4.add(new Employee(89,"usha"));
		Iterator i4 = t4.iterator();
		while (i4.hasNext()) {
			System.out.println(i4.next());
		}
		System.out.println("-----------------------------------------");
		
		java.util.TreeSet t5 = new java.util.TreeSet(new MyComparatorGeneric());
		t5.add(new Employee(1,"barsha"));
		t5.add(new Employee(100,"sid"));
		t5.add(new Employee(13,"kandhei"));
		t5.add(new Employee(41,"neha"));
		t5.add(new Employee(89,"usha"));
		Iterator i5 = t5.iterator();
		while (i5.hasNext()) {
			System.out.println(i5.next());
		}
		
	}

}
