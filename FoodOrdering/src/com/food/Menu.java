package com.food;

import java.util.HashMap;

public class Menu
{
	HashMap<String,Integer> breakfast_menu=new HashMap<String,Integer>();
	HashMap<String,Integer> lunch_menu=new HashMap<String,Integer>();
	HashMap<String,Integer> dinner_menu=new HashMap<String,Integer>();
	
	Menu() 
	{
		breakfast_menu.put("Idli",50);
		breakfast_menu.put("Dosa",100);
		breakfast_menu.put("Pongal",70);

		lunch_menu.put("South Indian Thali", 240);
		lunch_menu.put("North Indian Thali", 240);
		lunch_menu.put("Mini Lunch", 120);

		dinner_menu.put("Naan", 50);
		dinner_menu.put("Paneer Masala", 180);
		dinner_menu.put("Kulcha", 50);
	
	}
		
}
