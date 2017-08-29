package com.ashish.springdemo;

public class SouthIndianFood implements Food {

	private RefreshmentDrinks refreshment;
	
	public SouthIndianFood()
	{
		System.out.println("SouthIndianFood: inside constructor");
	}
	
	public void setRefreshment(RefreshmentDrinks refreshment) {
		System.out.println("SouthIndianFood: inside setter Method");
		this.refreshment = refreshment;
	}

	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "Idli Dosa";
	}

	@Override
	public String getDrinks() {
		// TODO Auto-generated method stub
		return refreshment.welcomeDrink();
	}

}
