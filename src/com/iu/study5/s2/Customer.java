package com.iu.study5.s2;

public class Customer {
	
	private int money;
	private int point;
	
	public Customer() {
		this.money=1000000;
		this.point=50;
	}

	public void buy(Computer computer) {
		this.money = this.money-computer.getPrice();
		this.point=this.point+computer.getPoint();
		System.out.println(this.money);
		System.out.println(this.point);
	}
	
	public void buy(Tv computer) {
		this.money = this.money-computer.getPrice();
		this.point = this.point+computer.getPoint();
	}
	public void buy(Product [] products) {
		for(int i=0;i<products.length;i++) {
			this.buy(products[i]);
		}
	}

}
