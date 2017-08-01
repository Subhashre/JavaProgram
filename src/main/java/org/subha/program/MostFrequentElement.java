package org.subha.program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MostFrequentElement {

	public static void main(String[] args) {
		
		System.out.println("Program to get the most used element");
		int[] numbers= new int[]{10,34,25,10,67,34,10};
		int element=0;
		int frequency=1;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i: numbers)
		{
			
			if(map.containsKey(i)){
				map.replace(i, map.get(i)+1);
			}
			else{
				map.put(i, 1);
			}
			if(map.get(i)>frequency)
			{
				element=i;
				frequency=map.get(i);
			}
		}
		
	/*	for(Integer i: map.keySet()){
			if(map.get(i) > frequency){
				element = i;
				frequency = map.get(i);
			}
		}
	*/	if(element >0)
		{
			System.out.println("The elements are :" + Arrays.toString(numbers));
			System.out.println("The most frequent element is :" + element);
			System.out.println("The frequency is :" + frequency);
			
		}
		else{
			System.out.println("The elements are :" + Arrays.toString(numbers));
			System.out.println("All elements are unique :(");
			
		}
		
		
	}

}
