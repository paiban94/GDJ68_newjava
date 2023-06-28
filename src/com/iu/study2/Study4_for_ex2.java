package com.iu.study2;

import java.util.Scanner;

public class Study4_for_ex2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		int id=1234;
		int pw=5678;
		
		boolean check=false;
		//로그인 시도 최대 5번까지
		for(int i=0;i<5;i++) {
			System.out.println("ID 입력");
			int yId = sc.nextInt();
			System.out.println("PW 입력");
			int yPw = sc.nextInt();
			if(id==yId && pw==yPw) {
				System.out.println("로그인 성공");
				i=4;
				check=!check;
			}else {
				System.out.println("ID또는 PW가 틀렸습니다");
			} 
			System.out.println("프로그램종료");
		}
		//로그인성공시 급여계산출력
		if(check) {System.out.println("급여 계산");
			
		}
	}


}
		
		
		
	

