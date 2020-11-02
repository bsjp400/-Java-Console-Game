package com.baeseokjae;

public class Barlock extends Monster {

	public Barlock(String name, int level, int hp, int mp, int atk, int atkSpeed, int defense, int monexp, int money, int buff) {
		super(name, level, hp, mp, atk, atkSpeed, defense, monexp, money, buff);
		
		this.name = "발록";
		this.level = 10;
		this.hp = 800;
		this.atk = 120;
		this.defense = 60;
		this.monexp = 400;
		this.money = 4000;
	}

	// 몬스터 사냥 시 출력되는 몬스터 스탯.
	public void BarlockStat() {
		System.out.println(" 발록 스탯");
		System.out.println(" HP : " + Gethp());
		System.out.println(" 공격력 : " + Getatk());
		System.out.println(" 방어력 : " + Getdefense());
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 1. 공격 2. 스킬 사용 3. 아이템사용 4. 도망치기");
		System.out.println(" 선택 >>>>>");
	}

	// 몬스터 체력이 0이 될때 사냥이 종료되는 메소드.
	public boolean BarlockExp() {
		if (Gethp() <= 0) {
			System.out.println(" 1. 공격 2. 스킬 사용 3. 아이템사용 4. 도망치기");
			System.out.println(" 선택 >>>>>");
			System.out.println(" 발록 스탯");
			System.out.println(" HP : " + Gethp());
			System.out.println(" 공격력 : " + Getatk());
			System.out.println(" 방어력 : " + Getdefense());
			System.out.println(" ----------------------------------------------------------------------");
			
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 축하합니다. 보스를 처리하셨습니다!");
			System.out.println(" ----------------------------------------------------------------------");
			
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 게임을 클리어 하셨습니다.");
			System.out.println(" 게임을 종료하실 수 있고, 더 플레이하실 수 있습니다.");
			System.out.println(" 어떻게 하시겠습니까?");
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 1. 더 한다 2. 끝낸다 ");
			System.out.println(" 선택 >>>>>");
			
			
			return false;
		} 
		else {
		}
		return true;
	}
}