package main.java.twoSum;


public class TwoSumSorted {
	
/* if array is already sorted
 *  
 */
	
/*
 * METHOD1: use binary tree search
 * Time: O(NlogN)
 * Space: O(1) 
 * Priority:2 
*/
	
	
	public static int[] twoSum(int[] numbers, int target) {
		// Assume input is already sorted.
		for (int i = 0; i < numbers.length; i++) {
			int j = bsearch(numbers, target - numbers[i], i + 1);
			if (j != -1) {
				return new int[] { i + 1, j + 1 };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
		}

	
	
	private static int bsearch(int[] A, int key, int start) {
		int L = start, R = A.length - 1;
		while (L < R) {
			int M = (L + R) / 2;
			if (A[M] < key) {
				L = M + 1;
			} else {
				R = M;
			}
		}
		return (L == R && A[L] == key) ? L : -1;
	}
	
	
/*
 * METHOD2 use two pointers
 *Time: O(N);
 *Space: O(1); 
 *Priority:1
 * 
 */
	
	public static int[] twoPointerSearch(int[] numbers, int target){
		int i = 0;
		// int j = i+1;
		int j = numbers.length -1;  //j point starts from the end of the array
		//for (; i < numbers.length; i++){
		while (i < j){
/*			int number1 = numbers[i];
			int number2 = numbers[j];*/
			int sum = numbers[i] + numbers[j];
			if (sum == target){
				return new int[]{i+1, j+1};
			}
			else if (sum < target){
				//j++;
				i++;
			}
			else if (sum > target){
				j--;
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
