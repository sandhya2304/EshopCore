package com.Eshop;

import java.util.ArrayList;
import java.util.List;

public class Products
{
	
	private final List<Product> products=new ArrayList<>();
	
	
	public Products() {
		this.initStoreDummyItems();
	}
	
	public List<Product> getProducts()
	{
		return products;
	}
	
	
	public void initStoreDummyItems()
	{
		
		String[] proudctNames={"Lux","Santoor","fiama","dettol"};
		Double[] productPrice={50.0d,321.0d,764.0d,900.0d};
 		
		Integer[]  stock={10,20,50,60};
		
		
		for(int i=0;i < proudctNames.length;i++)
		{
			this.products.add(new Product(i+1,proudctNames[i],productPrice[i], stock[i]));
		}
		
	}
	
	

}
