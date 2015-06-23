package main.java.twoSum;

import java.util.HashMap;
import java.util.Map;



public class TwoSumClassNumberHash {
	
	//solution2: store number in list with sorted order
	Map<Integer, Integer> map;
	Integer currentIndex;
	//int[] intNumbers;
	
/*
 * Function: add number to class member
 * Time :O(1)
 */
	public TwoSumClassNumberHash(){
		map = new HashMap<>();
		currentIndex = 0;
	} 
	
	public void add(Integer number){
		// maintain a hashmap <ElementValue:Index> when add new element got insert
		currentIndex++;
		map.put(number, currentIndex);
	}

/*
 * Function: find index in class member for a target sum 
 * Time: O(N)
 * Space: O(N)
 */		
	
	public int[] find(Integer target){
		for (Integer value : map.keySet()){
			if (map.containsKey(target - value)){
				return new int[]{map.get(value), map.get(target - value)};
			}
		}
		throw new IllegalArgumentException("no two sum found!");
	}
}
