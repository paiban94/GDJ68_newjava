package com.iu.study4.s3;

public class Car {
	
	String company;
	String brand;
	String color;
	int price;
	
	//생성자(Constructor)
	//접근지정자 클래스명과동일한이름([매개변수들 선언]){}
	public Car(/*[]생략가능*/) {
		// 기본 생성자
		System.out.println("자동차를 만듭니다");
		this.company="AUDI"; // 생략되어있음 기본값이 defalut
		this.brand="A7";
		this.color="WHITE";
		this.price=9985;
	}
	
	public Car(String brand) {
		this(brand, "WHITE");
//		this.company="AUDI";
//		this.brand=brand;
//		this.color="WHITE";
//		this.price=9985;
	}
	
	public Car(String brand, String color) {
		this.company="AUDI";
		this.brand=brand;
		this.color=color;
		this.price=9985;
	}
	
	public Car(String company, String brand, String color, int price) {
		this.company=company;
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	
	
	public void info() {
		System.out.println("Company : " +this.company);
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Price : "+this.price);
	
	}
}
