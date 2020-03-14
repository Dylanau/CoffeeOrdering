import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
class CoffeeOrdering {
	//contructor for file
	private double hour;
	private double minute;
	private double time;
	//this constructor method for setting up the time
	public CoffeeOrdering(double m, double h ){
		hour = h;
		minute = m; 
		//solves for time
		time = hour + (minute/60); 
		
	}
	
	//this metrhod has no return but prints every string to the file
	public static void storeOrder(String s) {
		//stores their order each day in a file
		PrintWriter output = null;
		try{
			//try catch loop for expception
		output = new PrintWriter(new FileOutputStream("coffee.txt"), true);
		output.print(s + " ");
	
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	//this methpd uses the time constructor and suggests what kind of coffee or tea they should get
	public void timeSuggestions(CoffeeOrdering anotherTime){
		//uses if else statements to go  through the time zones
		String suggest;
		if(anotherTime.time < 6){
			suggest = "you should get a type of expresso!";
		}else if(anotherTime.time > 6 && anotherTime.time < 12){
			suggest = "You should get a type of latte or black tea!";
		}else{
			suggest = "You should get a type of green tea!";
		}
		//prints suggestion
		System.out.print(suggest);
	}

	//this method checks whether the order is a pick up or not and picks a random integer to tell them how long it will take. Void method
	public static void toPickupOrNah(String pick){
		if(pick.equals("pickup")){
			int rand = (int) (Math.random() + 45) * 20; //use the int cast with the math,random
			System.out.println("Your order will take about " + rand + " minutes to prepare");
		}else{
			
		}
	}
	//this method uses time again to tell them if the store is opened or closed
	public void storeTime(CoffeeOrdering anotherTime){
		if(anotherTime.time > 18){
			System.out.println("Sorry we are closed right now, we open at 5am tomorrow.");
			System.exit(0);
		}else if(anotherTime.time < 5){
			System.out.println("Sorry we are closed right now, we oen at 5am tomorrow");
			System.exit(0);
		}else{
			
		}
	}
	
}
