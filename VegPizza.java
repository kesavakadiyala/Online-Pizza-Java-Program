package com.kesava.pizza;

public class VegPizza extends Pizza{
	
	int size;	
	String type;
	
	VegPizza(int size,String type) throws InvalidPizzaException{
		this.size=size;
		this.type=type;
		boolean value=validate(size,type);
		if(value==false)
			throw new InvalidPizzaException("Plz Enter Corrrect Size and Type");
	}
	
	@Override
	float calculatePrice() {
		
		if(type.equals("plain"))
			return 50*size;
		else if(type.equals("deluxe"))
			return 150*size;
		else if(type.equals("supreme"))
			return 200*size;
		else
			return 0;
		
	}
			
}
