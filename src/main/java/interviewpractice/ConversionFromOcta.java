package interviewpractice;

import java.util.Scanner;

public class ConversionFromOcta {

	public void octaToOthers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Octa:");

		String octa = sc.nextLine();
		int dec = Integer.parseInt(octa, 8);
		System.out.println("Decimal: " + dec);
		System.out.println("Binary: " + Integer.toBinaryString(dec));
		System.out.println("Hexa: " + Integer.toHexString(dec));
	}

	public static void main(String[] args) {
		ConversionFromOcta obj = new ConversionFromOcta();
		obj.octaToOthers();
	}
}

//Enter Octa:12
//Decimal: 10
//Binary: 1010
//Hexa: a
