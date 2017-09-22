package org.subha.corejavapractice;

public class ReturnInsideCatch {

//	int i=1;
	public static void main(String[] args) {
		System.out.println(new ReturnInsideCatch().returnint());
		
	}
	public int returnint() {
		try {
			int i=1;
			i++;
			return i;
		} finally {
			int i=2;
			i++ ;
			return i;
		}
	}

}
