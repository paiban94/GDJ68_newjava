package com.iu.study2;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 로그인 성공 했을 때만 진행
		// MMORPG
		// 시작레벨:1
		// 모든 몬스터의 경험치는 동일
		// 최대레벨:15
		// GOLD : 0
		// 5레벨 달성시 : 1000골드 지급
		// 10레벨 달성시 : 2000골드 지급
		// 15레벨 달성시 : 3000골드 지급
		// 1 -> 2 : 3 (사냥성공)
		// 2 -> 3 : 6
		// 3 -> 4 : 9
		// ....
		// 14-> 15 : 42
		// 렙업 시 게임을 계속할지 종료할지 선택
		// 현제레벨, GOLD 출력

		Scanner sc = new Scanner(System.in);
		int lev =1;
		for (lev = 1; lev < 15; lev++) {
			for (int kill = 0; kill < 3; kill++) {
				System.out.println("kill");
			}
			System.out.println(+lev+1+"레벨업!");
		
		 System.out.println("현재골드");
			int level=1;
			int G = 1000;
			
			if (lev == level && lev%5==0 ) {
				System.out.println("1000골드 획득");
			} else if (lev%5==0) {
				System.out.println("2000골드 획득");
			} else if (lev%5==0) {
				System.out.println("3000골드획득");
				System.out.println("현제레벨:15 소지골드:6000");
			}

		}

		System.out.println("게임을 계속하시겠습니까?");
		System.out.println("1.continue 2.exit");
		int select = sc.nextInt();
		if (select == 1) {
			System.out.println("continue");
		} else {
			System.out.println("exit");
		}
		
		}
		
	}


// int kill=3;
// for(int kill=3; kill<4; kill++){
// System.out.println("레벨업!!");
