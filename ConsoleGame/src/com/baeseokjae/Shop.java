package com.baeseokjae;

public class Shop {
	
	Adel Adel;
	public int itemStat = 10;
	public int item1Stat = 50;
	public int item2Stat = 100;
	public int itemPrice = 100;
	public int item1Price = 300;
	public int item2Price = 500;
	public String weapon = "패이션스";
	public String weapon1 = "어너";
	public String weapon2 = "모데스티";
	public String armor = "발퀴레";
	public String armor1 = "제너럴";
	public String armor2 = "네오스";
	public String weaponCount = " ";
	public String weapon1Count = " ";
	public String weapon2Count = " ";
	public String armorCount = " ";
	public String armor1Count = " ";
	public String armor2Count = " ";
	
	public int GetitemStat() {
		return itemStat;
	}

	public void SettemStat(int itemStat) {
		this.itemStat = itemStat;
	}

	public int Getitem1Stat() {
		return item1Stat;
	}

	public void Setitem1Stat(int item1Stat) {
		this.item1Stat = item1Stat;
	}

	public int Getitem2Stat() {
		return item2Stat;
	}
	
	public int GetitemPrice() {
		return itemPrice;
	}

	public void SettemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int Getitem1Price() {
		return item1Price;
	}

	public void Setitem1Price(int item1Price) {
		this.item1Price = item1Price;
	}

	public int Getitem2Price() {
		return item2Price;
	}

	public void Setitem2Stat(int item2Stat) {
		this.item2Stat = item2Stat;
	}
	
	public String Getweapon() {
		return weapon;
	}

	public void Setweapon(String weapon) {
		this.weapon = weapon;
	}
	
	public String Getweapon1() {
		return weapon1;
	}

	public void Setweapon1(String weapon1) {
		this.weapon1 = weapon1;
	}
	
	public String Getweapon2() {
		return weapon2;
	}

	public void Setweapon2(String weapon2) {
		this.weapon2 = weapon2;
	}

	public String Getarmor() {
		return armor;
	}

	public void Setarmor(String armor) {
		this.armor = armor;
	}
	
	public String Getarmor1() {
		return armor1;
	}

	public void Setarmor1(String armor1) {
		this.armor1 = armor1;
	}
	
	public String Getarmor2() {
		return armor2;
	}

	public void Setarmor2(String armor2) {
		this.armor2 = armor2;
	}
	
	public String GetweaponCount() {
		return weaponCount;
	}
	
	public void SetweaponCount(String weaponCount) {
		this.weaponCount = weaponCount;
	}
	
	public String GetweaponCount1() {
		return weapon1Count;
	}

	public void Setweapon1Count(String weapon1Count) {
		this.weapon1Count = weapon1Count;
	}
	
	public String Getweapon2Count() {
		return weapon2Count;
	}

	public void Setweapon2Count(String weapon2Count) {
		this.weapon2Count = weapon2Count;
	}

	public String GetarmorCount() {
		return armorCount;
	}

	public void SetarmorCount(String armorCount) {
		this.armorCount = armorCount;
	}
	
	public String Getarmor1Count() {
		return armor1Count;
	}

	public void Setarmor1Count(String armor1Count) {
		this.armor1Count = armor1Count;
	}
	
	public String Getarmor2Count() {
		return armor2Count;
	}

	public void Setarmor2Count(String armor2Count) {
		this.armor2Count = armor2Count;
	}

	public Shop() {
		super();
	}


	public void shop (Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 상점");
		System.out.println(" 어느것을 구매하시겠습니까?");
		System.out.println(" 1. 무기 2. 방어구 3. 물약 4. 로비로 가기");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 선택 >>>>>");
	}

	public void Weapon(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 무기");
		System.out.println(" 1. " + weapon + " : 공격력 " + itemStat + " / " + itemPrice + "메소 / " + weaponCount);
		System.out.println(" 2. " + weapon1 + " : 공격력 " + item1Stat + " / " + item1Price + "메소 / " + weapon1Count);
		System.out.println(" 3. " + weapon2 + " : 공격력 " + item2Stat + " / " + item2Price + "메소 / " + weapon2Count);
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 선택 >>>>>");
	}

