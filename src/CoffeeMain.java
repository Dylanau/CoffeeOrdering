import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class CoffeeMain {
//this methiod goes through each method using a while loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner import
		Scanner scan = new Scanner(System.in);
		//welcomes user
		System.out.println("Welcome to the Coffee Ordering Program! Enter any number to start.");
		//while loop for program
		while(scan.hasNext()){
			//tells user to enter the time
		System.out.println("What time is it right now? For example if it's 6:30 type 6 30");
		//gets the time
		double hour = scan.nextDouble();
		double minute = scan.nextDouble();
		//date next
		System.out.println("Now please enter todays date. In the format mm dd");
		String month = scan.next();
		String day = scan.next();
		//copys the day to the file
		CoffeeOrdering.storeOrder(month + "/" + day);
		//contrusts the time and uses it to see if store is open or not
		CoffeeOrdering time = new CoffeeOrdering(hour, minute); //USE THIS
		time.storeTime(time);
		//method for pickup or in person
		System.out.println("Is this a Pickup Order or in Person Order. Options are 'Pickup' or 'Person'");
		String Pickup = scan.next();
		CoffeeOrdering.toPickupOrNah(Pickup);
		time.timeSuggestions(time);
		System.out.println();
		//prints menu
		printMenu();
		System.out.println("Ok, what would you like to order? Coffee or Tea?");
		//coffee or tea options
		String choice = scan.next();
		CoffeeOrdering.storeOrder( choice);
		double price;
		//uses other classes method to find the coffee and tea they want
		if(choice.equals("Coffee")){
			 price = 6;
			CoffeeTeaMenu.coffeeMenu(scan);
			
		}else{
			 price = 4;
			CoffeeTeaMenu.TeaMenu(scan);
		}
		String next;
		do{
			//prints out the price
		CoffeeTeaMenu.CondimentsMenu(scan);
		System.out.println("The total price is " + (price + CoffeeTeaMenu.condimentsPrice()));
		//asks if they want more
		System.out.println("Any more Condiments?");
		 next = scan.next();
		}while(next.equals("Yes"));
		
		System.out.println("Would you like to order again? Yes or No");
		String next1 = scan.next();
		if(next1.equals("Yes")){
		continue;
		}else{
			System.out.println("Thank you for your time");
			try{
				PrintWriter output = new PrintWriter(new FileOutputStream("coffee.txt"), true);
				output.println();
				output.close();
				}catch(FileNotFoundException e){
					e.printStackTrace();
				}
			break;
		}
		
		}
		
	}
	//this menu prints out the menu
	public static void printMenu(){
		System.out.println("Here is our Menu");
		System.out.println("Coffee || Tea");
		System.out.println("Decaf || Caffiene");
		System.out.println("Green Tea || Black Tea");
		System.out.print("Green Tea: ");
		System.out.println("Matcha || Sentcha || Chamomile || Earl Grey");
		System.out.print("Black Tea: ");
		System.out.println("Assam || Keemun || Wuyi");
		System.out.println("All tea is 4 dollars and coffee is 6 dollars.");
		System.out.println("All drinks are set to 16oz");
		System.out.println("Sugar: $0.50 || Half & Half: $1.00 || Half Lemonade: $1.50 || Biscuit: $2.50 || Lemon: $1.25 || Milk: $1.00");
		
	}
}
