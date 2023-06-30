package com.iu.study4.s2;

public class S2Main {

	public static void main(String[] args) {
		
		StudentService sv = new StudentService();
		Student student  = sv.makeStudentOne();// 호출 : 변수명.참조변수
		System.out.println(student.avg);
				

	}

}
