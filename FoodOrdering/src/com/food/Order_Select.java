package com.food;

import java.util.HashMap;
import java.util.Scanner;

public class Order_Select 
{
	public static void main(String[] args) 
	{
		int course_ch,d_ch=0;
		String dish_name=new String();
		Menu m=new Menu();
		Cart c=new Cart();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Choice\n1.Breakfast \t 2.Lunch \t 3.Dinner");
		course_ch=s.nextInt();
		s.nextLine();
		do
		{
			if(d_ch==2)
			{
				String rdish=new String();
				System.out.println("Enter dish name");
				rdish=s.nextLine();
				c.removefromCart(rdish);
			}
			else if(d_ch==3)
			{
				c.displayCart();
			}
			else
			{
				switch(course_ch)
				{
				case 1:
				{
					System.out.println("BreakFast Menu");
					System.out.println(m.breakfast_menu.keySet());
					System.out.println("Enter dish name");
					dish_name=s.nextLine();

					c.addtoCart(course_ch,dish_name);
					break;
				}
				case 2:
				{
					System.out.println("Lunch Menu");
					System.out.println(m.lunch_menu.keySet());
					System.out.println("Enter dish name");
					dish_name=s.nextLine();

					c.addtoCart(course_ch,dish_name);
					break;
				}
				case 3:
				{
					System.out.println("Dinner Menu");
					System.out.println(m.dinner_menu.keySet());
					System.out.println("Enter dish name");
					dish_name=s.nextLine();

					c.addtoCart(course_ch,dish_name);
					break;
				}
				}
			}
			System.out.println("1.Add another dish\t2.Remove Dish\t3.Display cart\t4.Stop Adding dishes");
			d_ch=s.nextInt();
			s.nextLine();
		}while(d_ch!=4);
		
		System.out.println("Generating Bill\n\n\n");
		c.calculate_total();

		System.out.println("SL. No. \tOrder \tPrice");
		c.displayCart();
		System.out.println("GST 18%");
		System.out.println("\t\t\tTotal: "+c.total);
		System.out.println();
	}

}
