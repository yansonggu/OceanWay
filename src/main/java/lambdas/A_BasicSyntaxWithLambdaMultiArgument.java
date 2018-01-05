package lambdas;

/**
 * - lambda argument should always match interface method signature lambda 
 * - can only work with functional interface because if if have two method inside
 * 	 interface with same arg then lambda will get confuse
 */
public class A_BasicSyntaxWithLambdaMultiArgument {

	public static void main(String[] args) {
		Addable lambda = (int a, int b) -> a + b;
		System.out.println("Sum: " + lambda.getAddition(50, 100));
	}
}

interface Addable {
	public int getAddition(int a, int b);
}