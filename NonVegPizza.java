package com.kesava.pizza;

public class NonVegPizza extends Pizza{

	int size;	
	String type;
	
	NonVegPizza(int size,String type) throws InvalidPizzaException{
		this.size=size;
		this.type=type;
		boolean value=validate(size,type);
		if(value==false)
			throw new InvalidPizzaException("Plz Enter Corrrect Size and Type");
	}
	
	@Override
	float calculatePrice() {
		
		if(type.equals("plain")){
			return 100*size;
		}
		else if(type.equals("deluxe")){
			return 250*size;
		}
		else if(type.equals("supreme")){
			return 300*size;
		}
		else
			return 0;
	}
	
}
