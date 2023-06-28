package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;

		
				
	/*	System.out.println("ID를 입력하세요");
		int yId=sc.nextInt();
		System.out.println("PW를 입력하세요");
		int yPw=sc.nextInt();
		
		if(yId==id && yPw==pw) {
			System.out.println("로그인성공");
		}else {System.out.println("로그인실패");}
		//while
		//1.로그인시도 2.프로그램종료
		//
		while(yId!=id || yPw!=pw) {
			System.out.println("로그인재시도");
			System.out.println("ID를 입력");
			int yyId=sc.nextInt();
			System.out.println("PW를 입력");
			int yyPw=sc.nextInt();
			if(yyId==id && yyPw==pw) {
				System.out.println("로그인재성공");
				break;}
			else {System.out.println("로그인실패");}*/
			
			
			
		//------------------선생님코드	
			
			boolean check=true;
		
			while(check) {
				System.out.println("1.로그인 2.종료");
				int select=sc.nextInt();
				if(select==1) {
					System.out.println("ID입력");
					int yId=sc.nextInt();
					System.out.println("PW입력");
					int yPw=sc.nextInt();
					if(id==yId && pw==yPw) {
						System.out.println("로그인성공");
					break;
					}else {
						System.out.println("로그인실패");
					}
				}else {break;
					}
				}//while 끝
			
			//로그인 성공 했을 때만 진행
			//MMORPG
			//시작레벨:1
			//모든 몬스터의 경험치는 동일
			//최대레벨:15
			//GOLD : 0
			//5레벨 달성시 : 1000골드 지급
			//10레벨 달성시 : 2000골드 지급
			//15레벨 달성시 : 3000골드 지급
			//1 -> 2 : 3 (사냥성공)
			//2 -> 3 : 6
			//3 -> 4 : 9
			//....
			//14-> 15 : 42
			//렙업 시 게임을 계속할지 종료할지 선택 
			//현제레벨, GOLD 출력
			
		/*
			
			int level=1;
			for(level=1;level<15;level++) {
			System.out.println(level+1+"로 레벨업 하였습니다.");
				
			}
			
			
			*/
			
			
			
			
			
			//-------------------------------
			int lev=1;
			for(lev=1;lev<15;lev++) {
			System.out.println(lev+1+"로 레벨업 하였습니다.");
			}
			int kill=0;
			for(kill=0;kill%3==0;kill++) {
				System.out.println("사냥");
			}
			
			
			System.out.println("프로그램 종료");
			}
	}
	
