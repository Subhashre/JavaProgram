package org.subha.dto;

import java.util.Comparator;

public class MyComparatorInteger implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// return (int)o2 - (int)o1;

		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		// return i2.compareTo(i1); //Descending order
		// return -i2.compareTo(i1); //Ascending order
		// return -i1.compareTo(i2); //Descending order
		// return i1.compareTo(i2); //Ascending order
		// return 1; //Follows insertion oredr and allws duplicate
		// return -1;//Follows reverse insertion oredr and allows duplicate
		return 0;// only first element will be inserted

	}

}
