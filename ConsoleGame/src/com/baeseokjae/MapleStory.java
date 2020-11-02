package com.baeseokjae;

import java.util.Scanner;

public class MapleStory {

	// 입력값을 받을 변수
	static int select = 0;
	// 닉네임, 레벨, 메소, 체력, 고정력, 마나, 고정마나, 공격력, 기본공격 스피드, 방어력, 경험치,
	static Adel Adel = new Adel("", 3, 100000, 300, 300, 50, 50, 600, 10, 0, 0,
			// 레벨경험치, 스탯포인트, 스킬포인트, 공격스킬, 공격스킬 마나, 버프스킬, 버프스킬마나, 아이템능력치, 아이템1능력치, 아이템2능력치,
			200, 0, 0, 50, 10, 50, 10, 10, 30, 50,
			// 아이템가격, 아이템1가격, 아이템2가격, 무기개수, 무기1개수, 무기2개수, 방어구개수, 방어구1개수, 방어구2개수,
			300, 500, 1000, 1, 1, 1, 1, 1, 1,
			// 체력포션개수, 체력포션1개수, 체력포션2개수, 마나포션개수, 마나포션1개수,마나포션2개수
			10, 0, 0, 10, 0, 0,
			// 무기이름, 무기1이름, 무기2이름, 방어구이름, 아머1이름, 아머2이름, 체력포션이름, 체력포션1이름, 체력포션2이름, 마나포션이름,
			// 마나포션1이름, 마나포션2이름,
			// 스탯창장비, 스탯창포션, 스탯창방어구, 인벤토리무기, 인벤토리무기1, 인벤토리무기2, 인벤토리체력포션, 인벤토리체력포션1,
			// 인벤토리체력포션2, 인벤토리 마나포션
			// 인벤토리마나포션1, 인벤토리마나포션2, 인벤토리방어구, 인벤토리방어구1, 인벤토리방어구2
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 1, 1);
	// 몬스터
	static Monster monster;
	// 주황 버섯 인스턴스화
	static Mushroom Mushroom = new Mushroom("주황버섯", 1, 200, 0, 50, 0, 15, 100, 1000, 0, 0);
	// 머쉬맘 인스턴스화
	static BossMushroom bossMushroom = new BossMushroom("머쉬맘", 2, 400, 0, 100, 0, 30, 200, 2000, 50);
	// 슬라임 인스턴스화
	static Slime Slime = new Slime("슬라임", 2, 400, 0, 100, 0, 100, 200, 1000, 0);
	// 킹슬라임 인스턴스화
	static BossSlime bossSlime = new BossSlime("킹슬라임", 4, 800, 0, 200, 0, 200, 400, 2000, 50);
	// 주니어 발록 인스턴스화
	static Barlock Barlock = new Barlock("발록", 10, 2000, 0, 200, 0, 100, 0, 0, 0);
	// 전투 쓰레드를 구현하기 위한 클래스
	static AdelBattleThread AdelBattle;
	// 에픽 몬스터 전투 쓰레드를 구현하기 위한 클래스
	static AdelBossBattleThread AdelBossBattle;
	// 선택지 메소드 클래스
	static Service Service = new Service();
	// 상점 클래스
	static Shop Shop = new Shop();
	// 환경 변수 쓰레드
	static Environment Environment = new Environment(Adel);
	// 환경 쓰레드를 담고있는 클래스
	static EnvironmentThread EnvironmentThread = new EnvironmentThread();
	// 에픽 몬스터를 잡으면 버프 생성되는 쓰레드
	static Buff buff;
	// 에픽 몬스터 메소드
	static BuffThread BuffThread = new BuffThread();
	// 매크로 확인 쓰레드
	static MacroCheck MacroCheck = new MacroCheck();

