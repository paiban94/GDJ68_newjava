package com.iu.study2;

public class Study3_ex1 {
	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점 평균 계산 평균은 (int)
		//90:A 80:B 70:C 60:D 그외:F
		//switch 사용
		int kor=88;
		int eng=66;
		int math=91;
		
		int total=kor+eng+math;
		int avg=total/3;
		
	
		
		switch(avg/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		
		}
		
	}
}
