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
				}else {
					check=false;
				//= check=!check;	
					break;
					}
				}//while 끝
			if(check) {
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
			
			//---선생님코드
		
			
			int level=1;
			int gold=0;
			//int count=3;
			for(level=1;level<15;level++) {
			
				if(level%5==0) {
					System.out.println("5레벨 달성 출하합니다.");
					gold = gold+ level/5*1000;
				}
			//	if(level==10) {   (level%5==0 로 처리)
			//		System.out.println("10레벨 달성 출하합니다.");
			//		gold = gold+ 2000;
			//	}
								
				//count=3*level;  => level*3 으로 처리
				//렙업시 게임을 계속할지 종료할지 선택
				System.out.println("1.사냥시작 2.게임종료");
				int select=sc.nextInt();
				if(select !=1) {
					break;
				}
				
				for(int monster=0;monster<level*3;monster++) {
					System.out.println(monster+1+"마리 사냥 성공");
				}

			System.out.println(level+1+"로 레벨업 하였습니다.");
				
			} // 레벨업과정
			if(level%5==0) {
				System.out.println("15레벨 달성 출하합니다.");
				gold=gold+3000;
			}
			//게임종료시 레벨이 15가 아닐수 있으므로 따로 작성
			
			//현재레벨, GOLD 출력
			
			System.out.println("현재 레벨 :"+ level);
			System.out.println("현재 골드 :"+ gold);
			}
		}
}
			
			//----내가한거---------------------------
		
	/*		int lev=1;
			for(lev=1;lev<15;lev++) {
			System.out.println(lev+1+"로 레벨업 하였습니다.");
			}
			int kill=0;
			for(kill=0;kill%3==0;kill++) {
				System.out.println("사냥");
			}
			
			
			System.out.println("프로그램 종료");
			}
	}*/
	