	public static void main(String args[]) {
		// 배경음악
		Music introMusic = new Music("MapleStoryTitle.mp3", true);
		// 처음 시작 문구 출력 클래스 객체화
		Interface Interface = new Interface();
		// 처음 시작 문구 출력 스레드
		Thread tutorial = new Thread(Interface);

		// 메뉴의 선택지 선택시 입력값을 받을 변수
		String input;
		// 스캐너 클래스
		Scanner choice = new Scanner(System.in);

		while (true) {
			// 배경음악 시작
			introMusic.start();
			// 메이플스토리 로고 출력.
			System.out.println(Interface.titleLogo);
			// 1. 튜토리얼 2. 건너뛰기
			System.out.println(Interface.startLine);
			select = choice.nextInt();
			// 1. 튜토리얼 시작
			if (select == 1) {
				// 처음 게임 시작 문구 출력
				tutorial.run();
				input = choice.next();
				System.out.println(" --------------------------------------");
				System.out.println(" 게임을 시작하도록 하겠습니다");
				System.out.println(" 이름을 설정해 주세요.");
				System.out.println(" --------------------------------------");
				System.out.println("입력>>>");
				input = choice.next();
				// 캐릭터 닉네임 설정
				Adel.Setname(input);
				System.out.println(" --------------------------------------");
				System.out.println(" 닉네임이 " + Adel.Getname() + " 으로 설정되었습니다");
				System.out.println(" --------------------------------------");
				// 게임 시작 안내 문구.
				Interface.Lobby();
			} // 1. 튜토리얼 끝
				// 2. 건너뛰기 시작
			else if (select == 2) {
				System.out.println(" --------------------------------------");
				System.out.println(" 게임을 시작하도록 하겠습니다");
				System.out.println(" 이름을 설정해 주세요.");
				System.out.println(" --------------------------------------");
				System.out.println("입력>>>");
				input = choice.next();
				// 캐릭터 닉네임 설정
				Adel.Setname(input);
				System.out.println(" --------------------------------------");
				System.out.println(" 닉네임이 " + Adel.Getname() + " 으로 설정되었습니다");
				System.out.println(" --------------------------------------");
				// 게임 시작 안내 문구.
				// Interface.Lobby();
			} // 2. 건너뛰기 끝
			EnvironmentThread.autoEnvironment(Adel, monster, bossMushroom, bossSlime);
//			MacroCheck.start();
			while (true) {
				if (Adel.Barlock == 3) {
					System.out.println(Interface.Ending);
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" 축하합니다. 보스를 처리하셨습니다.");
					System.out.println(" ----------------------------------------------------------------------");
					return;
				}
				// 캐릭터 기본정보가 담겨있는 스탯창 출력
				Service.startStat(Adel);
				// 1. 게임시작 2. 스탯창 3. 인벤토리 4. 상점
				Interface.GameLobby();
				
				input = choice.next();
				// 선택지 1. 게임시작
				switch (input) {
				case "1":
					// 게임시작 문구 (1. 헤네시스 2.엘리니아 3. 보스사냥 4. 로비로 가기.)
					Interface.DungeonLobby();
					input = choice.next();
					// "1". 헤네시스 시작
					switch (input) {
					case "1":
						if (Adel.level < Mushroom.level) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out
									.println(" " + Mushroom.level + "레벨 부터 입장가능합니다." + "현재 " + Adel.level + "레벨 입니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;
						}
						// 배경음악 종료
						introMusic.close();
						// "1". 헤네시스 배경음악 객체화
						introMusic = new Music("Henesis.mp3", true);
						// "1". 헤네시스 배경음악 시작
						introMusic.start();
						// "1". 헤네시스 입장 문구 출력
						Interface.Henesis();
						// 주황버섯 이미지 출력
						while (true) {
							if (Adel.MushroomCount == 1) {
								System.out.println(Interface.Mushroom);
								/*
								 * 주황버섯 몬스터 객체화 몬스터 이름, 레벨, 체력, 마나, 공격력, 방어력, 경험치, 메소
								 */
								Mushroom = new Mushroom("주황버섯", 1, 200, 0, 50, 0, 15, 100, 1000, 0, 0);
								AdelBattle = new AdelBattleThread();
								AdelBattle.autoBattle(Adel, Mushroom);
								// "1". 헤네시스 배경음악 종료
								introMusic.close();
								// 로비 배경음악 객체화
								introMusic = new Music("MapleStoryTitle.mp3", true);
								// 로비 배경음악 시작
								introMusic.start();
								break;
							} else if (Adel.MushroomCount == 2) {
								System.out.println(Interface.BossMushroom);
								// TODO 머쉬맘 아스키아트 넣기.
								/*
								 * 에픽 몬스터 객체화 일반 몬스터보다 "2"배의 능력치 보유
								 */
								bossMushroom = new BossMushroom("머쉬맘", 2, 400, 0, 100, 0, 30, 200, 2000, 50);
								AdelBossBattle = new AdelBossBattleThread();
								AdelBossBattle.autoBattle(Adel, bossMushroom);
								// "1". 헤네시스 배경음악 종료
								introMusic.close();
								// 로비 배경음악 객체화
								introMusic = new Music("MapleStoryTitle.mp3", true);
								// 로비 배경음악 시작
								introMusic.start();
								break;
							}
						} // "1". 헤네시스 끝
						break;
					// "2". 엘리니아 시작
					case "2":
						if (Adel.level < Slime.level) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" " + Slime.level + "레벨 부터 입장가능합니다." + "현재 " + Adel.level + "레벨 입니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;
						}
						// 로비 배경음악 종료
						introMusic.close();
						// "2". 엘리니아 배경음악 객체화
						introMusic = new Music("Elenia.mp3", true);
						// "2". 엘리니아 배경음악 시작
						introMusic.start();
						// "2". 엘리니아 입장 문구 출력
						Interface.Elinia();
						while (true) {
							/*
							 * 슬라임 몬스터 객체화 몬스터 이름, 레벨, 체력, 마나, 공격력, 방어력, 경험치, 메소
							 */
							if (Adel.SlimeCount == 1) {
								// 슬라임 이미지 출력
								System.out.println(Interface.Slime);
								/*
								 * 슬라임 몬스터 객체화 몬스터 이름, 레벨, 체력, 마나, 공격력, 방어력, 경험치, 메소
								 */
								Slime = new Slime("슬라임", 2, 400, 0, 100, 0, 100, 200, 1000, 0);
								AdelBattle = new AdelBattleThread();
								AdelBattle.autoBattle(Adel, Slime);
								// "2". 엘리니아 배경음악 종료
								introMusic.close();
								// 로비 배경음악 객체화
								introMusic = new Music("MapleStoryTitle.mp3", true);
								// 로비 배경음악 시작
								introMusic.start();
								break;
							} else if (Adel.SlimeCount == 2) {
								// TODO 킹슬라임 아스키아트 넣기.
								System.out.println(Interface.BossSlime);
								/*
								 * 에픽 몬스터 객체화 일반 몬스터보다 "2"배의 능력치 보유
								 */
								bossSlime = new BossSlime("킹슬라임", 4, 800, 0, 200, 0, 200, 400, 2000, 50);
								AdelBossBattle = new AdelBossBattleThread();
								AdelBossBattle.autoBattle(Adel, bossSlime);
								// "1". 헤네시스 배경음악 종료
								introMusic.close();
								// 로비 배경음악 객체화
								introMusic = new Music("MapleStoryTitle.mp3", true);
								// 로비 배경음악 시작
								introMusic.start();
								break;
							}
						} // "2". 엘리니아 끝
						break;
					// "3". 보스사냥 시작
					case "3":
						if (Adel.level < Barlock.level) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" " + Barlock.level + "레벨 부터 입장가능합니다." + "현재 " + Adel.level + "레벨 입니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;
						}
						// 로비 배경음악 종료
						introMusic.close();
						// "3". 보스사냥 배경음악 객체화
						introMusic = new Music("Barlock.mp3", true);
						// "3". 보스사냥 배경음악 시작
						introMusic.start();
						// "3". 보스사냥 입장 문구 출력
						Interface.Boss();
						// 보스 이미지 출력
						System.out.println(Interface.Barlock);
						while (true) {
							if (Adel.Barlock == 2) {
							/*
							 * 보스사냥 몬스터 객체화 몬스터 이름, 레벨, 체력, 마나, 공격력, 방어력, 경험치, 메소
							 */
							// TODO 자쿰 스탯 조정
							Barlock = new Barlock("발록", 10, 2000, 0, 200, 0, 100, 0, 0, 0);
							// 보스사냥 던전 사냥 메소드
							AdelBattle = new AdelBattleThread();
							AdelBattle.autoBattle(Adel, Barlock);
							// "3". 보스사냥 배경음악 종료
							introMusic.close();
							// 로비 배경음악 객체화
							introMusic = new Music("MapleStoryTitle.mp3", true);
							// 로비 배경음악 시작
							introMusic.start();
							// 몬스터 체력이 0일때 메소 획득 및 경험치 증가
							break;
							}
						}// 기본공격 끝
						break;
					// 보스사냥 끝
					case "4":
						Interface.lobbyOut();
						break;
					default:
						Interface.inputErr();
					}
					break;
				case "2":
					// "1". 스탯찍기 "2". 스킬찍기 "3". 로비로 가기
					Service.stat(Adel);

					input = choice.next();

					// "1". 스탯찍기
					switch (input) {
					case "1":
						// 스탯포인트가 0인지 판별하고 만약 0이라면 해당 결과값을 반환하는 메소드
						if (Service.statPointCheck(Adel) == false) {
							break;
						}
						/*
						 * "1". 스탯찍기 "1". hp "2". mp "3". atk
						 */
						Service.statPoint(Adel);

						input = choice.next();
						switch (input) {
						case "1":
							// hp 증가
							Service.hpStatup(Adel);
							break;
						
						case "2":
							// mp 증가
							Service.mpStatup(Adel);
							break;
						
						case "3":
							// atk 증가
							Service.atkStatup(Adel);
							break;
						}
						break;
					case "2":
						// 스킬포인트가 0인지 판별하고 만약 0이라면 해당 결과값을 반환하는 메소드
						if (Service.skillPointCheck(Adel) == false) {
							break;
						}
						/*
						 * "2". 스탯창 "1". 스킬찍기 "1". 공격스킬 "2". 버프스킬
						 */
						Service.skillPoint(Adel);

						input = choice.next();
						switch (input) {
						case "1":
							// 공격스킬 증가
							Service.activeSkillUp(Adel);
							break;
						
						case "2":
							// 버프스킬 증가
							Service.buffSKillup(Adel);
							break;
						}
						break;
					case "3":
						Interface.lobbyOut();
						break;
					}
					break;
				// "2". 아델 스탯창 끝.
				/*
				 * "3". 인벤토리. 무기 / 물약 / 방어구 "1". 장착 "2". 장착해제 "3". 나가기
				 */
				case "3":
					Service.inventory(Adel);

					input = choice.next();

					/*
					 * 1. 장착 1. 무기 2. 물약 3. 방어구
					 */
					switch (input) {
					case "1":
						// 인벤토리에 무기가 없는데 장착을 시도할떄 뜨는 문구.
						if (Service.EquipCheck(Adel, Shop) == false) {
							break;
						}
						/*
						 * "1". 보유 무기 리스트 "1" ~ "3" 선택. "3". 나가기
						 */
						Service.Equip();

						input = choice.next();
						/*
						 * 장착 가능한 무기 리스트 "1" ~"3"번 무기 리스트
						 */
						switch (input) {
						case "1":
							Service.EquipWeaponChoice(Adel);

							input = choice.next();

							// "1"번 무기 선택.
							switch (input) {
							case "1":
								// 장착 할 무기가 없을 때 장착 불가
								if (Service.EquipWeaponCheck(Adel, Shop) == false) {
									break;
								} // 장착 할 무기가 없을 때 장착 불가
									// "1"번 무기 장착
								Service.InventoryEquipWeapon(Adel, Shop);
								break;
							// "1"번 무기 끝.
							// "2"번 무기.
							case "2":
								// 장착 할 무기가 없을 때 장착 불가
								if (Service.EquipWeapon1Check(Adel, Shop) == false) {
									break;
								}
								// "2"번 무기 장착
								Service.InventoryEquipWeapon1(Adel, Shop);
								break;
							// "2"번 무기 끝
							// "3"번 무기
							case "3":
								// 장착 할 무기가 없을 때 장착 불가
								if (Service.EquipWeapon2Check(Adel, Shop) == false) {
									break;
								}
								// "3"번 무기 장착
								Service.InventoryEquipWeapon2(Adel, Shop);
								break;
							}// "3"번 무기 장착 끝
							break;
						// 보유 무기 리스트 끝
						// 보유 방어구 리스트
						case "2":
							Service.EquipArmorChoice(Adel);

							input = choice.next();

							switch (input) {
							case "1":
								// 장착 할 무기가 없을 때 장착 불가
								if (Service.EquipArmorCheck(Adel, Shop) == false) {
									break;
								}
								// "1"번 방어구 장착
								Service.InventoryEquipArmor(Adel, Shop);
								break;
							// "1"번 방어구 장착 끝
							// "2"번 방어구 장착
							case "2":
								// 장착 할 무기가 없을 때 장착 불가
								if (Service.EquipArmorCheck1(Adel, Shop) == false) {
									break;
								}
								// "2"번 방어구 장착
								Service.InventoryEquipArmor1(Adel, Shop);
								break;
							// "2"번 방어구 장착 끝
							// "3"번 방어구
							case "3":
								// 장착 할 무기가 없을 때 장착 불가
								if (Service.EquipArmorCheck2(Adel, Shop) == false) {
									break;
								}
								// "3"번 방어구 장착
								Service.InventoryEquipArmor2(Adel, Shop);
								break;
							} // "3"번 방어구 끝
							break;
						// 보유 방어구 리스트 끝.
						case "3":
							// 로비로 가기
							Interface.lobbyOut();
							break;
						}
						break;
					// 장착 해제
					case "2":
						// 장착한 아이템이 없으면 인벤토리에 아이템이 있더라도 실행 X
						if (Service.EquipReleaseCheck(Adel) == false) {
							break;
						}
						// 장착햔 아이템이 있을때 나오는 문구
						Service.EquipRelease();

						input = choice.next();
						switch (input) {
						// "1". 무기 장착 해제
						case "1":
							// 장착 해제 가능한 아이템
							Service.ReleaseWeaponChoice(Adel);

							input = choice.next();
							switch (input) {
							// "1"번 무기
							case "1":
								// 장착 해제할 아이템이 없을떄 나오는 문구
								if (Service.ReleaseWeaponCheck(Adel) == false) {
									break;
								}
								// "1"번 무기 장착 해제
								Service.ReleaseWeapon(Adel, Shop);
								break;
							// "1"번 무기 끝
							// "2"번 무기
							case "2":
								// 장착 해제할 아이템이 없을때 나오는 문구
								if (Service.ReleaseWeaponCheck1(Adel) == false) {
									break;
								}
								// "2"번 무기 장착 해제
								Service.ReleaseWeapon1(Adel, Shop);
								break;
							// "2"번 무기 끝
							// "3"번 무기
							case "3":
								// 장착 해제할 아이템이 없을때 나오는 문구
								if (Service.ReleaseWeaponCheck2(Adel) == false) {
									break;
								}
								// "3"번 무기 장착 해제
								Service.ReleaseWeapon2(Adel, Shop);
								break;
							} // "3"번 무기 끝
							break;
						// "2". 방어구 장착 해제
						case "2":
							// 장착 해제 가능한 아이템
							Service.ReleaseArmorChoice(Adel);

							input = choice.next();
							switch (input) {
							// "1"번 방어구
							case "1":
								// 장착 해제할 아이템이 없을때 나오는 문구
								if (Service.ReleaseArmorCheck(Adel) == false) {
									break;
								}
								// "1"번 방어구 장착 해제
								Service.ReleaseArmor(Adel, Shop);
								break;
							// "1"번 방어구 끝
							// "2"번 방어구
							case "2":
								// 장착 해제할 아이템이 없을때 나오는 문구
								if (Service.ReleaseArmorCheck1(Adel) == false) {
									break;
								}
								// "2"번 방어구 장착 해제
								Service.ReleaseArmor1(Adel, Shop);
								break;
							// "2"번 방어구 끝
							// "3"번 방어구
							case "3":
								// 장착 해제할 아이템이 없을때 나오는 문구
								if (Service.ReleaseArmorCheck2(Adel) == false) {
									break;
								}
								// "3"번 방어구 장착 해제
								Service.ReleaseArmor2(Adel, Shop);
								break;
							} // "3"번 방어구 끝.
							break;
						} // 장착 해제 끝
						break;
					// "3". 물약 사용
					case "3":
						// 보유 물약 리스트
						Service.itemUse(Adel);
						input = choice.next();
						// "1". 기본 체력 물약
						switch (input) {
						case "1":
							// 물약갯수가 0 이거나, 체력이 풀이면 실행 불가, 앞의 조건 만족시 실행
							if (Service.hpPostion(Adel,Shop) == true) {
								break;
							}
							break;
						// "1". 기본 체력 물약 끝
						// "2". 빨강 물약
						case "2":
							// 물약갯수가 0 일때 접근 불가
							if (Service.hpPostion1(Adel,Shop) == true) {
								break;
							}
							break;
						// "2". 빨강 물약 끝
						// "3". 체력 엘릭서
						case "3":
							// 물약갯수가 0 이거나, 체력이 풀이면 실행 불가, 앞의 조건 만족시 실행
							if (Service.hpPostion2(Adel,Shop) == true) {
								break;
							}
							break;
						// "3". 체력 엘릭서 끝
						// "1". 기본 마나 물약
						case "4":
							// 물약갯수가 0 이거나, 체력이 풀이면 실행 불가, 앞의 조건 만족시 실행
							if (Service.mpPostion(Adel,Shop) == true) {
								break;
							}
							break;
						// "1". 기본 마나 물약 끝
						// "2". 파랑 물약
						case "5":
							// 물약갯수가 0 이거나, 체력이 풀이면 실행 불가, 앞의 조건 만족시 실행
							if (Service.mpPostion1(Adel,Shop) == true) {
								break;
							}
							break;
						// "2". 파랑 물약 끝
						// "3". 마나 엘릭서
						case "6":
							// 물약갯수가 0 이거나, 체력이 풀이면 실행 불가, 앞의 조건 만족시 실행
							if (Service.mpPostion2(Adel,Shop) == true) {
								break;
							} // "3". 마나 엘릭서 끝
							break;
						} // 7. 로비로 가기 끝
						break;
					// "3". 물약 사용 끝
					// "4". 로비로 가기
					case "4":
						Interface.lobbyOut();
						break;
					// "4". 로비로 가기 끝
					}
					break;
				// "3". 인벤토리 끝.
				/*
				 * "4". 상점. "1". 무기 "2". 물약 "3". 방어구 "4". 나가기
				 */
				case "4":
					Shop.shop(Adel);

					input = choice.next();
					/*
					 * "1".무기 "1". 평볌한 칼 "2". 좋은 칼. "3". 강력한 칼 "4". 나가기
					 */
					switch (input) {
					case "1":
						Shop.Weapon(Adel);

						input = choice.next();
						switch (input) {
						// "1". 평범한 칼 구매
						case "1":
							Shop.WeaponBuy(Adel);
							break;
						// "2". 좋은 칼 구매
						case "2":
							Shop.Weapon1Buy(Adel);
							break;
						// "3". 강력한 칼 구매
						case "3":
							Shop.Weapon2Buy(Adel);
							break;
						}
						break;
					// "1". 무기 끝.
					/**
					 * "2". 방어구 "1". 평범한 방어구 "2". 좋은 방어구 "3". 강력한 방어구 "4". 나가기
					 */
					case "2":
						Shop.Armor(Adel);

						input = choice.next();
						switch (input) {
						// "1". 평범한 방어구 구매
						case "1":
							Shop.ArmorBuy(Adel);
							break;
						// "2". 좋은 방어구 구매
						case "2":
							Shop.Armor1Buy(Adel);
							break;
						// "3". 강력한 방어구 구매
						case "3":
							Shop.Armor2Buy(Adel);
							break;
						}
						break;
					/*
					 * "3". 물약 "1". 체력 물약 "2". 마나 물약
					 */
					case "3":
						Shop.PostionChoice();

						input = choice.next();
						/*
						 * "1". 체력 물약 "1". 기본 체력 물약 "2". 빨강 물약 "3". 체력 엘릭서
						 */
						switch (input) {
						case "1":
							Shop.ShopHpPostion(Adel);

							input = choice.next();
							switch (input) {
							case "1":
								// 얼마나 구입할지 갯수 메소드
								Shop.PostionCount();

								select = choice.nextInt();
								// 아이템갯수에 입력값을 받음
								Adel.SethpPostionCount(select);
								// 입력한 갯수만큼 아이템 구매 및 돈 차감
								Shop.hpPostionbuy(Adel);
								break;

							// "2". 빨강 물약 구매
							case "2":
								// 얼마나 구입할지 갯수 메소드
								Shop.PostionCount();

								select = choice.nextInt();
								// 아이템갯수에 입력값을 받음
								Adel.SethpPostion1Count(select);
								// 입력한 갯수만큼 아이템 구매 및 돈 차감
								Shop.hpPostion1buy(Adel);
								break;

							// "3". 체력 엘릭서 구매
							case "3":
								// 얼마나 구입할지 갯수 메소드
								Shop.PostionCount();

								select = choice.nextInt();
								// 아이템갯수에 입력값을 받음
								Adel.SethpPostion2Count(select);
								// 입력힌 갯수만큼 아이템 구매 및 돈 차감
								Shop.hpPostion2buy(Adel);
								break;
							}
							break;
						// "1". 체력 물약 끝.
						/*
						 * "2". 마나 물약 "1". 기본 마나 물약 "2". 파란 물약 "3". 마나 엘릭서
						 */
						case "2":
							Shop.ShopMpPostion(Adel);

							input = choice.next();
							// "1". 기본 마나 물약 구매
							switch (input) {
							case "1":
								Shop.PostionCount();

								select = choice.nextInt();
								// 아이템갯수에 입력값을 받음
								Adel.SetmpPostionCount(select);
								// 입력한 개수만큼 아이템 구매 및 돈 차감
								Shop.mpPostionbuy(Adel);
								break;

							// "2". 파란 물약 구매
							case "2":
								Shop.PostionCount();

								select = choice.nextInt();
								// 아이템개수에 입력값을 받음
								Adel.SetmpPostion1Count(select);
								Shop.mpPostion1buy(Adel);
								break;

							// "3". 마나 엘릭서 구매
							case "3":
								Shop.PostionCount();

								select = choice.nextInt();
								// 아이템개수에 입력값을 받음
								Adel.SetmpPostion2Count(select);
								Shop.mpPostion2buy(Adel);
								break;
							}
							break;
						} // "2". 마나 물약 끝.
						break;
					// "3". 물약 끝.
					// "4". 로비로 가기
					case "4":
						Interface.lobbyOut();
						break;
					}
					break;
				// 4. 상점 끝.
				case "cheat":
					System.out.println("치트키 사용");
					Adel.level += 10;
//					Adel.hp += 1000;
//					Adel.mp += 1000;
//					Adel.adelHp += 1000;
//					Adel.adelMp += 1000;
//					Adel.atk += 1000;
//					Adel.defense += 1000;
//					Adel.money += 100000;
					break;
				case "hpmpup":
					System.out.println("치트 : hp 100 up");
					Adel.hp += 100;
					Adel.mp += 100;
					Adel.adelHp += 100;
					Adel.adelMp += 100;
					break;
				case "statup":
					System.out.println("스탯, 스킬 포인트 up");
					Adel.statPoint += 10;
					Adel.skillPoint += 10;
					break;
				case "barlock":
					Adel.SetBarlock(2);
					break;
				default:
					System.err.println("다시 입력해 주세요.");
				} // 1. 게임시작 끝.
			} // 게임 로비창 끝.
		} // if 1. 게임시작 안내창 끝.
	} // 메인 메소드 끝
}