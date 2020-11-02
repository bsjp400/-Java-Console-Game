package com.baeseokjae;

public class BuffThread extends Thread {

	Adel adel;
	Monster monster;
	BossMushroom bossMushroom;
	BossSlime bossSlime;
	Buff Buff;
	
	public void Huntbuff(Adel adel, BossMushroom bossMushroom, BossSlime bossSlime) {
		Buff Buff = new Buff(adel,bossMushroom, bossSlime);
		boolean isLoop = true;
		Buff.start();
		while (isLoop) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}