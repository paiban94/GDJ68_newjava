package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
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
		
		/*for(int hit=0; hit<1; hit++) {
			int randomhit= random.nextInt(10);
			System.out.println(randomhit);
		}*/
		int randomhit= random.nextInt(10);
		int randomskill= random.nextInt(30);
		int randomheal=random.nextInt(40);
		int monatk=random.nextInt(40);
		int All=Hp+randomheal;
		int a = Hp-monatk;
		boolean run=random.nextBoolean();
		
		
		
	/*	if(a+randomheal<=40) {
			System.out.println("최대로회복");
		}else {randomheal+"를(을) 회복하였다"}
	*/	
		/*for(int skill=0; skill<1; skill++) {
			int randomskill=random.nextInt(30);
			System.out.println(randomskill);
		}*/
		
		/*for(int heal=0; heal<1; heal++) {
			int randomheal=random.nextInt(40);
			System.out.println(randomheal);
		
			//int Hp = Hp+randomheal; 현재 hp+랜덤힐 값 나와야함
		}*/
	
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
}

}





