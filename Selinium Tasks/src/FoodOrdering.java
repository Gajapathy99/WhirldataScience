import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		System.out.println(" Enter 1 for Juice \n Enter 2 for Starter \n Enter 3 for Dinner \n Enter 4 for Lunch");
		int choice=sc.nextInt();
		if(choice==1) {
				System.out.println(" 1.Sweetlime \t 2.Lemon \t 3.Watermelon");
				int juice=sc.nextInt();
				switch(juice) {
					case 1: {
						System.out.println("\n S.No\t\tProduct\t\t\t\tPrice\t\t\tGST\t\t\tAmount Payable");
						System.out.println(" 1\t\tSweetlime\t\t\t\t70\t\t\t18%\t\t\t82.60");
					}
					break;
					case 2: {
						System.out.println("\n S.No\t\tProduct\t\t\t\tPrice\t\t\tGST\t\t\tAmount Payable");
						System.out.println(" 1\t\tLemon\t\t\t\t70\t\t\t18%\t\t\t82.60");
					}
					break;
					case 3: {
						System.out.println("\n S.No\t\tProduct\t\t\t\tPrice\t\t\tGST\t\t\tAmount Payable");
						System.out.println(" 1\t\tWatermelon\t\t\t\t70\t\t\t18%\t\t\t82.60");
					}
					break;
					default: System.out.println("Invalid Choice");
				}
			}
		else if(choice==2) {
			System.out.println(" 1.Paneer Tikka \t 2.Babycorn Fritters \t 3.Mushroom Tikka");
			int juice=sc.nextInt();
			switch(juice) {
				case 1: {
					System.out.println("\n S.No\t\tProduct\t\t\t\tPrice\t\t\tGST\t\t\tAmount Payable");
					System.out.println(" 1\t\tPaneer Tikka\t\t150\t\t\t18%\t\t\t177");
				}
				break;
				case 2: {
					System.out.println("\n S.No\t\tProduct\t\t\t\tPrice\t\t\tGST\t\t\tAmount Payable");
					System.out.println(" 1\t\tBabycorn Fritters\t\t150\t\t\t18%\t\t\t177");
				}
				break;
				case 3: {
					System.out.println("\n S.No\t\tProduct\t\t\t\tPrice\t\t\tGST\t\t\tAmount Payable");
					System.out.println(" 1\t\tMushroom Tikka\t\t150\t\t\t18%\t\t\t177");
				}
				break;
				default: System.out.println("Invalid Choice");
			}
		}
		else if(choice==3) {
			System.out.println(" 1.Idly \t 2.Dosa \t 3.Poori");
			int juice=sc.nextInt();
			switch(juice) {
				case 1: {
					System.out.println("\n S.No\t\tProduct\t\t\t\tPrice\t\t\tGST\t\t\tAmount Payable");
					System.out.println(" 1\t\tIdly\t\t\t\t50\t\t\t18%\t\t\t58.5");
				}
				break;
				case 2: {
					System.out.println("\n S.No\t\tProduct\t\t\t\tPrice\t\t\tGST\t\t\tAmount Payable");
					System.out.println(" 1\t\tDosa\t\t\t\t100\t\t\t18%\t\t\t118");
				}
				break;
				case 3: {
					System.out.println("\n S.No\t\tProduct\t\t\t\tPrice\t\t\tGST\t\t\tAmount Payable");
					System.out.println(" 1\t\tPoori\t\t\t\t100\t\t\t18%\t\t\t118");
				}
				break;
				default: System.out.println("Invalid Choice");
			}
		}
		else if(choice==4) {
			System.out.println(" 1.South Indian Thali \t 2.North Indian Thali \t 3.Mini Lunch");
			int juice=sc.nextInt();
			switch(juice) {
				case 1: {
					System.out.println("\n S.No\t\tProduct\t\t\t\tPrice\t\t\tGST\t\t\tAmount Payable");
					System.out.println(" 1\t\tSouth Indian Thali\t150\t\t\t18%\t\t\t177");
				}
				break;
				case 2: {
					System.out.println("\n S.No\t\tProduct\t\t\t\tPrice\t\t\tGST\t\t\tAmount Payable");
					System.out.println(" 1\t\tNorth Indian Thali\t150\t\t\t18%\t\t\t177");
				}
				break;
				case 3: {
					System.out.println("\n S.No\t\tProduct\t\t\t\tPrice\t\t\tGST\t\t\tAmount Payable");
					System.out.println(" 1\t\tMini Lunch\t\t\t100\t\t\t18%\t\t\t118");
				}
				break;
				default: System.out.println("Invalid Choice");
			}
		}
		else
			System.out.println("Invalid Choice");
	}
}
