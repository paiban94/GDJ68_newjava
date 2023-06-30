package com.iu.study3;

public class Array1 {

	public static void main(String[] args) {
		// 배열(array)

		int num=1;
		int num2=2;
		double d=3.12;
	
		//데이터타입 변수명
		//모을려고하는 데이터타입 [] 변수명 = new 모으려고하는데이터타입[갯수];
		int [] nums = new int [2] ; //[]까지 데이터타입 -> 배열이라는뜻
		double [] avgs =new double[3];
		char[] chs =new char[3];
		boolean [] checks = new boolean[3];
		System.out.println(num);
		System.out.println(nums);
		//배열 사용 : 배열의변수명[인덱스번호], index번호는 정수타입(int)
		System.out.println(nums[0]);
		System.out.println(avgs[0]);
		System.out.println(chs[0]);
		System.out.println(checks[0]);
		//모든변수는 초기화하지않으면 사용불가. 그러나 nums는 heap에 있고 자동으로 index를 초기화 시켜줘서 
		// 초기화 따로 진행 x
		//문자열 3개를 모을 배열 선언
		String [] names = new String [3];
		System.out.println(names);
		System.out.println(names[0]);
		
		int	[] nums2 = {1,2,3}; // 1,2,3을 모은 배열을 만든다는뜻
		
		int nums3 [] = new int [3];
		nums = nums2;
	
	
	}

}
