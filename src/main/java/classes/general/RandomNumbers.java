package classes.general;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumbers {

	//Here we pass max digits
	public void getRandomNumberRange1(int digits) {
		String rdStr = RandomStringUtils.randomNumeric(digits);
		int rdNum = Integer.parseInt(rdStr);
		System.out.println("Range between 0 to digits: " + rdNum);
		System.out.println("Length: " + rdStr.length());
	}

	//Here we pass max number
	public void getRandomNumberRange2(int number) {
		Random random = new Random();
		System.out.println("Range between 0 to number : "
				+ random.nextInt(number));
	}

	//Here we pass max number, %4d make it 4 digits number
	public void getRandomNumberRange3(int range) {
		Random random = new Random();
		String randomNumber = String.format("%04d", random.nextInt(range));

		if (randomNumber.charAt(0) == '0') {
			randomNumber = randomNumber.replace(randomNumber.charAt(0), '1');
		}

		System.out.println("Fix digit number: " + randomNumber);
		System.out.println("Length: " + randomNumber.length());
	}

	//max 10 digit allowed
	public void getRandomNumberWithFixLength(int number) {
		if(number > 10){
			throw new UnsupportedOperationException("Digits more than 10 is not supported by this method");
		}
		
		String randNos = String
				.valueOf(number < 1 ? 0 : new Random()
						.nextInt((9 * (int) Math.pow(10, number - 1)) - 1)
						+ (int) Math.pow(10, number - 1));

		int randNo = Integer.parseInt(randNos);
		System.out.println("Fix length random number: " + randNo);
		System.out.println("Length: " + randNos.length());
		
	}


	public static void main(String[] args) {
		RandomNumbers obj = new RandomNumbers();
		//obj.getRandomNumberRange1(8);
		//obj.getRandomNumberRange2(1000);
		//obj.getRandomNumberRange3(5000);
		//obj.getRandomNumberWithFixLength(10);
		
	}

}
