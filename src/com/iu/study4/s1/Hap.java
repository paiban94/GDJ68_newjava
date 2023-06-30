package com.iu.study4.s1;

public class Hap {

	public int h1(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(sum);
		return sum; //메서드가 끝나기전에 리턴
	}

	public boolean h2(int num) {
		boolean result = false;
		if(num%2!=0) {
			//result=true;
			result =!result;
		}
		return result;
		//홀수면 true, 짝수면 false 리턴
	}

	public int[] h3(int count) {
		//count 수 만큼 정수를 담을 배열을 만들어서 리턴
		int [] ar = new int[count];
		return ar;
	//	==return new int[count];
		
	}
	
	
}
 // void => 리턴할게 없다라는 뜻
// return은 타입 한개만 가능