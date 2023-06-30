package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		//Scanner sc = new Scanner(System.in);
		//TRPG
		
		int Hp=40;//유저의 HP
		int monsterHp=60;//몬스터의 HP
		int monsterPower=40;//몬스터의 공격력
		
		
		
		//유저정보 : hp 
		//1.평타 2.스킬 3.HP회복 4. 도망 
		//평타 : 0~10 미만의 공격이 몬스터에게 적용
		//스킬 : 0~30 미만의 공격이 몬스터에게 적용(최대3번까지만)
		//회복 : 회복량 0~40 까지 회목, 40초과 x
		//도망 : 50%확률로 성공, 실패
		
		//monster
		//1 : 유저 공격0~40 미만의 공격을 유저에게
		

/* 내가한거	int randomhit= random.nextInt(10);
		int randomskill= random.nextInt(30);
		int randomheal=random.nextInt(40);
		int monatk=random.nextInt(40);
		int All=Hp+randomheal;
		int a = Hp-monatk;
		boolean run=random.nextBoolean();
		
		
		System.out.println("1.hit 2.skill 3.heal 4.run");
		int select =sc.nextInt();
		
		if(select==1) {
			System.out.println("평타공격");
			System.out.println("몬스터 체력이"+(monsterHp-randomhit)+"이(가) 남았다.");
		} else if(select==2){
			System.out.println("스킬발동");
			System.out.println(monsterHp-randomskill+"이(가) 남았다.");
		} else if(select==3 ){
			if(a+randomheal<40) {
				System.out.println("최대로회복");
			}else {System.out.println(randomheal+"회복하였다");}
			
			System.out.println("회복");
			System.out.println("내 체력이"+(All)+"이(가) 회복되었다.");
			}
	else if(select==4) {if(run) {}
		System.out.println("도주하시겠습니까?");
		System.out.println("");
		}

	*/
	//--------------선생님이하신거
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		int skillcount=3;
		while(flag) {			// 2명중 누가 언제 죽을 지 모르기대문에 while문 무한반복..
			System.out.println("1.평타 2.스킬 3.회복 4.도망");
			int select = sc.nextInt();
			
			if(select==1) {
				//평타
				//Damage
				select = random.nextInt(10);
				monsterHp=monsterHp-select;
				System.out.println("몹에게"+select+"피해를 주었습니다.");
				if(monsterHp<1) {
					System.out.println("몸이 죽었어요");
					break;
				}
				
			}else if(select==2) {
				//스킬
				if(skillcount>0) {
									
				select = random.nextInt(31);
				monsterHp=monsterHp-select;
				System.out.println("몹에게"+select+"피해를 주었습니다.");
				if(monsterHp<1) {
					System.out.println("몸이 죽었어요");
					break;
				}
				skillcount--;
				}else {System.out.println("마나가 부족합니다.");}
			}else if(select==3) {
				//회복
				select= random.nextInt(41);
				Hp=Hp+select;
				if(Hp>40) {
					Hp=40;
				}
				System.out.println("Hp를 회복했어요.");
			}else {
				//도망
				select = random.nextInt(1001);   
				if(select%2!=0) {    // 위에int가2 select==0 해도 50%확률가능하긴함
					System.out.println("도망 성공");
					break;
				}else {
					System.out.println("도망 실패");
				}
				break; //도망이면 무조건 종료기때문
				}
		
		
	
	
		select=random.nextInt(41);
		Hp=Hp-select;
		System.out.println("유저에게"+select+"피해를 주었습니다.");
		if(Hp<1) {
		System.out.println("You Die");	
		break;
		}		
	}//while끝
	}
}





