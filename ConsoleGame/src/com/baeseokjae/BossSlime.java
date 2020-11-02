package com.baeseokjae;

public class BossSlime extends Monster {
	
	public BossSlime(String name, int level, int hp, int mp, int atk, int atkSpeed, int defense, int monexp, int money, int buff) {
		super(name, level, hp, mp, atk, atkSpeed, defense, monexp, money, buff);
		
		this.name = "킹슬라임";
		this.level = 2;
		this.hp = 800;
		this.atk = 120;
		this.defense = 60;
		this.monexp = 400;
		this.money = 4000;
		this.buff = 100;
	}
}