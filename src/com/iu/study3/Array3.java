package com.iu.study3;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		//System.out.println(nums.length); //배열의 길이 보기
		
		int [] copyNums = new int [nums.length+1]; 
		
		for(int i=0;i<nums.length; i++) {
			copyNums[i]=nums[i];
		}//복사하기
		
		copyNums[nums.length]=5;
		nums=copyNums;
	
		
			//nums : 5칸
		
		copyNums = new int [nums.length-1];
		for (int i=0;i<copyNums.length;i++) {
			copyNums[i]=nums[i];
		}
		
		nums=copyNums;

		for(int i=0; i<nums.length;i++) {
		System.out.println(nums[i]);
			}
		
			
		System.out.println("추가할 번호를 입력하세요");
	
	}
}
