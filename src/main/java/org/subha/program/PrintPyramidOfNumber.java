package org.subha.program;

public class PrintPyramidOfNumber {

	public static void main(String[] arr) {
		int rowCount = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(rowCount + " ");

			}
			System.out.println();
			rowCount++;

		}
	}
}
