

import java.util.Scanner;

public class meal_reciept {

	public static void main(String[] args) {

		/**
		 * 
		 * 
		 * @auther Sam Bauer
		 * 
		 */

			Scanner bread = new Scanner (System.in);
			System.out.print("Please enter you're name: ");
			String Name;
			Name = bread.nextLine();
			
			System.out.println("\n\nHello, " + Name + ", welcome to Meal Reciept!");
			System.out.println("Press enter to continue..");
			bread.nextLine();
			
			System.out.println("\nPlease enter the name of you're apppetizer:		");
			String appName = bread.nextLine();
		
			System.out.println("\nPlease ennter the price of you're appetizer:		");
			String appSTR = bread.nextLine();
			
			double appPrice = Double.parseDouble (appSTR);
			
			System.out.println("\nPlease enter the name the name of you're entree:		");
			String entName = bread.nextLine();
			
			System.out.println("\nPlease enter the price of you're entree:		");
			String entSTR = bread.nextLine();
			
			double entPrice = Double.parseDouble (entSTR);
			
			System.out.println("\nPlease enter the name of you're dessert:		");
			String desName = bread.nextLine();
			
			System.out.println("\nPlease enter the price of you're dessert:		");
			String desSTR = bread.nextLine();
		
			double desPrice = Double.parseDouble (desSTR);
		
			System.out.println("\nWhat percentage would you like to tip (as decimal):     ");
			
			String tipSTR = bread.nextLine();
			
			double tipPerc = Double.parseDouble (tipSTR);
			
			System.out.println("\n\n   " + appName + ": $" + appPrice);
			
			System.out.println("\n   " + entName + ": $" + entPrice);
			
			System.out.println("\n   " + desName + ": $" + desPrice);
			
			double subTot = ( appPrice + entPrice + desPrice );
			
			System.out.println("\n   " + "Subtotal: $" + subTot);
			
			double tax = ( subTot * 0.06 ); 
			
			System.out.println("\n   " + "Tax: $" +  tax );
			
			double tip = ( subTot * tipPerc );
			
			System.out.println("\n   " + "Tip given: $" + tip );
			
			double total = ( tip + tax + subTot );
			
			System.out.println("\n   " + "Total: $" + total);
			
			System.out.println("\n END");
			
			
			
			
			
			
			
					
	}

}
