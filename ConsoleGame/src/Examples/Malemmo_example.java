package Examples;

import java.util.Scanner;

public class Malemmo_example {

	public static void main(String[] args) {

		int 라인 = 0;
		int 별 = 0;
		int 공백 = 0;
		int 크기 = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("크기를 입력해주세요 >>>>");
		크기 = input.nextInt();

		for (라인 = 1; 라인 <= 크기; 라인++) {
			for (공백 = 라인; 공백 < 크기; 공백++) {
				System.out.print(" ");
			}
			for (별 = 0; 별 < (2 * 라인) - 1; 별++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (라인 = 1; 라인 < 크기; 라인++) { // 10개 라인갯수 -1 만큼 출력
			for (공백 = 1; 공백 <= 라인; 공백++) { // 라인 갯수만큼 -1 만큼 0 출력.
				System.out.print(" ");
			}
			for (별 = (2 * 라인) - 1; 별 <= (크기 * 2) - 3; 별++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
