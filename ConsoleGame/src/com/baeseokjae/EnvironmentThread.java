package com.baeseokjae;

public class EnvironmentThread extends Thread {

	Adel Adel;
	Monster monster;
	Mushroom Mushroom;
	Slime Slime;
	BossMushroom bossMushroom;
	BossSlime bossSlime;
	
	public void autoEnvironment(Adel Adel, Monster monster, BossMushroom bossMushroom, BossSlime bossSlime) {
		Environment Environment = new Environment(Adel);
		Buff Buff = new Buff(Adel, bossMushroom, bossSlime);
		boolean isLoop = false;
		Environment.start();
		Buff.start();
		while(isLoop) {
			if (Adel.Barlock == 3) {
				Environment.interrupt();
				Buff.interrupt();
				isLoop = false;
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {	
		}
	}
}
}
