
public class BrownieCounter {
	private static double brownies = 0;
		
	public void sumBrownies(double bmi) {
		if(bmi < 18.5) {
			brownies += 2;
		}
		if(bmi >= 18.5 && bmi <= 24.9) {
			brownies += 1;
		}
		if(bmi > 24.9 && bmi <= 29.9) {
			brownies += 0.5;
		}
		if(bmi > 29.9) {
			brownies += 0;
		}
	}
	
	//Getters Setters
	public static double getBrownies() {
		return brownies;
	}

	public static void setBrownies(double brownies) {
		BrownieCounter.brownies = brownies;
	}

}
