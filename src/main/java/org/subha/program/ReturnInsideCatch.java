package org.subha.program;

public class ReturnInsideCatch {

	int i=5;
	public static void main(String[] args) {
		System.out.println(new ReturnInsideCatch().returnInt());
	}
	
	public int returnInt() {
		try {
			i++;
			return i;
			
		} catch (Exception e) {
		}
		finally {
			i++;
		}
		return i;
	}

}
