package cottrell_p1;

import java.util.Scanner;

/* write program that will encrypt
 * application should:
 * 	read a 4 digit int entered by user and encrypt as:
 * 	-	replace each digit with the result of adding 7 to the digit 
 * 		and getting the remainder after dividing the new the new 
 * 		value by 10
 * 	- 	swap first and third digits and swap second and fourth digits
 *  - 	print encrypted int
 *  - 	also allow user to enter encrypted 4 digit int and then decrypt it to form
 *  	original number (by reversing encryption)

*/

public class application {

	public static void main(String[] args) {
	
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the first number to be encrypted: ");
			int userValue1 = in.nextInt();
			
			System.out.print("Enter the second number to be encrypted: ");
			int userValue2 = in.nextInt();
			
			System.out.print("Enter the third number to be encrypted: ");
			int userValue3 = in.nextInt();
			
			System.out.print("Enter the fourth number to be encrypted: ");
			int userValue4 = in.nextInt();
			in.close();
			
		//	encryptedValues(userValue1);

	}

	private static int encryptedValues(int userValue) {
		
		int userValue1 = userValue;
		int encryptedValue;
			
		
		Scanner in = new Scanner(System.in);
	//	int userValue1[] = encryptedValue;
	
		encryptedValue = (userValue1 + 7) % 10; 
	
		System.out.printf("Encrypted Value: " + encryptedValue);
		
		
		return encryptedValue;
	}
}

