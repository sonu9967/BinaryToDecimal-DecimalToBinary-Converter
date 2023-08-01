/*
 * A simple program that converts binary to decimal and vice versa
 * Please see other comments on project for more information about program
 */
import java.util.Scanner;

public class MainSrc {

	public static void main(String[] args) {

		System.out.println("Binary-Decimal Converter by IasJem\n");
		// Convert Decimal to Binary using Repeated Division-by-2 method :
		// https://www.electronics-tutorials.ws/binary/bin_2.html
		convertDecimal convertDecimal = new convertDecimal();
		int getDecimal;  Scanner decimal = new Scanner(System.in);
		System.out.println("Enter Decimal number:");
		getDecimal = decimal.nextInt();

		convertDecimal.showBinary(getDecimal);
		convertDecimal.reverseBin(convertDecimal.getStr());

		System.out.print("\n");
		
		// Convert Binary to Decimal using the Doubling method:
		// https://www.wikihow.com/Convert-from-Binary-to-Decimal
		convertBinary convertBinary = new convertBinary();
		String getBinary;  Scanner binary = new Scanner(System.in);
		System.out.println("Enter Binary number: ");
		getBinary = binary.nextLine();
		convertBinary.showDecimal(getBinary);

		decimal.close();
		binary.close();
	}

}
