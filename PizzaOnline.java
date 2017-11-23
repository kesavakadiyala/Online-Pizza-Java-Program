package com.kesava.pizza;

public class PizzaOnline {

	private float totalSales;

	float order(Pizza pizza){
		float price;
		if(pizza.equals(pizza)){
			price=pizza.calculatePrice();
			totalSales=totalSales+price;
			return price;
		}
		else if(pizza.equals(pizza)){
			price=pizza.calculatePrice();
			totalSales=totalSales+price;
			return price;
		}
		else{
			return 0;
		}
		
	}

	float getTotalSales(){
		
		return totalSales;
	}
	
	public static void main(String[] args) throws InvalidPizzaException {

		PizzaOnline po = new PizzaOnline();
		VegPizza vp1 = new VegPizza(9, "plain");
		NonVegPizza nvp1 = new NonVegPizza(12, "deluxe");
		VegPizza vp2 = new VegPizza(6,"supreme");
		
		float price=po.order(vp1);
		System.out.println(price);
		price=po.order(nvp1);
		System.out.println(price);
		price=po.order(vp2);
		System.out.println(price);
		System.out.println(po.getTotalSales());
		
	}

}
