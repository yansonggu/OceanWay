package sorting;

/**
 * Insertion Sort is the basic and simple sorting algo
 * 
 * Here we pick one element at a time and put it in particular place in list
 * 
 * Worst and Average Case Complexity : O(n^2) 
 * Best case Complexity : O(n)
 * 
 * Adv: 
 * simple to implement very fast for smaller set 
 * even faster than quick
 * sort for small set
 * 
 * Disadv: 
 * Inefficient, not practical for large set
 * 
 */
public class C_InsertionSort {

	public static int[] doInsertionSort(int[] input) {
		int temp;
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
		}
		return input;
	}
	
	
	public static void printArray(int[] arr){
		for (int i : arr) {
			System.out.print(i);
			System.out.print(", ");
		}
		System.out.println("\n");
	}
	
	public static void main(String a[]) {
		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };
		printArray(arr1);
		int[] arr2 = doInsertionSort(arr1);
		printArray(arr2);
	}
}
