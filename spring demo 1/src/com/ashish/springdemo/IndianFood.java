package com.ashish.springdemo;

public class IndianFood implements Food {

	private RefreshmentDrinks refreshmentDrink;
	
	public IndianFood(RefreshmentDrinks refreshmentDrink) {
		this.refreshmentDrink = refreshmentDrink;
	}

	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "Pav Bhaji";
	}

	@Override
	public String getDrinks() {
		// TODO Auto-generated method stub
		return refreshmentDrink.welcomeDrink();
	}

}
