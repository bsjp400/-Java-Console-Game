package com.baeseokjae;

public class Mushroom extends Monster{
	
	public int stern;
	
	public int Getstern() {
		return stern;
	}

	public void Setstern(int stern) {
		this.stern = stern;
	}
	
	public Mushroom(String name, int level, int hp, int mp, int atk, int atkSpeed, int defense, int monexp, int money, int stern, int buff) {
		super(name, level, hp, mp, atk, atkSpeed, defense, monexp, money, buff);
		
		this.name = "주황버섯";
		this.level  = 1;
		this.hp = 200;
		this.atk = 50;
		this.defense = 10;
		this.monexp = 100;
		this.money = 1000;
	}
}