package org.subha.program;

public class PrintPyramidOfNumber {
	
	public void printPyramid(){

		int rowCount =4;
		for (int i = 1; i <= 4; i++) {

			for (int j = rowCount - i; j >= 0; j--) {
				System.out.println(" ");
			}
			for (int k = i; k > 0; k--) {
				System.out.println(i + " ");
			}
			System.out.println();

		}
		/////////////////////////////////////////////////////////////

		for (int ii = 1; ii <= rowCount; ii++) {

			for (int j = 1; j <= rowCount - ii; j++) {

				System.out.print(" ");
			}
			int k = 1;
			while (k <= ii) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}

	}
}
