import java.util.Scanner;

public class BrownieFestival {
		
	public static void main(String[] args) {
		InputValidation inputs = new InputValidation();
		Scanner re = new Scanner(System.in);
		boolean go = true;
		
		System.out.println("Welcome to the annual Planetary Brownie Festival! The departure planet is Earth. Let's get started.\n"
				+ "Find out how many brownies you can eat in total on today's trip by entering your height and weight in the following format. \n");
		inputs.getInputs();
		
		while(go) {
			System.out.println("Would you like to check another guest? [yes or no]");
			String loop = re.next().toLowerCase();
			if(loop.matches("yes"))
				inputs.getInputs();	
			else if(!loop.matches("yes") && !loop.matches("no")) {
				System.out.println("I'll take that as a 'no'... (o_0)");
				go = false;
			}	
			else
				go = false;
		}
	}
}//end class
