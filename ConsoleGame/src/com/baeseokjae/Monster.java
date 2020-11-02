package com.baeseokjae;

public class Monster extends Character {

	public int monexp;
	public int buff;
	
	public int Getbuff() {
		return buff;
	}
	
	public void Setbuff(int buff) {
		this.buff = buff;
	}
	
	public int Getmonexp() {
		return monexp;
	}
	
	public void Setmonexp(int monexp) {
		this.monexp = monexp;
	}
	
	public Monster(String name, int level, int hp, int mp, int atk, int atkSpeed, int armor, int monexp, int money, int buff) {
		super(name, level, hp, mp, atk, atkSpeed, armor, money);
		this.buff = buff;
		this.monexp = monexp;
	}
	
	public String toString() {
	      return " " + Getname() + " 스탯\n" + 
			" HP : " + Gethp() + "\n" +
			" 공격력 : " + Getatk() + "\n" +
			" 방어력 : " + Getdefense() + "\n" +
			" ----------------------------------------------------------------------";
	  }
}
