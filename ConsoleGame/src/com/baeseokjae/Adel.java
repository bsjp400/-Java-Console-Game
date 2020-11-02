package com.baeseokjae;

import java.util.Scanner;

public class Adel extends Job {
	
	public int MushroomCount;
	public int SlimeCount;
	public int bossMushroom;
	public int bossSlime;
	public int Barlock;
	public int adelHp;
	public int adelMp;
	String weaponEquip;
	String hpPostionEquip;
	String armorEquip;

	public int GetMushroomCount() {
		return MushroomCount;
	}
	
	public void SetMushroomCount(int MushroomCount) {
		this.MushroomCount = MushroomCount;
	}
	
	public int GetSlimeCount() {
		return SlimeCount;
	}
	
	public void SetSlimeCount(int SlimeCount) {
		this.SlimeCount = SlimeCount;
	}
	
	public int GetbossMushroom() {
		return bossMushroom;
	}
	
	public void SetbossMushroom(int bossMushroom) {
		this.bossMushroom = bossMushroom;
	}
	
	public int GetbossSlime() {
		return bossSlime;
	}
	
	public void SetbossSlime(int bossSlime) {
		this.bossSlime = bossSlime;
	}
	
	public int GetBarlock() {
		return Barlock;
	}
	
	public void SetBarlock(int Barlock) {
		this.Barlock = Barlock;
	}
	
	public int GetadelHp() {
		return adelHp;
	}

	public void SetadelHp(int adelHp) {
		this.adelHp = adelHp;
	}

	public int GetadelMp() {
		return adelMp;
	}

	public void SetadelMp(int adelMp) {
		this.adelMp = adelMp;
	}

	public String GetweaponEquip() {
		return weaponEquip;
	}

	public void SetweaponEquip(String weaponEquip) {
		this.weaponEquip = weaponEquip;
	}

	public String GethpPostionEquip() {
		return hpPostionEquip;
	}

	public void SethpPostionEquip(String hpPostionEquip) {
		this.hpPostionEquip = hpPostionEquip;
	}

	public String GetarmorEquip() {
		return armorEquip;
	}

	public void SetarmorEquip(String armorEquip) {
		this.armorEquip = armorEquip;
	}

