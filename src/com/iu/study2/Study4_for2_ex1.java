package com.iu.study2;

import java.util.Scanner;

public class Study4_for2_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//FPS
		//30발, 3탄창
		//M16, 2가지: 단발, 3점사		
		//1.단발, 2.점사
		//탕, 탕탕탕
	
	/*System.out.println("1번 단발 , 2번 점사");
		int m16 = sc.nextInt();
	
		if(m16==1) {
		for(int I=0;I<4;I++) {
			
		for(int i=0;i<31;i++) {
		
			for(int s=0;s<31;s++ ) {
				System.out.println("탕");
			}
		}
	}
		}
	else if(m16==2) {
			for(int I=0;I<4;I++) {
				for(int i=0;i<31;i=i+3)
					for(int s=0;s<31;s=s+3 ) {
						System.out.println("탕탕탕");}
			break;}
			
		}*/
	
		for(int tan=0;tan<3;tan++) {
			System.out.println("1.단발 2,점사");
			int select=sc.nextInt();
			int count=10;
			String sound="탕탕탕";
			if(select==1) {
				count=10;
				sound="탕";
				/*for(int b=0;b<30;b++) {
					System.out.println("탕");
				};*/
			}
//			else {
//				count=10;
//				sound="탕탕탕";
//			}
				for(int b=0;b<10;b++) {
					System.out.println(sound);
				}
				/*for(int b=0;b<10;b++) {
					System.out.println("탕탕탕");
				}*/
			}
		}
	
	
	
	
	
	
	}
	
