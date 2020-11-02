package Examples;

import java.util.Scanner; //Scanner 클래스의 사용을 위해 'java.util'이라는 패키지를 사용

public class Class_exmaple {

	public static void main(String[] args) {

		int select = 0;
		int hp = 500;
		int mp = 500;
		int atk = 100;
		int skill = 100;
		int monhp = 500;
		int monmp = 500;
		int monatk = 100;

		Scanner todo = new Scanner(System.in); // new Scanner(System.in) 부분은 Scanner 타입의 객체를 생성하는 부분.
												// Scanner todo 부분은 input이라 변수를 Scanner 타입으로 선언하는 부분.
												// System.in은 키보드 입력 값을 읽고 원하는 타입으로 변환하여 리턴하는 부분.
		while (true) {
			System.out.println("--------------------------------------");
			System.out.println(" 안녕하세요.메이플스토리 세계에 오신것을 환영합니다. 지금부터 게임을 시작하겠습니다.");
			System.out.println(" 직업은 아델로 시작하겠습니다. 30레벨을 달성하고 보스를 잡아 전직을 하시면 게임은 클리어 됩니다.");
			System.out.println(" 그럼 즐거운 시간 되시길...");
			System.out.println(" ");
			System.out.println(" 1. 게임시작 : 사냥터를 정해 몬스터를 사냥하고 레벨을 올릴 수 있습니다");
			System.out.println(" 2. 스탯창 : 캐릭터의 스탯을 올릴 수 있습니다.");
			System.out.println(" 3. 스킬창 : 캐릭터의 스킬을 올릴 수 있습니다.");
			System.out.println(" 4. 인벤토리 : 상점에서 구매한 아이템을 저장 및 사용할 수 있습니다");
			System.out.println(" 5. 상점 : 캐릭터에 장착할 아이템 및 물약을 구매할 수 있습니다.");
			System.out.println("--------------------------------------");
			System.out.print("선택>>>");

			select = todo.nextInt(); // //nextInt()은 입력받은 내용을 정수형으로 저장 받는 부분

			// 선택지 1. 게임시작
			if (select == 1) {

				System.out.println("------------------------------------------------");
				System.out.println(" 사냥을 시작하겠습니다. 어떤 사냥터로 가시겠습니까? ");
				System.out.println(" ");
				System.out.println(" 1. 헤네시스 : 1 ~ 15렙 사냥터 / 주황버섯 사냥터");
				System.out.println(" 2. 엘리니아 : 15 ~ 30렙 사냥터 / 슬라임 사냥터.");
				System.out.println(" 3. 보스사냥 : 30렙 달성시 사냥터 / 자쿰 사냥터");
				System.out.println("------------------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();

				// 선택지 1. 게임시작
				if (select == 1) {
					System.out.println("----------------------------------------");
					System.out.println(" 헤네시스에 도착하였습니다. 사냥을 시작하겠습니다. ");
					System.out.println("----------------------------------------");
					System.out.println(" ");
					System.out.println("----------------------------------------");
					System.out.println(" 내 캐릭터 스탯");
					System.out.println(" HP : " + hp);
					System.out.println(" MP : " + mp);
					System.out.println(" 공격력 : " + atk);
					System.out.println(" ---------------------------------------");
					System.out.println(" 주황버섯 스탯");
					System.out.println(" HP : " + monhp);
					System.out.println(" MP : " + monmp);
					System.out.println(" 공격력 : " + monatk);
					System.out.println(" ---------------------------------------");
					System.out.println(" 1. 공격 2. 스킬 사용 3. 도망치기");
					System.out.println(" 선택 >>>>>");

					select = todo.nextInt();

					if (select == 1) {
						monhp = (monhp - atk);
						System.out.println("----------------------------------------");
						System.out.println(" 헤네시스에 도착하였습니다. 사냥을 시작하겠습니다. ");
						System.out.println("----------------------------------------");
						System.out.println(" ");
						System.out.println("----------------------------------------");
						System.out.println(" 내 캐릭터 스탯");
						System.out.println(" HP : " + hp);
						System.out.println(" MP : " + mp);
						System.out.println(" 공격력 : " + atk);
						System.out.println(" ---------------------------------------");
						System.out.println(" 주황버섯 스탯");
						System.out.println(" HP : " + monhp);
						System.out.println(" MP : " + monmp);
						System.out.println(" 공격력 : " + monatk);
						System.out.println(" ---------------------------------------");
						System.out.println(" 1. 공격 2. 스킬 사용 3. 도망치기");
						System.out.println(" 선택 >>>>>");

						select = todo.nextInt();
					}

					else if (select == 3) {
					}
				}
			}

			else if (select == 2) {
				System.out.println("----------------------------------------");
				System.out.println(" 엘리니아에 도착하였습니다. 사냥을 시작하겠습니다. ");
				System.out.println("----------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();
			}

			else if (select == 3) {
				System.out.println("----------------------------------------");
				System.out.println(" 헤네시스에 도착하였습니다. 사냥을 시작하겠습니다. ");
				System.out.println("----------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();
			}

			// 선택지 2. 스탯창
			if (select == 2) {
				System.out.println("-----------------------------------------");
				System.out.println("  스탯창  ");
				System.out.println(" 체력 : 500");
				System.out.println(" 마나 : 500");
				System.out.println(" 방어력 : 50");
				System.out.println(" 힘 : 5");
				System.out.println(" 민첩 : 5");
				System.out.println(" 주문력 : 5");
				System.out.println(" 행운 : 5");
				System.out.println("-----------------------------------------");
				System.out.println(" 현재 스탯 포인트 : 여기다가 스탯포인트 구현하고 찍을 수 있게 구현");
				System.out.print("선택>>>");

				select = todo.nextInt();

			}

			// 선택지 3. 스킬창
			else if (select == 3) {
				System.out.println("-----------------------------------------");
				System.out.println(" 스킬창  ");
				System.out.println(" 공격스킬");
				System.out.println(" 1. 플레인 : 검을 크게 휘두른다");
				System.out.println(" 2. 샤드 : 검 조각이 날아다니며 공격한다.");
				System.out.println(" ");
				System.out.println(" 버프스킬");
				System.out.println(" 1. 루디먼트 : 모든 능력치를 올려준다");
				System.out.println("-----------------------------------------");
				System.out.println(" 현재 스킬 포인트 : 여기다가 스킬포인트 구현하고 찍을 수 있게 구현");
				System.out.print("선택>>>");

				select = todo.nextInt();

			}

			// 4. 인벤토리
			else if (select == 4) {
				System.out.println("-----------------------------------------");
				System.out.println("  인벤토리  ");
				System.out.println(" 현재 가지고 있는 아이템이 없습니다.");
				System.out.println("-----------------------------------------");
				System.out.print("선택>>>");

				select = todo.nextInt();
			}

			// 5. 상점
			else if (select == 5) {
				System.out.println("-----------------------------------------");
				System.out.println("  상점  ");
				System.out.println("  1. 물약 2. 무기. 3. 방어구  ");
				System.out.println(" 선택하세요.");
				System.out.println("-----------------------------------------");

				System.out.print("선택>>>");

				select = todo.nextInt();

				if (select == 1) {
					System.out.println("-----------------------------------------");
					System.out.println("  물약  ");
					System.out.println("  1. 빨간포션 : 체력을 100 올려준다.  ");
					System.out.println("  2. 파란포션 : 마나를 100 올려준다.  ");
					System.out.println("-----------------------------------------");
					System.out.println("어떤것을 구매하시겠습니까? >>>>>");
					select = todo.nextInt();

					if (select == 1) {
						System.out.println("-----------------------------------------");
						System.out.println("빨간 포션." + "몇개" + "를 구매하셨습니다.");
						System.out.println("-----------------------------------------");
					}

					if (select == 2) {
						System.out.println("-----------------------------------------");
						System.out.println("파란 포션" + "몇개" + "를 구매하셨습니다.");
						System.out.println("-----------------------------------------");
					}
				}

				else if (select == 2) {
					System.out.println("-----------------------------------------");
					System.out.println("  무기  ");
					System.out.println(" 1. 패이션스 : 10렙 무기.");
					System.out.println(" 2. 어너 : 20렙 무기.   ");
					System.out.println(" 3. 모데스티 : 30렙 무기.   ");
					System.out.println("-----------------------------------------");
					System.out.println("어떤것을 구매하시겠습니까? >>>>>");
					select = todo.nextInt();

					if (select == 1) {
						System.out.println("-----------------------------------------");
						System.out.println("페이션스" + "를 구매하셨습니다.");
						System.out.println("-----------------------------------------");
					}

					if (select == 2) {
						System.out.println("-----------------------------------------");
						System.out.println("어너" + "를 구매하셨습니다.");
						System.out.println("-----------------------------------------");
					}

					if (select == 3) {
						System.out.println("-----------------------------------------");
						System.out.println("모데스티" + "를 구매하셨습니다.");
						System.out.println("-----------------------------------------");
					}
				}

				else if (select == 3) {
					System.out.println("-----------------------------------------");
					System.out.println("  방어구  ");
					System.out.println(" 1. 기사단 갑옷 : 10렙 방어구  ");
					System.out.println(" 2. 좋은 기사단 갑옷 : 20렙 방어구  ");
					System.out.println(" 3. 강력한 기사단 갑옷 : 30렙 방어구  ");
					System.out.println("-----------------------------------------");
					System.out.println("어떤것을 구매하시겠습니까? >>>>>");
					select = todo.nextInt();

					if (select == 1) {
						System.out.println("-----------------------------------------");
						System.out.println("기사단 갑옷" + "을 구매하셨습니다.");
						System.out.println("-----------------------------------------");
					}
					if (select == 2) {
						System.out.println("-----------------------------------------");
						System.out.println("좋은 기사단 갑옷" + "을 구매하셨습니다.");
						System.out.println("-----------------------------------------");
					}
					if (select == 3) {
						System.out.println("-----------------------------------------");
						System.out.println("강력한 기사단 갑옷" + "을 구매하셨습니다.");
						System.out.println("-----------------------------------------");
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

}