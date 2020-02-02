package cottrell_p2;
import java.util.Scanner;

public class BMICalculator {
	private static final String String = null;

	public static void main(String[] args) {
	   BMICalculator app = new BMICalculator();
	   app.readUserData();
	   app.calculateBmi();
	   app.displayBmi();
	}

	public void readUserData() {
		//will make use of readUnitType and readUserData
		
		//will return the print statement there, asking what system to use
		readUnitType();
		//will read next prompt based on system choice
		readMeasurementData();
		
		}
	
	
	private void readUnitType() {
	
		
		Scanner in = new Scanner(System.in);
		System.out.print("Would you like to use the Metric System (meters and kilograms) or the Imperial System (inches and pounds)?\r\n"
				+ "Please enter 1 for Metric and 2 for Imperial: ");
		int unitType = in.nextInt();
		readMeasurementData();
	
		
	}
	
	private static void readMeasurementData() {
		//will be used in readUserData
		
	
		//will either call readMetricData or readImperialData
		Scanner in = new Scanner(System.in);
		int unitType = in.nextInt();
		
		if(unitType == 1) 
			readMetricData();
			

		if(unitType == 2) 
			readImperialData();
			
		
		else 
			System.out.print("Please select either 1 for metric or 2 for imperical: ");
			
				
		in.close();
	}

	private static void readMetricData() {
		Scanner metric = new Scanner(System.in);
		
		System.out.print("Please enter weight in kilograms: ");
		int weight = metric.nextInt();
		
		System.out.print("Please enter height in meters: ");
		int height = metric.nextInt();
		
		metric.close();
	}
	
	private static void readImperialData() {
		//would these go under the separate get height and get weight? (or set whichever it should be)
		
		Scanner imperial = new Scanner(System.in);
		System.out.print("Please enter weight in pounds: ");
		int weight = imperial.nextInt();
		System.out.print("Please enter height in inches: ");
		int height = imperial.nextInt();
		int Bmi = ((763 * weight) / (height * height)); 
		displayBmi();
		
		
		
		imperial.close();
		
	}
	
	public static int calculateBmi() {
		//calculates the user's BMI and BMI category
		int weight = getWeight();
		int height ;
		int Bmi = weight / (height * height);
		
		
		//formula for metric:
		//return weight / (height * height);
		
		
		//formula for imperial:
		//Bmi = (703 * double weight) / (height * height);
		return Bmi;
	}
	
	private static int calculateBmiCategory() {
		//determines the user's BMI category
		 int Bmi = calculateBmi();
		 if (Bmi < 18.5)
			System.out.print("Underweight");
		 	
		 else if (Bmi >= 18.5 && Bmi <= 24.9)
		 	System.out.print("Normal Weight");
		 	
		 else if (Bmi >= 25 && Bmi <= 29.9)
		 	System.out.print("Overweight");
		 	
		 else if (Bmi > 30)
		 	System.out.print("Obese");
		 	
		 
	return calculateBmiCategory();
		
	}
	
	public static String displayBmi() { 
		//will print BMI value and category
		int calculateBmi = getBmi();
		String calculateBmiCategory = getBmiCategory();;
		System.out.println("BMI: " + calculateBmi);
		System.out.print("BMI Category: " + calculateBmiCategory);
		
		return String;
	}
	
	public static int getWeight() {
		int weight = setWeight();
		return weight; 
	}
	
	private static int setWeight() {
		return 0;
	   // this.weight = weight;
	}
	
	public void getHeight() {
		//return height;
	}
	
	private void setHeight() {
		//this.height = height;
	}
	
	public static int getBmi() {
		int Bmi = calculateBmi();
		return Bmi;
	}
	
	public static int getBmiCategory() {
		int bmiCategory = calculateBmiCategory();;
		return bmiCategory;
	}
}

