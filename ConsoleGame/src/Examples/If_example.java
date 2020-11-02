package Examples;

import java.util.Scanner; //Scanner 클래스의 사용을 위해 'java.util'이라는 패키지를 사용

public class If_example {

	public static void main(String[] args) {

		int select = 0;

		Scanner todo = new Scanner(System.in); // new Scanner(System.in) 부분은 Scanner 타입의 객체를 생성하는 부분.
												// Scanner todo 부분은 input이라 변수를 Scanner 타입으로 선언하는 부분.
												// System.in은 키보드 입력 값을 읽고 원하는 타입으로 변환하여 리턴하는 부분.

		System.out.println("--------------------------------------");
		System.out.println("          치킨을 배달시켜 먹어보자.        ");
		System.out.println(" 1. 교촌 | 2. bhc | 3. bbq | 4. 안먹는다.");
		System.out.println("--------------------------------------");
		System.out.print("선택>>>");

		select = todo.nextInt(); // //nextInt()은 입력받은 내용을 정수형으로 저장 받는 부분

		// 선택지 1. 교촌

		if (select == 1) { // == 는 정수형타입의 값을 비교할때 사용.
							// .equals는 문자열타입의 값을 비교할때 사용.

			System.out.println("------------------------------------");
			System.out.println("            무엇을  시킬까?            ");
			System.out.println(" 1. 오리지날 | 2. 허니 콤보 | 3. 레드 콤보 ");
			System.out.println("------------------------------------");
			System.out.print("선택>>>");

			select = todo.nextInt();

			// 선택지 1. 교촌 - 1. 오리지날

			if (select == 1) {
				System.out.println("----------------------------------------");
				System.out.println("    그냥 저냥 먹었다. 배도 부르니 무엇을 할까?   ");
				System.out.println(" 1. 공부를 한다 | 2. 게임을 한다 | 3. 잠을 잔다 ");
				System.out.println("----------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();

				if (select == 1) {
					System.out.println("-------------------------");
					System.out.println(" 축하합니다. 개발자가 되셨습니다.");
					System.out.println("-------------------------");
				}

				else if (select == 2) {
					System.out.println("----------------------------");
					System.out.println(" 축하합니다. 프로게이머가 되셨습니다.");
					System.out.println("----------------------------");
				}

				else if (select == 3) {
					System.out.println("------------------------------");
					System.out.println(" 백수가 되셨네요. 인생은 한번 뿐입니다.");
					System.out.println("        다시 시작은 없습니다.      ");
					System.out.println("------------------------------");
				}
			}

			// 선택지 1. 교촌 - 2. 허니 콤보

			else if (select == 2) {
				System.out.println("-----------------------------------------");
				System.out.println("   달달하니 맛있게 먹었다. 배도 부르니 무엇을 할까?  ");
				System.out.println(" 1. 공부를 한다 | 2. 카페를 간다 | 3. 술을 먹는다 ");
				System.out.println("-----------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();

				if (select == 1) {
					System.out.println("-------------------------");
					System.out.println(" 축하합니다. 개발자가 되셨습니다.");
					System.out.println("-------------------------");
				}

				else if (select == 2) {
					System.out.println("---------------------------");
					System.out.println(" 축하합니다. 바리스타가 되셨습니다.");
					System.out.println("---------------------------");
				}

				else if (select == 3) {
					System.out.println("-------------------------------------");
					System.out.println(" 알코올 중독자가 되셨네요. 인생은 한번 뿐입니다.");
					System.out.println("           다시 시작은 없습니다.          ");
					System.out.println("-------------------------------------");
				}
			}

			// 선택지 1. 교촌 - 2. 레드 콤보

			else if (select == 3) {
				System.out.println("------------------------------------------");
				System.out.println(" 너무 맛있게 먹었다. 기분도 좋아졌으니 무엇을 할까? ");
				System.out.println(" 1. 여행을 간다 | 2. 쇼핑을 한다 | 3. 공부를 한다.");
				System.out.println("------------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();

				if (select == 1) {
					System.out.println("-----------------------------------");
					System.out.println(" 밖은 코로나로 위험합니다. 외출을 자제 합시다.");
					System.out.println(" 마스크 꼭 착용하고 건강은 스스로 챙깁시다.");
					System.out.println("-----------------------------------");
				}

				else if (select == 2) {
					System.out.println("----------------------------------");
					System.out.println(" 돈이 없습니다.. 열심히 공부해서 취직합시다.");
					System.out.println("----------------------------------");
				}

				else if (select == 3) {
					System.out.println("-------------------------");
					System.out.println(" 축하합니다. 개발자가 되셨습니다.");
					System.out.println("-------------------------");
				}
			}
		}

		// 선택지 2. bhc

		else if (select == 2) {
			System.out.println("------------------------------------");
			System.out.println("            무엇을  시킬까?            ");
			System.out.println(" 1. 핫 뿌링클 | 2. 맛초킹 | 3.  블랙올리브 ");
			System.out.println("------------------------------------");
			System.out.print("선택>>>");

			select = todo.nextInt();

			// 선택지 2. bhc - 1. 핫 뿌링클.

			if (select == 1) {
				System.out.println("------------------------------------------");
				System.out.println(" 너무 맛있게 먹었다. 기분도 좋아졌으니 무엇을 할까? ");
				System.out.println(" 1. 여행을 간다 | 2. 쇼핑을 한다 | 3. 공부를 한다");
				System.out.println("------------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();

				if (select == 1) {
					System.out.println("-----------------------------------");
					System.out.println(" 밖은 코로나로 위험합니다. 외출을 자제 합시다.");
					System.out.println(" 마스크 꼭 착용하고 건강은 스스로 챙깁시다.");
					System.out.println("-----------------------------------");
				}

				else if (select == 2) {
					System.out.println("----------------------------------");
					System.out.println(" 돈이 없습니다.. 열심히 공부해서 취직합시다.");
					System.out.println("----------------------------------");
				}

				else if (select == 3) {
					System.out.println("-------------------------");
					System.out.println(" 축하합니다. 개발자가 되셨습니다.");
					System.out.println("-------------------------");

				}

			}

			// 선택지 2 bhc - 2. 맛초킹

			else if (select == 2) {
				System.out.println("-----------------------------------------");
				System.out.println("    그냥 저냥 먹었다. 배도 부르니 무엇을 할까?    ");
				System.out.println(" 1. 공부를 한다 | 2. 게임을 한다 | 3. 잠을 잔다 ");
				System.out.println("-----------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();

				if (select == 1) {
					System.out.println("-------------------------");
					System.out.println(" 축하합니다. 개발자가 되셨습니다.");
					System.out.println("-------------------------");

				}

				else if (select == 2) {
					System.out.println("----------------------------");
					System.out.println(" 축하합니다. 프로게이머가 되셨습니다.");
					System.out.println("----------------------------");

				}

				else if (select == 3) {
					System.out.println("------------------------------");
					System.out.println(" 백수가 되셨네요. 인생은 한번 뿐입니다.");
					System.out.println("        다시 시작은 없습니다.      ");
					System.out.println("------------------------------");
				}

			}

			// 선택지 2. bhc - 3. 블랙올리브

			else if (select == 3) {
				System.out.println("-----------------------------------------");
				System.out.println("   무슨 맛인지 모르겠다. 배도 부르니 무엇을 할까?  ");
				System.out.println(" 1. 공부를 한다 | 2. 카페를 간다 | 3. 술을 먹는다 ");
				System.out.println("-----------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();

				if (select == 1) {
					System.out.println("-------------------------");
					System.out.println(" 축하합니다. 개발자가 되셨습니다.");
					System.out.println("-------------------------");
				}

				else if (select == 2) {
					System.out.println("---------------------------");
					System.out.println(" 축하합니다. 바리스타가 되셨습니다.");
					System.out.println("---------------------------");
				}

				else if (select == 3) {
					System.out.println("-------------------------------------");
					System.out.println(" 알코올 중독자가 되셨네요. 인생은 한번 뿐입니다.");
					System.out.println("           다시 시작은 없습니다.          ");
					System.out.println("-------------------------------------");
				}
			}
		}

		// 선택지 3. bbq

		else if (select == 3) {
			System.out.println("------------------------------------------");
			System.out.println("                무엇을  시킬까?               ");
			System.out.println(" 1. 황금 올리브 | 2. 자메이카 통다리 | 3. 뱀파이어 ");
			System.out.println("------------------------------------------");
			System.out.print("선택>>>");

			select = todo.nextInt();

			// 선택지 3. bbq - 1. 황금 올리브

			if (select == 1) {
				System.out.println("-----------------------------------------");
				System.out.println("  고소하니 맛있게 먹었다. 배도 부르니 무엇을 할까?  ");
				System.out.println(" 1. 공부를 한다 | 2. 카페를 간다 | 3. 술을 먹는다 ");
				System.out.println("-----------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();

				if (select == 1) {
					System.out.println("-------------------------");
					System.out.println(" 축하합니다. 개발자가 되셨습니다.");
					System.out.println("-------------------------");
				}

				else if (select == 2) {
					System.out.println("---------------------------");
					System.out.println(" 축하합니다. 바리스타가 되셨습니다.");
					System.out.println("---------------------------");
				}

				else if (select == 3) {
					System.out.println("-------------------------------------");
					System.out.println(" 알코올 중독자가 되셨네요. 인생은 한번 뿐입니다.");
					System.out.println("           다시 시작은 없습니다.          ");
					System.out.println("-------------------------------------");
				}

			}

			// 선택지 3. bbq - 2. 자메이카 통다리

			else if (select == 2) {
				System.out.println("-----------------------------------------");
				System.out.println(" 너무 맛있게 먹었다. 기분도 좋아졌으니 무엇을 할까?");
				System.out.println(" 1. 여행을 간다 | 2. 쇼핑을 한다 | 3. 공부를 한다");
				System.out.println("-----------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();

				if (select == 1) {
					System.out.println("-----------------------------------");
					System.out.println(" 밖은 코로나로 위험합니다. 외출을 자제 합시다.");
					System.out.println(" 마스크 꼭 착용하고 건강은 스스로 챙깁시다.");
					System.out.println("-----------------------------------");
				}

				else if (select == 2) {
					System.out.println("----------------------------------");
					System.out.println(" 돈이 없습니다.. 열심히 공부해서 취직합시다.");
					System.out.println("----------------------------------");
				}

				else if (select == 3) {
					System.out.println("-------------------------");
					System.out.println(" 축하합니다. 개발자가 되셨습니다.");
					System.out.println("-------------------------");
				}
			}

			// 선택지 3. bbq - 3. 뱀파이어

			else if (select == 3) {
				System.out.println("-----------------------------------------");
				System.out.println("   무슨 맛인지 모르겠다. 배도 부르니 무엇을 할까?  ");
				System.out.println(" 1. 공부를 한다 | 2. 카페를 간다 | 3. 술을 먹는다 ");
				System.out.println("-----------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();

				if (select == 1) {
					System.out.println("-------------------------");
					System.out.println(" 축하합니다. 개발자가 되셨습니다.");
					System.out.println("-------------------------");
				}

				else if (select == 2) {
					System.out.println("---------------------------");
					System.out.println(" 축하합니다. 바리스타가 되셨습니다.");
					System.out.println("---------------------------");
				}

				else if (select == 3) {
					System.out.println("-------------------------------------");
					System.out.println(" 알코올 중독자가 되셨네요. 인생은 한번 뿐입니다.");
					System.out.println("           다시 시작은 없습니다.          ");
					System.out.println("-------------------------------------");
				}
			}
		}

		else {

			System.out.println("--------------------------------");
			System.out.println("           종료되엇습니다.          ");
			System.out.println("--------------------------------");
		}

		todo.close();

	}
}