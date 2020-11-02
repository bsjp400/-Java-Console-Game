package Examples;

import java.util.Random;

public class ExampleClass2 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int ran = 0;
		boolean check;
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			ran = r.nextInt(10) +1;
			check = true;
			
			for (int j = 0; j<i; j++) {
				if(arr[j] == ran) {
					i--;
					check = false;
				}
			}
			if (check) 
				arr[i] = ran;
			}
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}