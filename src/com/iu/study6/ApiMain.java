package com.iu.study6;

public class ApiMain {

	public static void main(String[] args) {
		//객체 생성
		Object obj = new Object();
		boolean check = obj.equals(null);
		String str = obj.toString();
		int r=obj.hashCode();
		String st = new String("hello");

		char ch=st.charAt(1);
		System.out.println(ch);
	}

}