	// 이름, 레벨, 메소, hp, 고정hp, mp, 고정mp, 공격력
	public Adel(String name, int level, int money, int hp, int adelHp, int mp, int adelMp, int atk, int atkSpeed,
			// 방어력, 경험치, 레벨 경험치, 스탯포인트, 스킬포인트, 공격스킬, 공격스킬 마나,
			int defense, int exp, int levelexp, int statPoint, int skillPoint, int activeSkill, int activeSkillMp,
			// 버프스킬, 버프스킬마나, 아이템 능력치, 아이템1능력치, 아이템2능력치, 아이템가격, 아이템1가격
			int buffSkill, int buffSkillMp, int item, int item1, int item2, int itemPrice, int item1Price,
			// 아이템2가격, 무기개수, 무기1개수, 무기2개수, 방어구개수, 방어구1개수,
			int item2Price, int weaponCount, int weapon1Count, int weapon2Count, int armorCount, int armor1Count,
			// 방어구2개수, 체력포션개수, 체력포션1개수, 체력포션2개수, 마나포션개수,
			int armor2Count, int hpPostionCount, int hpPostion1Count, int hpPostion2Count, int mpPostionCount,
			// 마나포션1개수, 마나포션2개수, 무기이름, 무기1이름, 무기2이름, 방어구이름,
			int mpPostion1Count, int mpPostion2Count,
			// 아머1이름, 아머2이름, 체력포션이름, 체력포션1이름, 체력포션2이름, 마나포션이름,
			String hpPostion, String hpPostion1, String hpPostion2, String mpPostion,
			// 마나포션1이름, 마나포션2이름, 스탯창장비, 스탯창포션, 스탯창방어구,
			String mpPostion1, String mpPostion2, String weaponEquip, String hpPostionEquip, String armorEquip,
			// 인벤토리무기, 인벤토리무기1, 인벤토리무기2, 인벤토리체력포션,
			String inventoryWeapon, String inventoryWeapon1, String inventoryWeapon2, String inventoryHpPostion,
			// 인벤토리 체력포션1, 인벤토리 체력포션2, 인벤토리 마나포션,
			String inventoryHpPostion1, String inventoryHpPostion2, String inventoryMpPostion,
			// 인벤토리 마나포션1, 인벤토리마나포션2, 인벤토리 방어구, 인벤토리 방어구1,
			String inventoryMpPostion1, String inventoryMpPostion2, String inventoryArmor, String inventoryArmor1,
			// 인벤토리 방어구2,
			String inventoryArmor2, int bossMonster, int bossMonsterCount) {
		// 이름, 레벨, 돈, 체력, 마나, 공격력,
		super(name, level, money, hp, mp, atk, atkSpeed,
				// 방어력, 경험치, 레벨 경험치, 스탯포인트, 스킬포인트, 공격스킬, 공격스킬 마나,
				defense, exp, levelexp, statPoint, skillPoint, activeSkill, activeSkillMp,
				// 버프스킬, 버프스킬마나, 아이템 능력치, 아이템1능력치, 아이템2능력치, 아이템가격, 아이템1가격
				buffSkill, buffSkillMp, item, item1, item2, itemPrice, item1Price,
				// 아이템2가격, 무기개수, 무기1개수, 무기2개수, 방어구개수, 방어구1개수,
				item2Price, weaponCount, weapon1Count, weapon2Count, armorCount, armor1Count,
				// 방어구2개수, 체력포션개수, 체력포션1개수, 체력포션2개수, 마나포션개수,
				armor2Count, hpPostionCount, hpPostion1Count, hpPostion2Count, mpPostionCount,
				// 마나포션1개수, 마나포션2개수, 무기이름, 무기1이름, 무기2이름, 방어구이름,
				mpPostion1Count, mpPostion2Count,
				// 아머1이름, 아머2이름, 체력포션이름, 체력포션1이름, 체력포션2이름, 마나포션이름,
				hpPostion, hpPostion1, hpPostion2, mpPostion,
				// 마나포션1이름, 마나포션2이름, 인벤토리무기, 인벤토리무기1, 인벤토리무기2, 인벤토리체력포션,
				mpPostion1, mpPostion2, inventoryWeapon, inventoryWeapon1, inventoryWeapon2, inventoryHpPostion,
				// 인벤토리 체력포션1, 인벤토리 체력포션2, 인벤토리 마나포션,
				inventoryHpPostion1, inventoryHpPostion2, inventoryMpPostion,
				// 인벤토리 마나포션1, 인벤토리마나포션2, 인벤토리 방어구, 인벤토리 방어구1,
				inventoryMpPostion1, inventoryMpPostion2, inventoryArmor, inventoryArmor1,
				// 인벤토리 방어구2,
				inventoryArmor2);
		this.level = 1;
		this.money = 100000;
		this.hp = 300;
		this.mp = 50;
		this.atk = 100;
		this.defense = 10;
		this.activeSkill = this.hp / 4;
		this.buffSkill = 50;
		this.hpPostion = "기본 체력 물약";
		this.hpPostion1 = "빨강 물약";
		this.hpPostion2 = "체력 엘릭서";
		this.mpPostion = "기본 마나 물약";
		this.mpPostion1 = "파랑 물약";
		this.mpPostion2 = "마나 엘릭서";
		this.hpPostionCount = 10;
		this.hpPostion1Count = 10;
		this.hpPostion2Count = 10;
		this.mpPostionCount = 10;
		this.mpPostion1Count = 10;
		this.mpPostion2Count = 10;
		this.adelHp = adelHp;
		this.adelMp = adelMp;
		this.weaponEquip = weaponEquip;
		this.hpPostionEquip = hpPostionEquip;
		this.armorEquip = armorEquip;
		this.MushroomCount = 1;
		this.SlimeCount = 1;
		this.Barlock = 1;
	}
}