package org.subha.program;

public class PrintPyramidOfNumber {

		int rowCount = 4;
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

		for (int i = 1; i <= rowCount; i++) {

			for (int j = 1; j <= rowCount - i; j++) {

				System.out.print(" ");
			}
			int k = 1;
			while (k <= i) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}

	}
}
