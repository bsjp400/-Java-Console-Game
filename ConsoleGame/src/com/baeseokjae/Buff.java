package com.baeseokjae;

public class Buff extends Thread {

	Adel Adel;
	Monster monster;
	BossMushroom bossMushroom;
	BossSlime bossSlime;

	public Buff(Adel Adel, BossMushroom bossMushroom, BossSlime bossSlime) {
		this.Adel = Adel;
		this.bossMushroom = bossMushroom;
		this.bossSlime = bossSlime;
	}

	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				if (Adel.bossMushroom == 4) {
					Thread.sleep(1);
					// 30초 동안 캐릭터 능력치 버프
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" '머쉬맘의 축복' 버프가 시작됩니다 ");
					System.out.println(" ----------------------------------------------------------------------");
					Adel.hp += bossMushroom.Getbuff();
					Adel.adelHp += bossMushroom.Getbuff();
					Adel.mp += bossMushroom.Getbuff();
					Adel.adelMp += bossMushroom.Getbuff();
					Adel.defense += bossMushroom.Getbuff();
					Adel.atk += bossMushroom.Getbuff();
					Thread.sleep(30000);
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" '머쉬맘의 축복' 버프가 끝났습니다 ");
					System.out.println(" ----------------------------------------------------------------------");
					Adel.hp -= bossMushroom.Getbuff();
					Adel.adelHp -= bossMushroom.Getbuff();
					Adel.mp -= bossMushroom.Getbuff();
					Adel.adelMp -= bossMushroom.Getbuff();
					Adel.defense -= bossMushroom.Getbuff();
					Adel.atk -= bossMushroom.Getbuff();
					Adel.bossMushroom = 1;
				} else if (Adel.bossSlime == 4) {
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" '킹슬라임의 축복' 버프가 시작됩니다 ");
					System.out.println(" ----------------------------------------------------------------------");
					// 60초 동안 캐릭터 능력치 버프
					Adel.hp += bossSlime.Getbuff();
					Adel.adelHp += bossSlime.Getbuff();
					Adel.mp += bossSlime.Getbuff();
					Adel.adelMp += bossSlime.Getbuff();
					Adel.defense += bossSlime.Getbuff();
					Adel.atk += bossSlime.Getbuff();
					Thread.sleep(30000);
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" '킹슬라임의 축복' 버프가 끝났습니다 ");
					System.out.println(" ----------------------------------------------------------------------");
					Adel.hp -= bossSlime.Getbuff();
					Adel.adelHp -= bossSlime.Getbuff();
					Adel.mp -= bossSlime.Getbuff();
					Adel.defense -= bossSlime.Getbuff();
					Adel.adelMp -= bossSlime.Getbuff();
					Adel.atk -= bossSlime.Getbuff();
					Adel.bossSlime = 1;

				}
			}
		} catch (Exception e) {
		}
	}
}
