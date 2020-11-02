package com.baeseokjae;

public class MonsterBattle extends Thread {

	Adel Adel;
	Monster monster;
	Service Service = new Service();

	public MonsterBattle(Adel Adel, Monster monster) {
		this.Adel = Adel;
		this.monster = monster;
	}
	
	@Override
	// 몬스터의 자동공격 함수
	public void run() {
		boolean isLoop = true;
		try {
			while (!Thread.currentThread().isInterrupted() && isLoop) {
				Thread.sleep(5000);
				// 몬스터의 공격 속도를 제한해서 공격한다.
				if (monster.Getatk() <= Adel.Getdefense()) {
					System.out.println("");
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" " + monster.name + "으로부터 " + 0 + "피해를 받았습니다.");
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println("");
					break;
				}
				if (monster.Gethp() > 0) {
					// 몬스터의 셋팅된 값으로 유저캐릭터를 공격함.
					Adel.hp -= monster.atk - Adel.Getdefense();
					System.out.println("");
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" " + monster.name + "으로부터 " + (monster.Getatk() - Adel.Getdefense()) + "피해를 받았습니다.");
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println("");
					if (Adel.Gethp() <= 0) {
						// 사망시 HP를 0으로 셋팅.
						Adel.Sethp(0);
						Service.monsterAndUserState(Adel, monster);
						System.out.println(" ----------------------------------------------------------------------");
						System.out.println(" 체력이 0 이 되어 사망하였습니다. 체력은 20% 회복되어 부활합니다");
						System.out.println(" 마을로 귀환합니다.");
						System.out.println(" ----------------------------------------------------------------------");
						isLoop = false;
						break;
					}
				}
				Service.monsterAndUserState(Adel, monster);
			}
			sleep(1);
		} catch (Exception e) {
		}
	}
}
