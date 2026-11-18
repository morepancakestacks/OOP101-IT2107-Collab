import java.util.Scanner;
public class Canteen {

	public static void main (String[] args) {
		try (Scanner tung = new Scanner(System.in)){

			double price = 0;
			String finished, yn;

			do{
			System.out.println("Welcome to Anjo Nala's Karinderya!");
			System.out.println("Here is our menu for today");
			System.out.println("1. Kalderetang Kambing   - Php 155.00");
			System.out.println("2. Adobong Manok   - Php 115.00");
			System.out.println("3. Chopsuey   - Php 100.00");
			System.out.println("4. Afritada   - Php 120.00");
			System.out.println("5. Bulanglang   - Php 90.00");

			System.out.print("Which number will you order today?: ");
			int order = tung.nextInt();

			System.out.print("How many will you order?: ");
			int quan = tung.nextInt();

				switch(order){
				case 1:
					price += 155.00*quan;
					System.out.println("You added Kalderetang Kambing");
					break;
				case 2:
					price += 115.00*quan;
					System.out.println("You added Adobong Manok");
					break;
				case 3:
					price += 100.00*quan;
					System.out.println("You added Chopsuey");
					break;
				case 4:
					price += 120.00*quan;
					System.out.println("You added Afritada");
					break;
				case 5:
					price += 90.00*quan;
					System.out.println("You added Bulanglang");
					break;
				default:
					System.out.println("Wrong choice :d.");
					break;
				}

				while (true) {
    				System.out.print("Are you finished ordering? Yes or No: ");
						finished = tung.next();
    				if (finished.equalsIgnoreCase("yes") || finished.equalsIgnoreCase("y")) {
        				yn = "yes";
        				break;
    				} else if (finished.equalsIgnoreCase("no") || finished.equalsIgnoreCase("n")) {
        				yn = "no";
        				break;
    				} else {
        				System.out.println("Invalid answer. Please type yes or no :d.");
    		}
	}
			} while (!finished.equalsIgnoreCase("Yes")
			&& !finished.equalsIgnoreCase("yes") 
			&& !finished.equalsIgnoreCase("y")
			&& !finished.equalsIgnoreCase("Y"));
		

	String isStudent = "";

	while (true) {
    	System.out.print("Are you a student? (yes/no): ");
    	String ans = tung.next();

    	if (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")) {
        	isStudent = "yes";
        	break;
    	} else if (ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("n")) {
        	isStudent = "no";
        	break;
    	} else {
        	System.out.println("Invalid answer. Please type yes or no :d.");
    	}
	}

	double discountRate = 0.0;


	if (price >= 500) {
    	discountRate = 0.15;
	} else if (isStudent.equalsIgnoreCase("yes")) {
    	discountRate = 0.10;
	} else {
    	discountRate = 0.0; 
	}

	double discountAmount = price * discountRate;
	double finalTotal = price - discountAmount;

	System.out.printf("%nYour total is: Php %.2f%n", price);

	if (discountRate > 0) {
    	System.out.printf("Discount applied: %.0f%% (-Php %.2f)%n",
            discountRate * 100, discountAmount);
    	System.out.printf("Final total: Php %.2f%n", finalTotal);
	} else {
    	System.out.println("No discount applied.");
    	System.out.printf("Final total: Php %.2f%n", finalTotal);
	}
		}
	}
}