package org.subha.corejavapractice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SortDAteWise3 {

	public static void main(String[] args) throws ParseException {

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date[] dates = {
				formatter.parse("2008-12-25"),
				formatter.parse("2000-5-5"),
				formatter.parse("1995-3-17"),
				formatter.parse("1957-01-04"),
				};

		List<Date> dateList = new ArrayList<Date>(dates.length);
		for (int i = 0; i < dates.length; i++) {
			Date date = dates[i];

			dateList.add(date);

		}
		
		System.out.println("Before Sorting the List :");
		Iterator i = dateList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(dateList, (arg0 , arg1) -> arg1.compareTo(arg0));
		System.out.println("After Sorting the List :");
		
		i = dateList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Collections.sort(dateList, (arg0 , arg1) -> arg0.compareTo(arg1));
		System.out.println("After Sorting the List :");
		
		i = dateList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
