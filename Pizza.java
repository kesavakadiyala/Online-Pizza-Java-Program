package com.kesava.pizza;

public abstract class Pizza {
	
	abstract float calculatePrice();
	public boolean validate(int size, String type){
		
		if(((size==6)||(size==9)||(size==12))&&((type.equals("plain"))||(type.equals("deluxe"))||(type.equals("supreme"))))
			return true;
		else 
			return false;
	}
}
