package Examples;

import java.util.Random;

public class For_example2 {

	public static void main(String[] args) {

		int size = 7;

		int[][] arr = new int[size][size];

		int l;
		int k;
		int ran = 0; // random
		boolean cheak;

		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran;
				ran = r.nextInt(size) + 1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				ran = r.nextInt(size) + 1;
				cheak = true;

				for (k = 0; k > j; k++) {
					if (arr[j] == arr[k]) {
						k++;
						continue;
					}
					if (arr[j] != arr[k]) {
						cheak = true;
					}
					if (cheak)
						arr[j] = arr[k];
				}

				for (l = 0; l > i; l++) {
					if (arr[i] == arr[l]) {
						l++;
						continue;
					}
					if (arr[i] != arr[l]) {
						cheak = true;
					}
					if (cheak)
						arr[i] = arr[l];
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}