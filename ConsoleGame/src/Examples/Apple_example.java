package Examples;

import static java.lang.Math.pow;

import java.util.Scanner;

public class Apple_example {

	public static void main(String[] args) {

		double x좌표 = 0;
		double y좌표 = 0;
		double x좌표값 = 0;
		double y좌표값 = 0;
		double 반지름 = 0;
		int 반지름값 = 0;
		
		Scanner 입력 = new Scanner(System.in);

		System.out.print("원의 반지름값을 입력해 주세요 >>>>");

		반지름값 = 입력.nextInt();

		for (x좌표 = -1; x좌표 <= 반지름값 ; x좌표++) {
			for (y좌표 = -1; y좌표 <= 반지름값 * 2 ; y좌표++) {
				x좌표값 = pow(x좌표 - 반지름값, 2);
				y좌표값 = pow(y좌표 - 반지름값, 2);
				반지름 = x좌표값 + y좌표값;
				if ((반지름값 * 반지름) <=(반지름값 * 반지름값) ) {
					System.out.print("* ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println("");
		}
	}
}