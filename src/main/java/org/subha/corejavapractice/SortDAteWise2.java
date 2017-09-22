package org.subha.corejavapractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortDAteWise2 {

	public static void main(String[] args) throws Exception {

		Set set = new TreeSet();
		
		Employee1 e1 = new Employee1();
		e1.setName("BArsha");
		e1.setJoiningDate(new Date(1992, 03, 17));
		
		Employee1 e2 = new Employee1();
		e2.setName("usha");
		e2.setJoiningDate(new Date(1998, 01, 5));
		
		Employee1 e3 = new Employee1();
		e3.setName("pyasa");
		e3.setJoiningDate(new Date(1886, 12, 30));
		
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Employee ee = (Employee) i.next() ;
			System.out.println(ee.getName());
			System.out.println(ee.getJoiningDate());
		}
		
	}

}

class Employee1 implements Comparable{
	
	private String Name;
	
	private Date JoiningDate;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getJoiningDate() throws Exception {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("DD MMMM YYYY");
		return dateFormat.parse(JoiningDate.toString());
//		return JoiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		JoiningDate = joiningDate;
	}
	@Override
	public int compareTo(Object o) {
		
		Employee1 e= (Employee1) o;
		return this.JoiningDate.compareTo(e.JoiningDate);
	}
}
