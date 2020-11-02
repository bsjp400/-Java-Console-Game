package Examples;

public class For_example {

	public static void main(String[] args) {

		int 라인 = 0;
		int 별 = 0;
		int 공백 = 0;

		for (int i = 0; i <= 5 * 2; i++) {
			System.out.print(i + "\t");
			for (int j = 0; j <= 5; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}

		for (라인 = 1; 라인 <= 5; 라인++) { // 5개의 라인 출력
			for (별 = 1; 별 <= 라인; 별++) { // 라인의 갯수만큼 별 출력
				System.out.print("*");
			}
			System.out.println("");
		}

		for (라인 = 1; 라인 <= 5; 라인++) { // 5개의 라인 출력
			for (별 = 라인; 별 <= 5; 별++) { // 라인의 갯수만큼 0 출력
				System.out.print("0");
			}
			System.out.println("");
		}

		for (라인 = 1; 라인 <= 5; 라인++) { // 5개의 라인 출력
			for (별 = 라인; 별 <= 5; 별++) { // 라인의 -1 (4개 라인) 갯수만큼 0 출력
				System.out.print("0");
			}
			for (별 = 1; 별 <= 라인; 별++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (라인 = 1; 라인 <= 5; 라인++) { // 5개의 라인 출력
			for (별 = 1; 별 <= (2 * 라인) - 1; 별++) { // 라인의 갯수만큼 별 출력
				System.out.print("*");
			}
			System.out.println("");

		}
		for (라인 = 1; 라인 <= 15; 라인++) { // 10개의 라인 출력
			for (공백 = 라인; 공백 < 15; 공백++) { // 라인 갯수 -1 만큼 공백 출력
				System.out.print("0");
			}
			for (별 = 1; 별 <= (2 * 라인) - 1; 별++) { // 라인의 갯수만큼 별 출력
													// (2 * 라인) -1을 한것은 홀수로 별이 출력되어 피라미드 모양을 갖추기 위함.
				System.out.print("*");
			}
			System.out.println("");
		}
		for (라인 = 1; 라인 < 15; 라인++) { // 10개 라인갯수 -1 만큼 출력
			for (공백 = 1; 공백 <= 라인; 공백++) { // 라인 갯수만큼 -1 만큼 0 출력.
				System.out.print("0");
			}
			for (별 = (2 * 라인) - 1; 별 <= (15 * 2) - 3; 별++) { // (2 * 라인) -1 한것은 각 라인별로 별이 출력 되기 위함
				System.out.print("*");
			}
			System.out.println("");
		}
		for (라인 = 1; 라인 <= 5; 라인++) { // 5개의 라인 출력
			for (별 = 1; 별 <= 라인; 별++) { // 라인의 갯수만큼 별 출력
				System.out.print("*");
			}
			for (공백 = 5; 공백 == 라인; 공백--) {
				System.out.print("0");
			}
			System.out.println("");

		}
	}
}