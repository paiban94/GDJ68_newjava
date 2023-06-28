package com.iu.study2;

import java.util.Random;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
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
		
		for(int hit=0; hit<1; hit++) {
			int ranomhit= random.nextInt(10);
			System.out.println(ranomhit);
		}
	
		for(int skill=0; skill<1; skill++) {
			int randomskill=random.nextInt(30);
			System.out.println(randomskill);
		}
		
		for(int heal=0; heal<1; heal++) {
			int randomheal=random.nextInt(40);
			System.out.println(randomheal);
		
			//int Hp = Hp+randomheal; 현재 hp+랜덤힐 값 나와야함
		}
	boolean run=true;
	if() {}
	}

}
