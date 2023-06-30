package com.iu.study4;

public class Soldier {
//멤버변수는 데이터타입 상관없음
	String grade;
	int num;
	
	int [] ar;
	
	public void attack(int count) {
		Rifle rifle = new Rifle();
		rifle.shoot1(count);
	
	}
}
