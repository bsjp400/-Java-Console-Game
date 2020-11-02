package com.baeseokjae;

public class Slime extends Monster{

	public Slime(String name, int level, int hp, int mp, int atk, int atkSpeed, int defense, int monexp, int money, int buff) {
		super(name, level, hp, mp, atk, atkSpeed, defense, monexp, money, buff);
		
		this.name = "슬라임";
		this.level = 5;
		this.hp = 400;
		this.atk = 60;
		this.defense = 30;
		this.monexp = 200;
		this.money = 2000;
		this.buff = 0;
	}
}
