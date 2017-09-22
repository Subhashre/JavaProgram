package org.subha.corejavapractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortDAteWise1 {

	public static void main(String[] args) throws Exception {

		Set set = new TreeSet();
		
		Employee e1 = new Employee();
		e1.setName("BArsha");
		e1.setJoiningDate("2008/12/25");
		
		Employee e2 = new Employee();
		e2.setName("usha");
		e2.setJoiningDate("2000/5/5");
		
		Employee e3 = new Employee();
		e3.setName("pyasa");
		e3.setJoiningDate("1957/01/04");
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Employee ee = (Employee) i.next() ;
			System.out.println(ee.getName());
			System.out.println(ee.getJoiningDate().toString());
		}
		
		
	}

}

class Employee implements Comparable{
	
	private String Name;
	
	private String JoiningDate;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getJoiningDate() throws Exception {
		
		return JoiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		JoiningDate = joiningDate;
	}
	@Override
	public int compareTo(Object o) {
		
		Employee e= (Employee) o;
		Date CurrentDate = null;
		Date upcomingDate = null ;
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		try {
			CurrentDate = dateFormat.parse(this.JoiningDate);
			upcomingDate = dateFormat.parse(e.JoiningDate);
			
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		return CurrentDate.compareTo(upcomingDate);
		
	}
}
