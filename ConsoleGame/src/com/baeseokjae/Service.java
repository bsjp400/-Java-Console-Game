package com.baeseokjae;

import java.util.Scanner;

public class Service {

	static Adel Adel;
	static Shop Shop = new Shop();
	static int choice;
	Interface Interface = new Interface();

	Scanner input = new Scanner(System.in);

	// 낙내암 설정 메소드
	public void name(Adel Adel, String name) {
		Adel.Setname(name);
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 닉네임이 " + name + "로 설정되셨습니다.");
		System.out.println(" ----------------------------------------------------------------------");
	}

	// 로비화면에 출력되는 기본 스탯창
	public void startStat(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 내 캐릭터 스탯");
		System.out.println(" 닉네임 : " + Adel.Getname());
		System.out.println(" 레벨 : " + Adel.Getlevel());
		System.out.println(" HP : " + Adel.Gethp() + "/" + Adel.GetadelHp());
		System.out.println(" MP : " + Adel.Getmp() + "/" + Adel.GetadelMp());
		System.out.println(" 공격력 : " + Adel.Getatk());
		System.out.println(" 방어력 : " + Adel.Getdefense());
		System.out.println(" 스킬공격력 : " + Adel.GetactiveSkill());
		System.out.println(" 경험치 : " + Adel.Getexp() + " / " + "다음 레벨을 위한 경험치 = " + Adel.Getlevelexp());
		System.out.println(" 보유 메소 : " + Adel.Getmoney());
		System.out.println(" ----------------------------------------------------------------------");
	}

	// 몬스터 자동전투시 적용되는 스탯
	public void monsterAndUserState(Adel Adel, Monster monster) {
		// 유저의 레벨,공격력,HP,MP,방어력을 출력
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 내 캐릭터 스탯");
		System.out.println(" 닉네임 : " + Adel.Getname());
		System.out.println(" 레벨 : " + Adel.Getlevel());
		System.out.println(" HP : " + Adel.Gethp() + "/" + Adel.GetadelHp());
		System.out.println(" MP : " + Adel.Getmp() + "/" + Adel.GetadelMp());
		System.out.println(" 공격력 : " + Adel.Getatk());
		System.out.println(" 방어력 : " + Adel.Getdefense());
		System.out.println(" 스킬공격력 : " + Adel.GetactiveSkill());
		System.out.println(" 경험치 : " + Adel.Getexp());
		System.out.println(" ----------------------------------------------------------------------");
		// 몬스터의 레벨, 공격력, 방어력, HP, MP를 출력
		System.out.println(monster.toString());
		Interface.huntChoice();
	}

	public void stat(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 내 캐릭터 스탯");
		System.out.println(" 닉네임 : " + Adel.Getname());
		System.out.println(" 레벨 : " + Adel.Getlevel());
		System.out.println(" HP : " + Adel.Gethp() + "/" + Adel.GetadelHp());
		System.out.println(" MP : " + Adel.Getmp() + "/" + Adel.GetadelMp());
		System.out.println(" 공격력 : " + Adel.Getatk());
		System.out.println(" 방어력 : " + Adel.Getdefense());
		System.out.println(" 스킬공격력 : " + Adel.GetactiveSkill());
		System.out.println(" 경험치 : " + Adel.Getexp() + " / " + "다음 레벨을 위한 경험치 = " + Adel.Getlevelexp());
		System.out.println(" 보유 메소 : " + Adel.Getmoney());
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 장착 아이템");
		System.out.println(" 무기 :" + Adel.GetweaponEquip());
		System.out.println(" 방어구: " + Adel.GetarmorEquip());
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 포인트");
		System.out.println(" 스탯포인트 : " + Adel.GetstatPoint());
		System.out.println(" 스킬포인트 : " + Adel.GetskillPoint());
		System.out.println(" ----------------------------------------------------------------------");
		Interface.statChoice();
	}

