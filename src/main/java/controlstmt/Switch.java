package controlstmt;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any no 1 to 5, and then press enter and 'q'");
		int i = -1;
		while (s.hasNextInt()) {
			i = s.nextInt();
		}

		switch (i) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Invalid input");
		}

	}
}