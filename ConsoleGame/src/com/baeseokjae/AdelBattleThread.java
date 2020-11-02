package com.baeseokjae;

public class AdelBattleThread extends Thread {
	
	Adel Adel;
	Monster monster;
	boolean isRunAway = true;

	public void autoBattle(Adel Adel, Monster monster) {

			AdelBattle AdelBattle = new AdelBattle(Adel, monster);
			MonsterBattle MonsterBattle = new MonsterBattle(Adel, monster);
			boolean isLoop = true;
			AdelBattle.start();
			MonsterBattle.start();
			while (isLoop) {
				// 몬스터나 유저 둘중 하나만 죽어도 결투 쓰레드 종료
				if (Adel.Gethp() <= 0) {
					Adel.Sethp(Adel.adelHp / 4);
					AdelBattle.interrupt();
					MonsterBattle.interrupt();
					isLoop = false;
					break;
				} else if (monster.Gethp() <= 0) {
					// 몬스터나 유저 둘중 하나만 죽어도 결투 쓰레드 종료
					AdelBattle.interrupt();
					MonsterBattle.interrupt();
					isLoop = false;
					break;
				} else if (!AdelBattle.isRunAway) {
					// 사용자가 도망쳤을경우 쓰레드 종료.
					AdelBattle.interrupt();
					MonsterBattle.interrupt();
					isLoop = false;
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

