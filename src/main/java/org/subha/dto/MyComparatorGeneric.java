package org.subha.dto;

import java.util.Comparator;

public class MyComparatorGeneric implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		if (o1 instanceof StringBuffer) {
			String s1 = o1.toString();
			String s2 = o2.toString();
			return s1.compareTo(s2);
		} else if (o1 instanceof String) {
			String s1 = (String) o1;
			String s2 = (String) o2;

			// return s1.compareTo(s2);//Alphabetical
			// return -s1.compareTo(s2);// revrese Alphabetical
			return s2.compareTo(s1);// reverse Alphabetical
			// return -s2.compareTo(s1);//Alphabetical
		}
		else if(o1 instanceof Integer)
		{
			Integer i1 = (Integer) o1;
			Integer i2 = (Integer) o2;
			 return i2.compareTo(i1); //Descending order
			// return -i2.compareTo(i1); //Ascending order
			// return -i1.compareTo(i2); //Descending order
			// return i1.compareTo(i2); //Ascending order
			// return 1; //Follows insertion oredr and allws duplicate
			// return -1;//Follows reverse insertion oredr and allows duplicate
//			return 0;// only first element will be inserted
		}
		else if(o1 instanceof Employee)
		{
			Integer i1 = ((Employee) o1).getEmp_id();
			Integer i2 = ((Employee) o2).getEmp_id();
			 return i2.compareTo(i1); //Descending order
			// return -i2.compareTo(i1); //Ascending order
			// return -i1.compareTo(i2); //Descending order
			// return i1.compareTo(i2); //Ascending order
			// return 1; //Follows insertion oredr and allws duplicate
			// return -1;//Follows reverse insertion oredr and allows duplicate
//			return 0;// only first element will be inserted
		}
		
		return 0;
	}
}
