import java.util.Scanner;

public class InputValidation {
	CelestialConversionRate conversion = new CelestialConversionRate();
	
	public void getInputs() {
		Scanner sc = new Scanner(System.in);

		System.out.println("For Metric Scale: 'height(cm);weight(kg);m' [or] Imperial Scale: 'height(in);weight(lbs);s'\n"
				+ "Please enter your measurements: ");
		String guestMeasurement = sc.next();
		formatValidation(guestMeasurement);	
	}
	
	
	public void formatValidation(String input) {
		if(input.matches("(\\d{1,3}+);(\\d{1,3}+);(m|s)")) {
			String[] part = input.split(";");
			double height = Double.parseDouble(part[0]);
			double weight = Double.parseDouble(part[1]);
			String scale = input.substring(input.length() - 1);
			
			conversion.conversionRate(weight, height, scale);
		}
		else {
			System.out.println("Incorrect format.");
			getInputs();
		}
	}
}//end class