	public void WeaponBuy(Adel Adel) {
		if (weaponCount == "품절") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 품절되었습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return;
		}
		Adel.inventoryWeapon += weapon;
		Adel.money -= itemPrice;
		SetweaponCount("품절");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + weapon + " : 공격력 " + itemStat);
		System.out.println(" 을 구매하셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void Weapon1Buy(Adel Adel) {
		if (weapon1Count == "품절") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 품절되었습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return;
		}
		Adel.inventoryWeapon1 += weapon1;
		Adel.money -= item1Price;
		Setweapon1Count("품절");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + weapon1 + " : 공격력 " + item1Stat);
		System.out.println(" 을 구매하셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void Weapon2Buy(Adel Adel) {
		if (weapon1Count == "품절") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 품절되었습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return;
		}
		Adel.inventoryWeapon2 += weapon2;
		Adel.money -= item2Price;
		Setweapon2Count("품절");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + weapon2 + " : 공격력 " + item2Stat);
		System.out.println(" 을 구매하셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void PostionChoice() {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 물약");
		System.out.println(" 1. 체력 물약 2. 마나 물약");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 선택 >>>>>");
	}

	public void ShopHpPostion(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 물약");
		System.out.println(" 1. " + Adel.hpPostion + " : 체력 회복 " + itemStat + " / " + itemPrice + "메소");
		System.out.println(" 2. " + Adel.hpPostion1 + " : 체력 회복 " + item1Stat + " / " + item1Price + "메소");
		System.out.println(" 3. " + Adel.hpPostion2 + " : 체력 회복 " + item2Stat + " / " + item2Price + "메소");
		System.out.println(" -----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" -----------------------------------------------------------------------");
		System.out.println(" 선택 >>>>>");
	}

	public void ShopMpPostion(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 물약");
		System.out.println(" 1. " + Adel.mpPostion + " : 마나 회복 " + itemStat + " / " + itemPrice + "메소");
		System.out.println(" 2. " + Adel.mpPostion1 + " : 마나 회복 " + item1Stat + " / " + item1Price + "메소");
		System.out.println(" 3. " + Adel.mpPostion2 + " : 마나 회복 " + item2Stat + " / " + item2Price + "메소");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 선택 >>>>>");
	}

	public void PostionCount() {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 얼마나 구입하시겠습니까?");
		System.out.println(" ----------------------------------------------------------------------");
	}
	
	public void hpPostionbuy(Adel Adel) {
		Adel.money -= itemPrice * MapleStory.select;
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Adel.hpPostion + " : " + MapleStory.select + "개");
		System.out.println(" 를 구매하셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
	}
	
	public void hpPostion1buy(Adel Adel) {
		Adel.money -= item1Price * MapleStory.select;
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Adel.hpPostion1 + " : " + MapleStory.select + "개");
		System.out.println(" 를 구매하셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void hpPostion2buy(Adel Adel) {
		Adel.money -= item2Price * MapleStory.select;
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Adel.hpPostion2 + " : " + MapleStory.select + "개");
		System.out.println(" 를 구매하셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
	}
	
	public void mpPostionbuy(Adel Adel) {
		Adel.money -= itemPrice * MapleStory.select;
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Adel.mpPostion + " : " + MapleStory.select + "개");
		System.out.println(" 를 구매하셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
	}
	
	public void mpPostion1buy(Adel Adel) {
		Adel.money -= item1Price * MapleStory.select;
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Adel.mpPostion1 + " : " + MapleStory.select + "개");
		System.out.println(" 를 구매하셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void mpPostion2buy(Adel Adel) {
		Adel.money -= item2Price * MapleStory.select;
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Adel.mpPostion2 + " : " + MapleStory.select + "개");
		System.out.println(" 를 구매하셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void Armor(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 방어구");
		System.out.println(" 1. " + armor + " : 방어력 " + itemStat + " / " + itemPrice + "메소 / " + armorCount);
		System.out.println(" 2. " + armor1 + " : 방어력 " + item1Stat + " / " + item1Price +"메소 / " + armorCount);
		System.out.println(" 3. " + armor2 + " : 방어력 " + item2Stat + " / " + item2Price + "메소 / " + armorCount);
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 선택 >>>>>");
	}


	public void ArmorBuy(Adel Adel) {
		if (armorCount == "품절") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 품절되었습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return;
		}
		Adel.inventoryArmor += armor;
		Adel.money -=  itemPrice;
		SetarmorCount("품절");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + armor + " : 방어력 " + itemStat);
		System.out.println(" 을 구매하셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void Armor1Buy(Adel Adel) {
		if (armor1Count == "품절") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 품절되었습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return;
		}
		Adel.inventoryArmor1 += armor1;
		Adel.money -= item1Price;
		Setarmor1Count("품절");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + armor1 + " : 공격력 " + item1Stat);
		System.out.println(" 을 구매하셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void Armor2Buy(Adel Adel) {
		if (armor2Count == "품절") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 품절되었습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return;
		}
		Adel.inventoryArmor2 += armor2;
		Adel.money -=  item2Price;
		Setarmor2Count("품절");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + armor2 + " : 공격력 " + item2Stat);
		System.out.println(" 을 구매하셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.money);
		System.out.println(" ----------------------------------------------------------------------");
	}
}
