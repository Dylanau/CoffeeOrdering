import java.util.Scanner;

public class CoffeeTeaMenu {
	//all the variables needed to get the types of coffee or tea needed
	public String [] CoffeeTea = {"Coffee", "Tea"};
	public static double [] priceCoffee = {6.00, 4.50};
	public static String [] teatype = {"Green", "Black" };
	public static String [] Greentype = {"Matcha", "Sentcha", "Chamomile", "Earl Grey"};
	public static String [] Blacktype = {"Assam", "Keemun", "Wuyi"};
	public static String [] Coffee = {"Caffine","Decaf"};
	public static String [] Condiments = {"Milk", "Sugar", "Biscuit", "Lemon", "Half & Half", "Half Lemonade"};
	public static double [] CondimentsPrice = {1.0, 0.50, 2.50, 1.25, 1.0, 1.50};
	public double price;
	public static int i;
	public static int j;
	public static int k;
	
	public static String coffeeMenu(Scanner s){
		//uses scanner to get the type of coffee they wan then using for loops to get their value from arrays
	String order = null;
		System.out.println("Would you like Caffine Coffee or Decaf?");
		String choice = s.next();
		CoffeeOrdering.storeOrder(choice);
		for(i = 0; i < Coffee.length -1; i++ ){
			if(Coffee[i].equals(choice)){
				 order = Coffee[i];
			}
		}
		return order;
		
	}
	public static void TeaMenu(Scanner s){
		//this method uses a scanner to go through the tea type
		String order1 = null;
		System.out.println("Do you want Green or Black tea?");
		String choice1 = s.next();
		CoffeeOrdering.storeOrder(choice1);
		for(j = 0; j < teatype.length ; j++ ){
			if(teatype[i].equals(choice1)){
				 order1 = teatype[i];
			}
				 if(order1.equals("Green")){
					 System.out.println("What kind of Green Tea?");
					 String choice2 = s.next();
					 CoffeeOrdering.storeOrder(choice2);
					 for(j = 0; j < Greentype.length -1; j++ ){
							if(Greentype[i].equals(choice2)){
								 order1 = order1 + " " + Greentype[i];
							}
					 }
				 }else{
					 System.out.println("What kind of Green Tea?");
					 String choice3 = s.next();
					 CoffeeOrdering.storeOrder(choice3);
					 for(j = 0; j < Blacktype.length -1; j++ ){
							if(Blacktype[i].equals(choice3)){
								 order1 = order1 + " " + Blacktype[i];
							}
					 }
				 }
			}
		
		
	}
	//gets the user condiemts with the import of a scanner no return
	public static void CondimentsMenu(Scanner s){
		String order2 = null;
		System.out.println("What Condiments would you like?");
		String choice4 = s.next();
		CoffeeOrdering.storeOrder(choice4);
		 for(k = 0; k < Condiments.length -1; k++ ){
				if(Condiments[k].equals(choice4)){
					 order2 = order2 + " " + Condiments[k];
					 CoffeeOrdering.storeOrder(order2);
				}
		 }
	}
	public static double condimentsPrice(){
		//use this method to return the value in the array
		double price = CondimentsPrice[k];
		return price;
	}
	
	

	//methods for different types of tea and coffee?
}
