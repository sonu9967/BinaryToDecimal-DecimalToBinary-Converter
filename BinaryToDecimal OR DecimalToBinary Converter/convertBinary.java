
public class convertBinary {

	private final int BINARY_BASE = 2;

	public void showDecimal(String getBinary) {
		int n = 0, showDecimal = 0, y;
		char[] bin = getBinary.toCharArray();
		// convert string to char array for evaluation purposes for each bits
		boolean binaryOrNot = true;
		for (int i = 0; i < bin.length; i++) {
			y = (int) bin[i] - '0'; // Thanks to khelwood from StackOverflow
			// https://stackoverflow.com/questions/46343616/how-can-i-convert-a-char-to-int-in-java
			if (y != 1 && y != 0) { // check each bit if they are 1 or 0 or neither
				binaryOrNot = false;
			} else {
				showDecimal = n * BINARY_BASE + y; 
				System.out.println(n + " x " + BINARY_BASE + " + " + y + " = " + showDecimal);
				n = showDecimal;
			}
		}
		if (binaryOrNot == true) {
			System.out.println("BASE 10 (Decimal) : " + showDecimal);
		} else {
			System.out.println("Number you entered is not a Binary number. Please try agaib. ");
		}
	}

}
