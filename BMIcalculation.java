
public class BMIcalculation {
	BrownieCounter counter = new BrownieCounter();
	private static double bmi = 0;
	
	public void metricBMI(double kg, double cm) {
		bmi = (double) Math.round(((kg / cm / cm) * 10000) * 100) / 100;
		counter.sumBrownies(bmi);
	}
	
	public void imperialBMI(double lb, double in) {
		bmi = (double) Math.round(((lb / (in * in)) * 703) * 100) / 100 ;
		counter.sumBrownies(bmi);
	}
	
	//Getters and Setters
	public static double getBmi() {
		return bmi;
	}

	public static void setBmi(double bmi) {
		BMIcalculation.bmi = bmi;
	}	
}//end class
