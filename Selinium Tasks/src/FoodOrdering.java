import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class FoodOrdering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("\nEnter 1 for Starters"+" "+"2 for Breakfast"+" "+"3 for Lunch"+" "+"4 for Dinner");
		String y=sc.next();
		int course= sc.nextInt();
		while(y==y) {
			switch(course) {
			case 1: starters();
			break;
			case 2: breakfast();
			break;
			case 3: lunch();
			break;
			case 4: dinner();
			break;
			default:System.out.println("\n Invalid choice");
			}
		}
		
	}
	
	public static void starters() {
		Scanner s1=new Scanner(System.in);
		TreeMap<String,Integer> starters = new TreeMap<String, Integer>(); 
		// Mapping string values to int keys 
		starters.put("Paneer Tikka", 150); 
		starters.put("Babycorn fritters", 150  );
		starters.put("Mushroom Tikka", 200  ); 
		
		// Displaying the TreeMap 
		System.out.println("\n Starters Menu: ");
		Iterator<String> itr = starters.keySet().iterator();
        while (itr.hasNext()) {
        System.out.println("\t"+itr.next());
        }	
	    
	} 
	public static void breakfast() {
		TreeMap<String,Integer> breakfast = new TreeMap<String, Integer>(); 
		// Mapping string values to int keys 
		breakfast.put("Idly", 50); 
		breakfast.put("Dosa", 100  );
		breakfast.put("Pongal", 100  ); 
		
		// Displaying the TreeMap 
		System.out.println("\n Breakfast Menu: ");
		Iterator<String> itr = breakfast.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println("\t"+itr.next());
        	}
        }
	public static void lunch() {
		TreeMap<String,Integer> lunch = new TreeMap<String, Integer>(); 
		// Mapping string values to int keys 
		lunch.put("South Indian Thali ", 240); 
		lunch.put("North Indian Thali", 240  );
		lunch.put("Mini Lunch", 180  ); 
		
		// Displaying the TreeMap 
		System.out.println("\n Lunch Menu: ");
		Iterator<String> itr = lunch.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println("\t"+itr.next());
        }
		}
	public static void dinner() {
		TreeMap<String,Integer> dinner = new TreeMap<String, Integer>(); 
		// Mapping string values to int keys 
		dinner.put("Naan", 50); 
		dinner.put("Paneer Butter Masala", 170  );
		dinner.put("kulcha", 50  ); 
		
		// Displaying the TreeMap 
		System.out.println("\n Dinner Menu: ");
		Iterator<String> itr = dinner.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println("\t"+itr.next());
        	}
        }
	/*public static String startersChoice() {
			
			ArrayList<String> list = new ArrayList<String>();
			list.add("Paneer Tikka");
			list.add("Mushroom Tikka");
		
		return list[0];
	}*/
		
	}

