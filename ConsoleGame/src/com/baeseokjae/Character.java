package com.baeseokjae;

public class Character {

	public String name;

	public int level;
	public int hp;
	public int mp;
	public int atk;
	public int atkSpeed;
	public int defense;
	public int money;

	public String Getname() {
		return name;
	}

	public void Setname(String name) {
		this.name = name;
	}

	public int Getlevel() {
		return level;
	}

	public void Setlevel(int level) {
		this.level = level;
	}
	
	public int Gethp() {
		return hp;
	}

	public void Sethp(int hp) {
		this.hp = hp;
	}

	public int Getmp() {
		return mp;
	}

	public void Setmp(int mp) {
		this.mp = mp;
	}

	public int Getatk() {
		return atk;
	}

	public void Setatk(int atk) {
		this.atk = atk;
	}
	
	public int GetatkSpeed() {
		return atkSpeed;
	}

	public void SetatkSpeed(int atkSpeed) {
		this.atkSpeed = atkSpeed;
	}
	
	public int Getdefense() {
		return defense;
	}

	public void Setdefense(int defense) {
		this.defense = defense;
	}
	
	public int Getmoney() {
		return money;
	}

	public void Setmoney(int money) {
		this.money = money;
	}

	public Character(String name, int level, int hp, int mp, int atk, int atkSpeed, int defense, int money) {
	
	this.name = name;
	this.level = level;
	this.hp = hp;
	this.atk = atk;
	this.defense = defense;
	}
}