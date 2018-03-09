package com.Eshop;

import java.util.ArrayList;
import java.util.List;

public class Cart
{
	
	List<Product> cartItems=new ArrayList<>();
	
	
	public void addproductToCartByPid(int pid)
	{
		 Product p=getProductByProductById(pid);
		 cartItems.add(p);
	   
		
	}
	
	public Product getProductByProductById(int pid)
	{
		Product product=null;
		
		List<Product> products=new Products().getProducts();
		for(Product p:products)
		{
			if(p.getPid()==pid)
			{
				product=p;
				
				break;
			}
		}
		return product;
		
	}
	
	public void addToCart(Product p)
	{
		cartItems.add(p);
		
	}

	
	public void removeProductByPId(int pid)
	{
		Product p=getProductByProductById(pid);
		cartItems.remove(p);
	
	}
	
	public void printCartItems()
	{
		for(Product p:cartItems)
		{
			System.out.println(p);
		}
	}
}
