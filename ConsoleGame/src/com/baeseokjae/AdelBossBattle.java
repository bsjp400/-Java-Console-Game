package com.baeseokjae;

import java.util.Scanner;

public class AdelBossBattle extends Thread {

	static int choice;

	Scanner input = new Scanner(System.in);
	Interface Interface = new Interface();
	MapleStory MapleStory;
	Adel Adel;
	Monster monster;
	BossMushroom bossMushroom;
	BossSlime bossSlime;
	Buff buff;
	Shop Shop = new Shop();
	Service service = new Service();
	boolean isRunAway = true;

	public AdelBossBattle(Adel Adel, Monster monster) {
		this.Adel = Adel;
		this.monster = monster;
	}

	@Override
	public void run() {
		int inputValue = 0;
		boolean isLoop = true;
		int timer = 1;
		try {
			while (!Thread.currentThread().isInterrupted() && isLoop) {
				if (monster.Gethp() > 0) {
					if (Adel.Gethp() > 0) {
						service.monsterAndUserState(Adel, monster);
						inputValue = input.nextInt();
					}
				}
				switch (inputValue) {
				case 1:// 일반공격
					if (Adel.Getatk() <= monster.Getdefense()) {
						System.out.println(" ");
						System.out.println(" ----------------------------------------------------------------------");
						System.out.println(" " + monster.name + "을 공격 하였습니다. 데미지는 " + 0 + "이 들어갔습니다.");
						System.out.println(" ----------------------------------------------------------------------");
						System.out.println(" ");
						break;
					}
					if (Adel.Gethp() > 0) {
						monster.hp -= Adel.atk - (monster.Getdefense());
						System.out.println(" ----------------------------------------------------------------------");
						System.out.println(" " + monster.Getname() + "을 공격 하였습니다. 데미지는 "
								+ (Adel.Getatk() - monster.Getdefense()) + "이 들어갔습니다.");
						System.out.println(" ----------------------------------------------------------------------");
					}
					if (Adel.Gethp() <= 0) {
						// 유저 케릭터가 사망시 hp가 -값이 나오지 않도록 0으로 대입
						Adel.Sethp(0);
						Adel.hp += Adel.adelHp / 4;
						System.out.println(" ----------------------------------------------------------------------");
						System.out.println(" 체력이 0 이 되어 사망하였습니다. 체력은 20% 회복되어 부활합니다");
						System.out.println(" 마을로 귀환합니다.");
						System.out.println(" ----------------------------------------------------------------------");
						System.exit(0);

					}
					if (monster.Gethp() <= 0) {
						// 몬스터가 죽었을 경우 hp가 -값이 나오지 않도록 0으로 대입
						monster.Sethp(0);
						service.monsterAndUserState(Adel, monster);
						if (Adel.MushroomCount == 2) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" " + monster.Getname() + "를 처리하셧습니다. ");
							System.out.println(" " + monster.Getmoney() + "메소를 획득하셨습니다.");
							System.out.println(" " + monster.Getmonexp() + "경험치를 획득하셨습니다.");
							System.out.println(" 30초 동안 모든 능력치가 " + monster.Getbuff() + "만큼 상승합니다.");
							System.out.println(" 마을로 귀환합니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							Adel.SetbossMushroom(4);
							Adel.SetMushroomCount(1);
							Adel.money += monster.Getmoney();
							Adel.exp += monster.Getmonexp();
								if (Adel.exp == Adel.levelexp) {
									Adel.Setexp(0);
									Adel.level++;
									Adel.levelexp = Adel.Getlevelexp() + 100;
									Adel.statPoint++;
									Adel.skillPoint++;
								}
								if (Adel.exp > Adel.levelexp) {
									Adel.Setexp(Adel.exp - Adel.levelexp);
								}
							Service.GetAdel().money += monster.Getmoney();
							Service.GetAdel().Setexp(monster.Getmonexp());
							isLoop = false;
							break;
						} else if (Adel.SlimeCount == 2) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" " + monster.Getname() + "를 처리하셧습니다. ");
							System.out.println(" " + monster.Getmoney() + "메소를 획득하셨습니다.");
							System.out.println(" " + monster.Getmonexp() + "경험치를 획득하셨습니다.");
							System.out.println(" 30초 동안 모든 능력치가 " + monster.Getbuff() + "만큼 상승합니다.");
							System.out.println(" 마을로 귀환합니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							Adel.SetbossSlime(4);
							Adel.SetSlimeCount(1);
							Adel.money += monster.Getmoney();
							Adel.exp += monster.Getmonexp();
							if (Adel.exp == Adel.levelexp) {
								Adel.Setexp(0);
								Adel.level++;
								Adel.levelexp = Adel.Getlevelexp() + 100;
								Adel.statPoint++;
								Adel.skillPoint++;
							}
							if (Adel.exp > Adel.levelexp) {
								Adel.Setexp(Adel.exp - Adel.levelexp);
							}
							Service.GetAdel().money += monster.Getmoney();
							Service.GetAdel().Setexp(monster.Getmonexp());
							isLoop = false;
							break;
						}
					}
					break;
				case 2:// 스킬사용
						// 케릭터가 보유한 Skill List를 출력
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println("어떤 스킬을 사용하시겠습니까?");
					System.out.println("1. 공격스킬 2. 버프스킬.");
					System.out.println(" ----------------------------------------------------------------------");

					choice = input.nextInt();

					// 사용하려는 스킬종류에 따라 적용범위가 달라진다.
					// 힐을 사용할 경우 유저의 HP를 상승시킴.
					if (choice == 1) {
						if (Adel.GetactiveSkill() <= monster.Getdefense()) {
							Adel.mp -= 10;
							System.out.println(" ----------------------------------------------------------------------");
							System.out.println(" 공격스킬을 사용하여 " + monster.name + "을 공격하였습니다. 데미지는 " + 0 + "이 들어갔습니다.");
							System.out.println(" ----------------------------------------------------------------------");
							break;
						}
						monster.hp -= Adel.GetactiveSkill();
						Adel.mp -= 10;
						System.out.println(" ----------------------------------------------------------------------");
						System.out.println(
								" 공격스킬을 사용했습니다. 데미지는 " + (Adel.GetactiveSkill() - monster.Getdefense()) + "이 들어갔습니다.");
						System.out.println(" ----------------------------------------------------------------------");
						// 보호막 스킬은 방어력을 상승시킴.
					} else if (choice == 2) {
						Adel.mp -= 10;
						Adel.hp += Adel.GetbuffSkill();
						Adel.adelHp += Adel.GetbuffSkill();
						Adel.mp += Adel.GetbuffSkill();
						Adel.adelMp += Adel.GetbuffSkill();
						Adel.defense += Adel.GetbuffSkill();
						Adel.atk += Adel.GetbuffSkill();
						System.out.println(" ----------------------------------------------------------------------");
						System.out.println(" 버프스킬을 사용했습니다. 일시적으로 공격력이 " + Adel.GetbuffSkill() + "만큼 증가하였습니다.");
						System.out.println(" ----------------------------------------------------------------------");
						// 스킬 사용시 몬스터가 죽을때.
					} else if (monster.Gethp() <= 0) {
						// 몬스터가 죽었을 경우 hp가 -값이 나오지 않도록 0으로 대입
						monster.Sethp(0);
						service.monsterAndUserState(Adel, monster);
						if (Adel.MushroomCount == 2) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" " + monster.Getname() + "를 처리하셧습니다. ");
							System.out.println(" " + monster.Getmoney() + "메소를 획득하셨습니다.");
							System.out.println(" " + monster.Getmonexp() + "경험치를 획득하셨습니다.");
							System.out.println(" 30초 동안 모든 능력치가 " + monster.Getbuff() + "만큼 상승합니다.");
							System.out.println(" 마을로 귀환합니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							Adel.SetbossMushroom(4);
							Adel.SetMushroomCount(1);
							Service.GetAdel().money += monster.Getmoney();
							Service.GetAdel().Setexp(monster.Getmonexp());
							if (Adel.exp == Adel.levelexp) {
								Adel.Setexp(0);
								Adel.level++;
								Adel.levelexp = Adel.Getlevelexp() + 100;
								Adel.statPoint++;
								Adel.skillPoint++;
							}
							if (Adel.exp > Adel.levelexp) {
								Adel.Setexp(Adel.exp - Adel.levelexp);
							}
							isLoop = false;
							break;
						} else if (Adel.SlimeCount == 2) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" " + monster.Getname() + "를 처리하셧습니다. ");
							System.out.println(" " + monster.Getmoney() + "메소를 획득하셨습니다.");
							System.out.println(" " + monster.Getmonexp() + "경험치를 획득하셨습니다.");
							System.out.println(" 30초 동안 모든 능력치가 " + monster.Getbuff() + "만큼 상승합니다.");
							System.out.println(" 마을로 귀환합니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							Adel.SetbossSlime(4);
							Adel.SetSlimeCount(1);
							Service.GetAdel().money += monster.Getmoney();
							Service.GetAdel().Setexp(monster.Getmonexp());
							if (Adel.exp == Adel.levelexp) {
								Adel.Setexp(0);
								Adel.level++;
								Adel.levelexp = Adel.Getlevelexp() + 100;
								Adel.statPoint++;
								Adel.skillPoint++;
							}
							if (Adel.exp > Adel.levelexp) {
								Adel.Setexp(Adel.exp - Adel.levelexp);
							}
							isLoop = false;
							break;
						}
					}
					// 유저의 MP가 없을경우 스킬을 사용할 수 없음.
					if (Adel.Getmp() <= 0) {
						System.out.println("마나가 부족하여 스킬을 사용할 수 없습니다.");
					}
					break;
				case 3:// 아이템 사용
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" 현재 보유하고있는 물약 갯수");
					System.out.println(" ");
					System.out.println(" 체력 물약");
					System.out.println(" 1. " + Adel.GethpPostion() + " : " + Adel.GethpPostionCount() + "개");
					System.out.println(" 2. " + Adel.GethpPostion1() + " : " + Adel.GethpPostion1Count() + "개");
					System.out.println(" 3. " + Adel.GethpPostion2() + " : " + Adel.GethpPostion2Count() + "개");
					System.out.println(" ");
					System.out.println(" 마나 물약");
					System.out.println(" 4. " + Adel.GetmpPostion() + " : " + Adel.GetmpPostionCount() + "개");
					System.out.println(" 5. " + Adel.GetmpPostion1() + " : " + Adel.GetmpPostion1Count() + "개");
					System.out.println(" 6. " + Adel.GetmpPostion2() + " : " + Adel.GetmpPostion2Count() + "개");
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" 어떤 아이템을 사용하시겠습니까?");
					System.out.println(" 1 ~ 3. 체력물약 / 4 ~ 6. 마나물약 ");
					System.out.println(" 선택 >>>>>");

					choice = input.nextInt();

					if (choice == 1) {
						if (Adel.GethpPostionCount() == 0) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 물약이 없습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;

						} else if (Adel.Gethp() == Adel.GetadelHp()) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 체력이 가득 차 있습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;

						} else if (Adel.Gethp() <= Adel.GetadelHp()) {
							Adel.hp += Shop.GetitemStat();
							Adel.hpPostionCount--;
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 아이템을 사용하였습니다. 체력이 " + Shop.GetitemStat() + "회복되었습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;
						}
						break;
					}
					if (choice == 2) {
						if (Adel.GethpPostion1Count() == 0) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 물약이 없습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;

						} else if (Adel.Gethp() == Adel.GetadelHp()) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 체력이 가득 차 있습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;
						} else if (Adel.Gethp() <= Adel.GetadelHp()) {
							Adel.hp += Shop.Getitem1Stat();
							Adel.hpPostion1Count--;
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 아이템을 사용하였습니다. 체력이 " + Shop.Getitem1Stat() + "회복되었습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;
						}
						break;
					}
					if (choice == 3) {
						if (Adel.GethpPostion2Count() == 0) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 물약이 없습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;

						} else if (Adel.Gethp() == Adel.GetadelHp()) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 체력이 가득 차 있습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;
						} else if (Adel.Gethp() <= Adel.GetadelHp()) {
							Adel.hp += Shop.Getitem2Stat();
							Adel.hpPostion2Count--;
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 아이템을 사용하였습니다. 체력이 " + Shop.Getitem2Stat() + "회복되었습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;
						}
						break;
					}
					if (choice == 4) {
						if (Adel.GetmpPostionCount() == 0) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 물약이 없습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;

						} else if (Adel.Getmp() == Adel.GetadelMp()) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 마나가 가득 차 있습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;

						} else if (Adel.Getmp() <= Adel.GetadelMp()) {
							Adel.mp += Shop.GetitemStat();
							Adel.mpPostionCount--;
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 아이템을 사용하였습니다. 마나가 " + Shop.GetitemStat() + "회복되었습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;
						}
						break;
					}
					if (choice == 5) {
						if (Adel.GetmpPostion1Count() == 0) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 물약이 없습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;

						} else if (Adel.Getmp() == Adel.GetadelMp()) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 마나가 가득 차 있습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;

						} else if (Adel.Getmp() <= Adel.GetadelMp()) {
							Adel.mp += Shop.Getitem1Stat();
							Adel.mpPostion1Count--;
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 아이템을 사용하였습니다. 마나가 " + Shop.Getitem1Stat() + "회복되었습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;
						}
						break;
					}
					if (choice == 6) {
						if (Adel.GetmpPostion2Count() == 0) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 물약이 없습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");

						} else if (Adel.Getmp() == Adel.GetadelMp()) {
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 마나가 가득 차 있습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;
						} else if (Adel.Getmp() <= Adel.GetadelMp()) {
							Adel.mp += Shop.Getitem2Stat();
							Adel.mpPostion2Count--;
							System.out
									.println(" ----------------------------------------------------------------------");
							System.out.println(" 아이템을 사용하였습니다. 마나가 " + Shop.Getitem2Stat() + "회복되었습니다.");
							System.out
									.println(" ----------------------------------------------------------------------");
							break;
						}
					} else {
						Interface.inputErr();
					}
					break;
				case 4:// 도망
					isLoop = false;
					isRunAway = false;
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" 도망을 치셨습니다. 몬스터의 체력은 초기화됩니다.");
					System.out.println(" ----------------------------------------------------------------------");
					break;
				default:
					Interface.inputErr();
					break;
				}
			}
			sleep(1);
		} catch (Exception e) {

		}
	}
}
