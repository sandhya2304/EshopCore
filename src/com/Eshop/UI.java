package com.Eshop;

import java.util.List;
import java.util.Scanner;

public class UI 
{
	
	Cart cart=new Cart();
	
	int ch=0;
	
	public UI() {
		menu();
	}
	
	
	public void startScreen()
	{
		System.out.println("1. display store products");
		System.out.println("2. display cart");
		System.out.println("0. Exit");
		
	}
	
	private int getUserInput()
	{
		Scanner input=new Scanner(System.in);
		ch=Integer.parseInt(input.nextLine());
		return ch;
		
	}
	
	
	public void menu()
	{
		
		do
		{
			startScreen();
			getUserInput();
			
			switch (ch)
			{
			  case 1:
				  displayStoreProducts();
				  storeProductMenuToCart();
				  getUserInput();
				  innerChoice1();			  
				break;
			  case 2:
				  showCart();
				  
			  case 0:
			    	System.exit(0);
			

			default:
				break;
			}
			
			
		}while(ch!=0);
	
	}
	
	public void innerChoice1()
	{
		switch(ch)
		{
		
		    case 1:
		      addProductToCart();
		      showCart();
		      break;
		     
		    case 2:
		      removeProductFromCart();	
		      break;
		      
		   
		      default:
		    	  break;
		}
		
	}
	
	
	private void removeProductFromCart() {
		int pid=getUserInput();
		cart.removeProductByPId(pid);
	}


	private void showCart() {
	  cart.printCartItems();
		
	}


	private void addProductToCart() 
	{
		int pid=getUserInput();
		cart.addproductToCartByPid(pid);
		
	}


	public void displayStoreProducts()
	{
		List<Product> products=new Products().getProducts();
		for(Product prod:products)
		{
			System.out.println(prod.getPid()+"-"+prod.getName()+"-"+prod.getPrice()+"-"+prod.getStock());
			
		}
		
		
	}
	
	public void storeProductMenuToCart()
	{
		System.out.println("1. Add To Cart");
		System.out.println("2. Remove from Cart");
		System.out.println("3. Exit");
		
	}

}
