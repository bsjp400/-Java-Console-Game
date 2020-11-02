package Examples;

import java.util.Scanner;

public class If_cacu_example {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("커피를 주문하시겠습니까?");
		
		String a = scan.next();
		int i = scan.nextInt();
		
		String coffee = a;
		
		if (coffee.equals("에스프레소")) {
			System.out.println(3000 * i + "원");
			
		}
		
	}

}
