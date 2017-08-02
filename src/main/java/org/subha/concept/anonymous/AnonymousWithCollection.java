package org.subha.concept.anonymous;

import java.util.ArrayList;
import java.util.List;

public class AnonymousWithCollection {

	public static void main(String[] args) {

		List list = new ArrayList(){
			{
				add("ABC");
				add(10);
				add("tmobile");
			}
		};
		
		for(Object o: list){
			System.out.println(o);
		}
	}

}
