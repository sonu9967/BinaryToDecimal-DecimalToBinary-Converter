
public class convertDecimal {

	private String str = "";

	
	public convertDecimal() {

	}

	public convertDecimal(String str) {
		this.str = str;
	}

	public void showBinary(int getDecimal) {
		int convertDecToBin;
		while (getDecimal > 0) { // while decimal divided by 2 is not 0
			convertDecToBin = getDecimal % 2;
			this.str = this.str + "" + convertDecToBin; 
			// put output to String
			System.out.println(getDecimal + " => " + convertDecToBin);
			getDecimal /= 2;
		}

	}

	public void reverseBin(String str) { // reverse output from MSB to LSB
		StringBuilder reverse = new StringBuilder(str);
		System.out.println("BASE 2 (Binary) : " + reverse.reverse().toString());
	}

	public String getStr() {
		return str;
	}

}
