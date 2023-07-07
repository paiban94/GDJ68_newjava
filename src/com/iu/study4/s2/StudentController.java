package com.iu.study4.s2;

import java.util.Scanner;

public class StudentController {


	public void start() {
		//1번 누르면 학생 정보 생성   --> makeStudents 호출
		//2. 학생정보 출력 -- studentView
		//3. 프로그램 종료 --
		//1번 누르고 다시 메뉴나와야함
		Scanner sc = new Scanner(System.in);
		int select =0;
		StudentService studentService = new StudentService();
		StudentView studentView = new StudentView();
		Student [] students = null;
		
		while(true) {
			
			System.out.println("1.학생정보생성");
			System.out.println("2.학생정보출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.프로그램종료");
			select = sc.nextInt();
			if(select==1) {
			students = studentService.makeStudents();
			}else if (select==2) {
				studentView.view(students);
			}else if(select==3) {
				//1. findByNum
			Student student=studentService.findByNum(students);
				//2. viewOne
				studentView.viewOne(student);
			}else {System.out.println("종료합니다.");
					break;
			}
			
			
		
	}
	
	}

}
//					- 1번 누르면 스튜던트서비스 
// 메인메서드 - >컨트롤러 	- 2번 뷰
//					- 3번 종료 - 메인 메서드로 돌아감