	public boolean statPointCheck(Adel Adel) {
		if (Adel.GetstatPoint() == 0) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 스탯포인트가 없어 투자할 수 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public void statPoint(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 스탯포인트는 " + Adel.GetstatPoint() + "입니다.");
		System.out.println(" 어느곳에 투자하시겠습니까?");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 1. HP : 현재 HP가 50만큼 증가합니다.");
		System.out.println(" 2. MP : 현재 MP가 50만큼 증가합니다.");
		System.out.println(" 3. 공격력 : 현재 공격력이 50만큼 증가합니다");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 1. HP 2. MP 3. 공격력");
		System.out.println(" 선택 >>>>>");
	}

	public void hpStatup(Adel Adel) {
		Adel.statPoint--;
		Adel.adelHp += 50;
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" Hp가 " + Adel.GetadelHp() + "로 증가하였습니다.");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void mpStatup(Adel Adel) {
		Adel.statPoint--;
		Adel.adelMp += 50;
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" Mp가 " + Adel.GetadelMp() + "로 증가하였습니다.");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void atkStatup(Adel Adel) {
		Adel.statPoint--;
		Adel.atk += 50;
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" atk가 " + Adel.Getatk() + "로 증가하였습니다.");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public boolean skillPointCheck(Adel Adel) {
		if (Adel.GetskillPoint() == 0) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 스킬포인트가 없어 투자할 수 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public void skillPoint(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 스킬포인트는 " + Adel.GetskillPoint() + "입니다.");
		System.out.println(" 어느곳에 투자하시겠습니까?");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 1. 공격스킬 : 스킬 사용시 현재 체력의 1/4 만큼 데미지를 입힙니다.");
		System.out.println(" 2. 버프스킬 : 전투시 일시적으로 모든 능력치가 10만큼 증가합니다.");
		System.out.println(" ----------------------------------------------------------------------");
//		System.out.println(" 스탯 투자시 ↓");
//		System.out.println(" ----------------------------------------------------------------------");
//		System.out.println(" 1. 공격스킬 : 스킬 사용시 현재 체력의 1/3 만큼 데미지를 입힙니다.");
//		System.out.println(" 2. 버프스킬 : 전투시 일시적으로 모든 능력치가 20만큼 증가합니다.");
//		System.out.println(" ----------------------------------------------------------------------");
//		System.out.println(" 스탯 투자시 ↓");
//		System.out.println(" ----------------------------------------------------------------------");
//		System.out.println(" 1. 공격스킬 : 스킬 사용시 현재 체력의 1/2 만큼 데미지를 입힙니다.");
//		System.out.println(" 2. 버프스킬 : 전투시 일시적으로 모든 능력치가 30만큼 증가합니다.");
//		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 1. 공격스킬 2. 버프스킬 ");
		System.out.println(" 선택 >>>>>");
	}

	public boolean activeSkillUp(Adel Adel) {
		if (Adel.activeSkill == Adel.hp / 2) {
			Adel.SetactiveSkill(Adel.hp);
			Adel.skillPoint--;
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 공격스킬 능력치가 " + Adel.GetactiveSkill() + "로 증가하였습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return true;
		}
		if (Adel.activeSkill == Adel.hp / 3) {
			Adel.SetactiveSkill(Adel.hp / 2);
			Adel.skillPoint--;
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 공격스킬 능력치가 " + Adel.GetactiveSkill() + "로 증가하였습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return true;
		}
		Adel.SetactiveSkill(Adel.hp / 3);
		Adel.skillPoint--;
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 공격스킬 능력치가 " + Adel.GetactiveSkill() + "로 증가하였습니다.");
		System.out.println(" ----------------------------------------------------------------------");
		return true;
	}

	public void buffSKillup(Adel Adel) {
		Adel.skillPoint--;
		Adel.buffSkill += 50;
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 버프스킬 능력치가 " + Adel.GetbuffSkill() + "로 증가하였습니다.");
		System.out.println(" ----------------------------------------------------------------------");
	}
	
	public void inventory(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 인벤토리");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 무기");
		System.out.println(Adel.GetinventoryWeapon());
		System.out.println(Adel.GetinventoryWeapon1());
		System.out.println(Adel.GetinventoryWeapon2());
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 방어구");
		System.out.println(Adel.GetinventoryArmor());
		System.out.println(Adel.GetinventoryArmor1());
		System.out.println(Adel.GetinventoryArmor2());
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 물약");
		System.out.println(" 1. 기본 체력 물약 : " + Adel.GethpPostionCount() + "개" + " / " + "4. 기본 마나 물약 : "
				+ Adel.GetmpPostionCount() + "개");
		System.out.println(" 2. 빨강 물약 : " + Adel.GethpPostion1Count() + "개" + "     / " + "5. 파랑 물약 : "
				+ Adel.GetmpPostion1Count() + "개");
		System.out.println(" 3. 체력 엘릭서 : " + Adel.GethpPostion2Count() + "개" + "    / " + "6. 마나 엘릭서 : "
				+ Adel.GetmpPostion2Count() + "개");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 보유 메소 : " + Adel.Getmoney());
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 1. 장착 2. 장착 해제 3. 물약 사용 4. 나가기");
		System.out.println(" 선택 >>>>>");
	}
	

	public boolean EquipCheck(Adel Adel, Shop Shop) {
		if (Adel.GetinventoryWeapon() == " " && Adel.GetinventoryWeapon1() == " "
				&& Adel.GetinventoryWeapon2() == " " && Adel.GetinventoryArmor() == " "
				&& Adel.GetinventoryArmor1() == " " && Adel.GetinventoryArmor2() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착할 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public void Equip() {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 어떤 아이템을 장착하시겠습니까?");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 1. 무기 2. 방어구 3. 나가기");
		System.out.println(" 선택 >>>>>");
	}
	
	public void EquipWeaponChoice(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 장착 가능한 아이템");
		System.out.println(" 무기");
		System.out.println(" 1." + Adel.GetinventoryWeapon());
		System.out.println(" 2." + Adel.GetinventoryWeapon1());
		System.out.println(" 3." + Adel.GetinventoryWeapon2());
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 1 ~ 3. 선택 4. 나가기");
		System.out.println(" 선택 >>>>>");
	}
	
	public boolean EquipDoubleCheck(Adel Adel, Shop Shop) {
		if (Adel.GetweaponEquip() == Shop.Getweapon() && Adel.GetweaponEquip() ==  Shop.Getweapon1()
				&& Adel.GetweaponEquip() ==  Shop.Getweapon2() && Adel.GetarmorEquip() ==  Shop.Getarmor()
				&& Adel.GetarmorEquip() ==  Shop.Getarmor1() && Adel.GetarmorEquip() ==  Shop.Getarmor()) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 이미 장착 되었습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}
	
	public void InventoryEquipWeapon(Adel Adel, Shop Shop) {
		Adel.SetweaponEquip(Adel.GetinventoryWeapon());
		Adel.inventoryWeapon = Adel.inventoryWeapon + " : 장착";
		Adel.atk += Shop.GetitemStat();
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Shop.Getweapon() + "이 장착되었습니다");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void InventoryEquipWeapon1(Adel Adel, Shop Shop) {
		Adel.SetweaponEquip(Adel.GetinventoryWeapon1());
		Adel.inventoryWeapon1 = Adel.inventoryWeapon1 + " : 장착";
		Adel.atk += Shop.Getitem1Stat();
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Shop.Getweapon1() + "이 장착되었습니다");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void InventoryEquipWeapon2(Adel Adel, Shop Shop) {
		Adel.SetweaponEquip(Adel.GetinventoryWeapon2());
		Adel.inventoryWeapon2 = Adel.inventoryWeapon2 + " : 장착";
		Adel.atk += Shop.Getitem2Stat();
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Shop.Getweapon2() + "이 장착되었습니다");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void EquipArmorChoice(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 장착 가능한 아이템");
		System.out.println(" 방어구");
		System.out.println(" 1. " + Adel.GetinventoryArmor());
		System.out.println(" 2. " + Adel.GetinventoryArmor1());
		System.out.println(" 3. " + Adel.GetinventoryArmor2());
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 1 ~ 3. 선택 4. 나가기");
		System.out.println(" 선택 >>>>>");
	}

	public void InventoryEquipArmor(Adel Adel, Shop Shop) {
		Adel.SetarmorEquip(Adel.GetinventoryArmor());
		Adel.inventoryArmor = (Adel.inventoryArmor + " : 장착");
		Adel.defense += Shop.GetitemStat();
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Shop.Getarmor() + "이 장착되었습니다");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void InventoryEquipArmor1(Adel Adel, Shop Shop) {
		Adel.SetarmorEquip(Adel.GetinventoryArmor1());
		Adel.inventoryArmor1 = (Adel.inventoryArmor1 + " : 장착");
		Adel.defense += Shop.Getitem1Stat();
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Shop.Getarmor1() + "이 장착되었습니다");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void InventoryEquipArmor2(Adel Adel, Shop Shop) {
		Adel.SetarmorEquip(Adel.GetinventoryArmor2());
		Adel.inventoryArmor2 = (Adel.inventoryArmor2 + " : 장착");
		Adel.defense += Shop.Getitem2Stat();
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Shop.Getarmor2() + "이 장착되었습니다");
		System.out.println(" ----------------------------------------------------------------------");
	}

	
	public boolean EquipWeaponCheck(Adel Adel, Shop Shop) {
		if (Adel.GetinventoryWeapon() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착할 수 없습니다. 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public boolean EquipWeapon1Check(Adel Adel, Shop Shop) {
		if (Adel.GetinventoryWeapon1() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착할 수 없습니다. 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public boolean EquipWeapon2Check(Adel Adel, Shop Shop) {
		if (Adel.GetinventoryWeapon2() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착할 수 없습니다. 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public boolean EquipArmorCheck(Adel Adel, Shop Shop) {
		if (Adel.GetinventoryArmor() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착할 수 없습니다. 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public boolean EquipArmorCheck1(Adel Adel, Shop Shop) {
		if (Adel.GetinventoryArmor1() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착할 수 없습니다. 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public boolean EquipArmorCheck2(Adel Adel, Shop Shop) {
		if (Adel.GetinventoryArmor2() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착할 수 없습니다. 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public boolean EquipReleaseCheck(Adel Adel) {
		if (Adel.GetinventoryWeapon() == " " && Adel.GetinventoryWeapon1() == " " && Adel.GetinventoryWeapon2() == " "
				&& Adel.GetinventoryArmor() == " " && Adel.GetinventoryArmor1() == " " && Adel.GetinventoryArmor2() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착 해제할 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public void EquipRelease() {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 어떤 아이템을 장착 해제 하시겠습니까?");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 1. 무기 2. 방어구 3. 나가기");
		System.out.println(" 선택 >>>>>");
	}

	public void ReleaseWeaponChoice(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 장착 해제 가능한 아이템");
		System.out.println(" 무기");
		System.out.println(" 1. " + Adel.GetinventoryWeapon());
		System.out.println(" 2. " + Adel.GetinventoryWeapon1());
		System.out.println(" 3. " + Adel.GetinventoryWeapon2());
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 1 ~ 3. 선택 4. 나가기");
		System.out.println(" 선택 >>>>>");
	}

	public void ReleaseWeapon(Adel Adel, Shop Shop) {
		Adel.SetweaponEquip(" ");
		Adel.SetinventoryWeapon(" ");
		Adel.inventoryWeapon += Shop.Getweapon();
		Adel.atk -= Shop.GetitemStat();
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Shop.Getweapon() + " 가 장착 해제되었습니다");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void ReleaseWeapon1(Adel Adel, Shop Shop) {
		Adel.SetweaponEquip(" ");
		Adel.SetinventoryWeapon1(" ");
		Adel.inventoryWeapon1 += Shop.Getweapon1();
		Adel.atk -= Shop.Getitem1Stat();
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Shop.Getweapon1() + " 가 장착 해제되었습니다");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void ReleaseWeapon2(Adel Adel, Shop Shop) {
		Adel.SetweaponEquip(" ");
		Adel.SetinventoryWeapon2(" ");
		Adel.inventoryWeapon2 += Shop.Getweapon2();
		Adel.atk -= Shop.Getitem2Stat();
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Shop.Getweapon2() + " 가 장착 해제되었습니다");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public boolean ReleaseWeaponCheck(Adel Adel) {
		if (Adel.GetinventoryWeapon() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착 해제 할 수 없습니다. 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public boolean ReleaseWeaponCheck1(Adel Adel) {
		if (Adel.GetinventoryWeapon1() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착 해제 할 수 없습니다. 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public boolean ReleaseWeaponCheck2(Adel Adel) {
		if (Adel.GetinventoryWeapon2() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착 해제 할 수 없습니다. 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public void ReleaseArmorChoice(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 장착 해제 가능한 아이템");
		System.out.println(" 방어구");
		System.out.println(" 1." + Adel.GetinventoryArmor());
		System.out.println(" 2." + Adel.GetinventoryArmor1());
		System.out.println(" 3." + Adel.GetinventoryArmor2());
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 1 ~ 3. 선택 4. 나가기");
		System.out.println(" 선택 >>>>>");
	}

	public void ReleaseArmor(Adel Adel, Shop Shop) {
		Adel.SetarmorEquip(" ");
		Adel.SetinventoryArmor(" ");
		Adel.inventoryArmor += Shop.Getarmor();
		Adel.defense -= Shop.GetitemStat();
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Shop.Getarmor() + " 가 장착 해제되었습니다");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void ReleaseArmor1(Adel Adel, Shop Shop) {
		Adel.SetarmorEquip(" ");
		Adel.SetinventoryArmor1(" ");
		Adel.inventoryArmor1 += Shop.Getarmor1();
		Adel.defense -= Shop.Getitem1Stat();
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Shop.Getarmor1() + " 가 장착 해제되었습니다");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public void ReleaseArmor2(Adel Adel, Shop Shop) {
		Adel.SetarmorEquip(" ");
		Adel.SetinventoryArmor2(" ");
		Adel.inventoryArmor2 += Shop.Getarmor2();
		Adel.defense -= Shop.Getitem2Stat();
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" " + Shop.Getarmor2() + " 가 장착 해제되었습니다");
		System.out.println(" ----------------------------------------------------------------------");
	}

	public boolean ReleaseArmorCheck(Adel Adel) {
		if (Adel.GetinventoryArmor() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착 해제 할 수 없습니다. 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public boolean ReleaseArmorCheck1(Adel Adel) {
		if (Adel.GetinventoryArmor1() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착 해제 할 수 없습니다. 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	public boolean ReleaseArmorCheck2(Adel Adel) {
		if (Adel.GetinventoryArmor2() == " ") {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 장착 해제 할 수 없습니다. 아이템이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		} else {
		}
		return true;
	}

	// 2, 스탯창 - 3. 물약 사용.
	public void itemUse(Adel Adel) {
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 현재 보유하고있는 물약 갯수");
		System.out.println(" 1. 기본 체력 물약 : " + Adel.GethpPostionCount() + "개" + " / " + "4. 기본 마나 물약 : "
				+ Adel.GetmpPostionCount() + "개");
		System.out.println(" 2. 빨강 물약 : " + Adel.GethpPostion1Count() + "개" + "     / " + "5. 파랑 물약 : "
				+ Adel.GetmpPostion1Count() + "개");
		System.out.println(" 3. 체력 엘릭서 : " + Adel.GethpPostion2Count() + "개" + "    / " + "6. 마나 엘릭서 : "
				+ Adel.GetmpPostion2Count() + "개");
		System.out.println(" ----------------------------------------------------------------------");
		System.out.println(" 어떤 아이템을 사용하시겠습니까?");
		System.out.println(" 1 ~ 3. 체력물약 / 4 ~ 6. 마나물약 ");
		System.out.println(" 선택 >>>>>");
	}
	
	public boolean hpPostion(Adel Adel, Shop shop) {
		if (Adel.GethpPostionCount() == 0) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 물약이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;

		} else if (Adel.Gethp() == Adel.GetadelHp()) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 체력이 가득 차 있습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		}
		 else if (Adel.Gethp() <= Adel.GetadelHp()) {
				Adel.hp += Shop.itemStat;
				if (Adel.hp >= Adel.adelHp) {
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" 아이템을 사용하였습니다. 체력이 " + (Shop.itemStat - (Adel.hp - Adel.adelHp)) + "회복되었습니다.");
					System.out.println(" ----------------------------------------------------------------------");
					Adel.hpPostionCount--;
					Adel.Sethp(Adel.adelHp);
					return true;
				}
				Adel.hpPostionCount--;
				System.out
						.println(" ----------------------------------------------------------------------");
				System.out.println(" 아이템을 사용하였습니다. 체력이 " + Shop.itemStat + "회복되었습니다.");
				System.out
						.println(" ----------------------------------------------------------------------");
			}
		return true;
	}
	
	public boolean hpPostion1(Adel Adel, Shop shop) {
		if (Adel.GethpPostion1Count() == 0) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 물약이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;

		} else if (Adel.Gethp() == Adel.GetadelHp()) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 체력이 가득 차 있습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		}
		 else if (Adel.Gethp() <= Adel.GetadelHp()) {
				Adel.hp += Shop.item1Stat;
				if (Adel.hp >= Adel.adelHp) {
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" 아이템을 사용하였습니다. 체력이 " + (Shop.item1Stat - (Adel.hp - Adel.adelHp)) + "회복되었습니다.");
					System.out.println(" ----------------------------------------------------------------------");
					Adel.hpPostion1Count--;
					Adel.Sethp(Adel.adelHp);
					return true;
				}
				Adel.hpPostion1Count--;
				System.out
						.println(" ----------------------------------------------------------------------");
				System.out.println(" 아이템을 사용하였습니다. 체력이 " + Shop.item1Stat + "회복되었습니다.");
				System.out
						.println(" ----------------------------------------------------------------------");
			}
		return true;
	}
	
	public boolean hpPostion2(Adel Adel, Shop shop) {
		if (Adel.GethpPostion2Count() == 0) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 물약이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;

		} else if (Adel.Gethp() == Adel.GetadelHp()) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 체력이 가득 차 있습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		}
		 else if (Adel.Gethp() <= Adel.GetadelHp()) {
				Adel.hp += Shop.item2Stat;
				if (Adel.hp >= Adel.adelHp) {
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" 아이템을 사용하였습니다. 체력이 " + (Shop.item2Stat - (Adel.hp - Adel.adelHp)) + "회복되었습니다.");
					System.out.println(" ----------------------------------------------------------------------");
					Adel.hpPostion2Count--;
					Adel.Sethp(Adel.adelHp);
					return true;
				}
				Adel.hpPostion2Count--;
				System.out
						.println(" ----------------------------------------------------------------------");
				System.out.println(" 아이템을 사용하였습니다. 체력이 " + Shop.item2Stat + "회복되었습니다.");
				System.out
						.println(" ----------------------------------------------------------------------");
			}
		return true;
	}
	
	public boolean mpPostion(Adel Adel, Shop shop) {
		if (Adel.GetmpPostionCount() == 0) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 물약이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;

		} else if (Adel.Getmp() == Adel.GetadelMp()) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 마나가 가득 차 있습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		}
		 else if (Adel.Getmp() <= Adel.GetadelMp()) {
				Adel.mp += Shop.itemStat;
				if (Adel.mp >= Adel.adelMp) {
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" 아이템을 사용하였습니다. 마나가 " + (Shop.itemStat - (Adel.mp - Adel.adelMp)) + "회복되었습니다.");
					System.out.println(" ----------------------------------------------------------------------");
					Adel.mpPostionCount--;
					Adel.Setmp(Adel.adelMp);
					return true;
				}
				Adel.mpPostionCount--;
				System.out
						.println(" ----------------------------------------------------------------------");
				System.out.println(" 아이템을 사용하였습니다. 마나가 " + Shop.itemStat + "회복되었습니다.");
				System.out
						.println(" ----------------------------------------------------------------------");
			}
		return true;
	}
	
	public boolean mpPostion1(Adel Adel, Shop shop) {
		if (Adel.GetmpPostion1Count() == 0) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 물약이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;

		} else if (Adel.Getmp() == Adel.GetadelMp()) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 마나가 가득 차 있습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		}
		 else if (Adel.Getmp() <= Adel.GetadelMp()) {
				Adel.mp += Shop.item1Stat;
				if (Adel.mp >= Adel.adelMp) {
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" 아이템을 사용하였습니다. 마나가 " + (Shop.item1Stat - (Adel.mp - Adel.adelMp)) + "회복되었습니다.");
					System.out.println(" ----------------------------------------------------------------------");
					Adel.mpPostion1Count--;
					Adel.Setmp(Adel.adelMp);
					return true;
				}
				Adel.mpPostion1Count--;
				System.out
						.println(" ----------------------------------------------------------------------");
				System.out.println(" 아이템을 사용하였습니다. 마나가 " + Shop.item1Stat + "회복되었습니다.");
				System.out
						.println(" ----------------------------------------------------------------------");
			}
		return true;
	}
	
	public boolean mpPostion2(Adel Adel, Shop shop) {
		if (Adel.GetmpPostion2Count() == 0) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 물약이 없습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;

		} else if (Adel.Getmp() == Adel.GetadelMp()) {
			System.out.println(" ----------------------------------------------------------------------");
			System.out.println(" 마나가 가득 차 있습니다.");
			System.out.println(" ----------------------------------------------------------------------");
			return false;
		}
		 else if (Adel.Getmp() <= Adel.GetadelMp()) {
				Adel.mp += Shop.item2Stat;
				if (Adel.mp >= Adel.adelMp) {
					System.out.println(" ----------------------------------------------------------------------");
					System.out.println(" 아이템을 사용하였습니다. 마나가 " + (Shop.item2Stat - (Adel.mp - Adel.adelMp)) + "회복되었습니다.");
					System.out.println(" ----------------------------------------------------------------------");
					Adel.mpPostion2Count--;
					Adel.Setmp(Adel.adelMp);
					return true;
				}
				Adel.mpPostion2Count--;
				System.out
						.println(" ----------------------------------------------------------------------");
				System.out.println(" 아이템을 사용하였습니다. 마나가 " + Shop.item2Stat + "회복되었습니다.");
				System.out
						.println(" ----------------------------------------------------------------------");
			}
		return true;
	}

	public static Adel GetAdel() {
		return Adel;
	}

}
