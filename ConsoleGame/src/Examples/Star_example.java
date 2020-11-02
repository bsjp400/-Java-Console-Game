package Examples;

import java.util.Scanner;

public class Star_example {

	public static void main(String[] args) {

		int 라인 = 0;
		int 공백 = 0;
		int 별 = 0;
		int 크기 = 0;
		
		Scanner input = new Scanner (System.in) ;
		
		System.out.print("크기를 입력해주세요 >>>>");
		
		크기 = input.nextInt();
		
		// 머리 부분
		for (라인 = 0; 라인 <= 크기; 라인++) { 
			for (공백 = 라인; 공백 < 크기 * 3; 공백++) { 
				System.out.print(" ");
			}
			for (별 = 0; 별 <= (2 * 라인) ; 별++) { 
													
				System.out.print("*");
			}
			System.out.println("");
		}
		// 몸통부분
		for (라인 = 0; 라인 < 크기; 라인++) {
			for (공백 = 0; 공백 <= 라인; 공백++) {
				System.out.print(" ");
			}
			for (별 = (2 * 라인) -1 ; 별 <= (크기 * 6) -4; 별++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// 다리부분
		for (라인 = 1; 라인 <= 크기; 라인++) {
			// 왼쪽 역삼각형 공
			for (공백 = 라인 - 1; 공백 < 크기 ; 공백++) {
				System.out.print(" ");
			}
			// 왼쪽 별 다리
			for (별 = (2 * 라인) ; 별 <= 크기 * 2; 별++) {
				System.out.print("*");
			}
			//가운데 공백
			for (공백 = 3; 공백 <= 3 * 라인; 공백++) {
				System.out.print(" ");
			}
			for (공백 = 3; 공백 <= 3 * 라인; 공백++) {
				System.out.print(" ");
			}
			// 오른쪽 다 
			for (별 = (크기 * 2) -1; 별 >= (2 * 라인) -1; 별--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}