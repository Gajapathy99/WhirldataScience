package com.food;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart 
{
	HashMap<Integer,Order_Item> cart_array=new HashMap<Integer,Order_Item>();
	//ArrayList<Order_Item> cart_array=new ArrayList<Order_Item>();
	int total=0;
	void displayCart()
	{
		if(cart_array.size()==0)
			System.out.println("Cart Empty");
		else
		{
			int x=1;
			for(int i:cart_array.keySet())
			{
				System.out.println(x+"\t\t"+cart_array.get(i).Item_name+"\t"+ cart_array.get(i).Item_price);
				x++;
			}
		}

	}
	void addtoCart(int course,String dish_name)
	{
		Menu m=new Menu();
		int curr_price=0;
		switch(course)
		{
		case 1:
		{
			if(m.breakfast_menu.containsKey(dish_name))
			{
				curr_price=m.breakfast_menu.get(dish_name);
			}
			else
				System.out.println("Item does not exist");
			break;
		}
		case 2:
		{
			if(m.lunch_menu.containsKey(dish_name))
				curr_price=m.lunch_menu.get(dish_name);
			else
				System.out.println("Item does not exist");
			break;

		}
		case 3:
		{
			if(m.dinner_menu.containsKey(dish_name))
				curr_price=m.dinner_menu.get(dish_name);
			else
				System.out.println("Item does not exist");
			break;
		}
		}
		if(curr_price!=0)
		{
			Order_Item item=new Order_Item(dish_name,curr_price);
			cart_array.put(cart_array.size()+1,item);
			System.out.println("Item added to cart");
		}
	}
	void calculate_total()
	{
		total=0;
		for(int i:cart_array.keySet())
		{
			total=total+cart_array.get(i).Item_price;
		}
	}
	void removefromCart(String dish_name)
	{
		for(int i:cart_array.keySet())
		{
			if(cart_array.get(i).Item_name.equals(dish_name))
			{
				cart_array.remove(i);
				System.out.println("Item Removed");
				break;
			}
		}
	}
}
