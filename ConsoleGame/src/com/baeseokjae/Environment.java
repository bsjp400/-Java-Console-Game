package com.baeseokjae;

public class Environment extends Thread {
	
	Adel Adel;
	Monster monster;
	
	public Environment(Adel Adel) {
		this.Adel = Adel;
	}

	public void run() {
		int count = 1;
		try {
			//Thread.sleep(1000);
			//System.err.println(" System Message : 모든 던전은 30초마다 에픽 몬스터가 출현합니다.\n" + "" +
		//" 각 에픽 몬스터들은 일반 몬스터에 비해 높은 능력치를 가지고 있습니다.");
			while (!Thread.currentThread().isInterrupted()) {
				sleep(30000);// 30초
				Adel.SetSlimeCount(1);
				count++;
				if (Adel.Barlock == 3) {
					break;
				}
				if (count == 2) {
					Adel.SetMushroomCount(2);
					System.err.println(" System Message : 어두운 기운과 함께 머쉬맘이 출현하였습니다.\n " + "" +
					" 해당 몬스터는 일반 몬스터에 비해 능력치가 2배 높습니다.");
				} else if (count == 3) {
					Adel.SetMushroomCount(1);
					Adel.SetSlimeCount(2);
					System.err.println(" System Message : 어두운 안개와 함께 킹슬라임이 출현하였습니다. \n " + "" +
					" 해당 몬스터는 일반 몬스터에 비해 능력치가 2배 높습니다.");
					count = 1;
				}
			}
		} catch (Exception e) {
		}
	}
}