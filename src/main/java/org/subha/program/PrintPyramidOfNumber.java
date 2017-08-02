package org.subha.program;

public class PrintPyramidOfNumber {

	public static void main(String[] arr) {
		int rowCount = 4;
		for (int i = 1; i <= 4; i++) {

			for (int j = rowCount - i; j >= 0; j--) {
				System.out.println(" ");
			}
			for(int k=i ; k>0;k--){
				System.out.println(i+" ");
			}
			System.out.println();
	}
}
