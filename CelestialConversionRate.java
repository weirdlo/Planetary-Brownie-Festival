
public class CelestialConversionRate {
	BMIcalculation calcBMI = new BMIcalculation();
	BrownieCounter brownies = new BrownieCounter();
	private static final String planets[] = {"Earth","Mercury","Venus","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto","Moon","Sun"};
	private static final double gravities[] = {9.81, 3.78, 9.07, 3.71, 23.6, 9.16, 8.89, 11.2, 0.59, 1.66, 279.4};
	private double rate = 0;
		
	public void conversionRate(double weight, double height, String scale) {
		for(int i = 0; i < gravities.length; i++) {
			rate = (gravities[i] / gravities[0]) * weight;
			
			if(scale.matches("m"))
				calcBMI.metricBMI(rate, height);
			
			if(scale.matches("s"))
				calcBMI.imperialBMI(rate, height);
		}
		
		double totalBrownies = brownies.getBrownies();
		System.out.println("Total brownies: "+totalBrownies+"\n");
		brownies.setBrownies(0);
	}
}//end class
