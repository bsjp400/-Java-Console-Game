package com.baeseokjae;

import java.util.Scanner;

public class Tests extends Thread {
	
	static int choice;
	
	Scanner input = new Scanner(System.in);
	
	MapleStory MapleStory;
	Adel Adel;
    Monster monster;
    Service service = new Service();
    boolean isRunAway = true;
	
    public Tests(Adel Adel, Monster monster) {
        this.Adel = Adel;
        this.monster = monster;
    }
    
    @Override
    public void run() {
        int inputValue = 0;
        boolean isLoop = true;
        try {
            while (!Thread.currentThread().isInterrupted() && isLoop) {
            	if (monster.Gethp() > 0) {
                    if(Adel.Gethp() > 0){
                        service.monsterAndUserState(Adel, monster);
                        //이 부분을 조건문으로 감싸면 쓰레드가 죽지 않는다.
                        //TODO 쓰레드가 왜 안죽는지 점검 필요함.
                        inputValue = input.nextInt();
                    }else if(Adel.Gethp() > 0){
                        isLoop = false;
                        break;
                    }
                }
                switch (inputValue) {
                    case 1://일반공격
                        if(Adel.Gethp() > 0){
                            monster.hp -= Adel.atk - (monster.Getdefense());
                            System.out.println(" ----------------------------------------------------------------------");
        					System.out.println(" " + monster.name + " 을 공격 하였습니다. 데미지는 " + (Adel.atk - monster.Getdefense()) + "이 들어갔습니다.");
        					System.out.println(" ----------------------------------------------------------------------");
                        }
                        if (Adel.Gethp() <= 0) {
                            //유저 케릭터가 사망시 hp가 -값이 나오지 않도록 0으로 대입
                            Adel.Sethp(0);
                            Adel.hp += Adel.hp / 4;
                            System.out.println(" ----------------------------------------------------------------------");
                			System.out.println(" 체력이 0 이 되어 사망하였습니다. 체력은 20% 회복되어 부활합니다");
                			System.out.println(" 마을로 귀환합니다.");
                			System.out.println(" ----------------------------------------------------------------------");
                            System.exit(0);
                            
                        }
                         else if (monster.Gethp() <= 0) {
                            //몬스터가 죽었을 경우 hp가 -값이 나오지 않도록 0으로 대입
                            monster.Sethp(0);
                            System.out.println(" ----------------------------------------------------------------------");
        					System.out.println(" 몬스터를 처리하셧습니다. ");
        					System.out.println(" " + monster.Getmoney() + " 메소를 획득하셨습니다.");
        					System.out.println(" " + monster.Getmonexp() + " 경험치를 획득하셨습니다.");
        					System.out.println(" 마을로 귀환합니다.");
        					System.out.println(" ----------------------------------------------------------------------");
                            Adel.money += monster.Getmoney();
                            Adel.exp += monster.Getmonexp();
                            if (Adel.exp == Adel.levelexp) {
                            	Adel.Setexp(0);
        						Adel.level++;
        						Adel.levelexp = Adel.Getlevelexp() + 100;
        						Adel.statPoint++;
        						Adel.skillPoint++;
                            }
                            isLoop = false;
                            break;
                        }
                        break;
                    case 2://스킬사용
                        //케릭터가 보유한 Skill List를 출력
                        System.out.println(" ----------------------------------------------------------------------");
    					System.out.println("어떤 스킬을 사용하시겠습니까?");
    					System.out.println("1. 공격스킬 2. 버프스킬.");
    					System.out.println(" ----------------------------------------------------------------------");
    					
    					choice = input.nextInt();
                        
                        //사용하려는 스킬종류에 따라 적용범위가 달라진다.
                        //힐을 사용할 경우 유저의 HP를 상승시킴.
                        if (choice == 1) {
                            monster.hp -= Adel.GetactiveSkill();
                            System.out.println(" ----------------------------------------------------------------------");
    						System.out.println(" 공격스킬을 사용했습니다. 데미지는 " + (Adel.GetactiveSkill() - monster.Getdefense()) + "이 들어갔습니다.");
    						System.out.println(" ----------------------------------------------------------------------");
                            break;
                            //보호막 스킬은 방어력을 상승시킴.
                        } else if (choice == 2) {
                        	Adel.hp += Adel.GetbuffSkill();
                        	Adel.mp += Adel.GetbuffSkill();
                        	Adel.defense += Adel.GetbuffSkill();
                        	Adel.atk += Adel.GetbuffSkill();
                        	System.out.println(" ----------------------------------------------------------------------");
    						System.out.println(" 버프스킬을 사용했습니다. 일시적으로 공격력이 " + Adel.GetbuffSkill() + "만큼 증가하였습니다.");
    						System.out.println(" ----------------------------------------------------------------------");
                            break;
                            //스킬 사용시 몬스터가 죽을때.
                        } else if (monster.hp <= 0) {
                            	//몬스터가 죽었을 경우 hp가 -값이 나오지 않도록 0으로 대입
                                monster.Sethp(0);
                                System.out.println(" ----------------------------------------------------------------------");
            					System.out.println(" 몬스터를 처리하셧습니다. ");
            					System.out.println(" " + monster.Getmoney() + " 메소를 획득하셨습니다.");
            					System.out.println(" " + monster.Getmonexp() + " 경험치를 획득하셨습니다.");
            					System.out.println(" 마을로 귀환합니다.");
            					System.out.println(" ----------------------------------------------------------------------");
                                Service.GetAdel().money += monster.Getmoney();
                                Service.GetAdel().Setexp(monster.Getmonexp());
                                isLoop = false;
                                break;
                        }
                         //유저의 MP가 없을경우 스킬을 사용할 수 없음.
                         else if (Adel.Getmp() <= 0)
                            System.out.println("마나가부족하여 스킬을 사용할 수 없습니다.");
                        	break;
                    case 3://상태창
                        break;
                    case 4://도망
                        isLoop = false;
                        isRunAway = false;
                        System.out.println("도망쳤습니다..");
                        break;
                    default:
                        break;
                }
            }
            sleep(1);
        } catch (Exception e) {
        	
        }
    }
}