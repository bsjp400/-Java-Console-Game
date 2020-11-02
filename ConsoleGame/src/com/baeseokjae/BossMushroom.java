package com.baeseokjae;

public class BossMushroom extends Monster {

	public BossMushroom(String name, int level, int hp, int mp, int atk, int atkSpeed, int defense, int monexp, int money, int buff) {
		super(name, level, hp, mp, atk, atkSpeed, defense, monexp, money, buff);
		
		this.name = "머쉬맘";
		this.level = 1;
		this.hp = 400;
		this.atk = 100;
		this.defense = 30;
		this.monexp = 200;
		this.money = 2000;
		this.buff = 50;
	}
}
