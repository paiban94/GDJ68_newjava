package com.iu.study4.s1;

public class S1Main {

	public static void main(String[] args) {
		//
		Hap hap = new Hap();
		
	int sum =hap.h1(10,20);
			//참조변수.
			//*2	
	System.out.println(sum*2);
	
	
		//h2 결과출력
	boolean check = hap.h2(21); 
	System.out.println(check);
		//h3 length출력
	int[] ar = hap.h3(5);
	System.out.println(ar.length);

	}
}