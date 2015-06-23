package main.java.twoSum;
import java.util.HashMap;
import java.util.Map;


public class TwoSumUnsorted {
	
	/*
	 * if array is not sorted
	 */
		
	/*
	 * METHOD 1: using hashmap
	 * Time: O(N)
	 * Space: O(N)
	 * Priority: 1	
	 */
		
		public static int[] twoSumUsingHash (int[] numbers, int target){
			
			// IMPORTANT: value is the key, index is the hashvalue 
			// int[] result = new int[]{};
			Map<Integer, Integer> map = new HashMap<>();
			// HashMap<Integer, Integer> numbersMap = new HashMap<>(); 
			
			for (int i = 0; i < numbers.length; i++){
				int value = numbers[i];
				if (map.containsKey(target - value)){
					int index = map.get(target - value);
					return new int[]{ i+1, index+1 };
				}
				//valu
				//the value in array must be unique 
				map.put(value, i);
				// numbersHash.put(i, numbers[i]);
			}
			//throw new Exception("No Matching Result for two number added up as" + target);
			throw new IllegalArgumentException("No Matching Result for two number added up as" + target);
		}
		
	/*
	 * METHOD 2: using two loop
	 * Time: O(N2)
	 * Space: O(1)
	 * Priority: 2	
	 */	
		public static int[] twoSumUsingTwoLoop (int[] numbers, int target){
			for (int i =0; i < numbers.length; i++){
				int number = numbers[i];
				for (int j = i+1; j < numbers.length; j++){
					if (numbers[j] == target - number){
						return new int[]{i+1, j+1};
					}
				}
			}
			throw new IllegalArgumentException("No Matching Result for two number added up as" + target);

		}

}
