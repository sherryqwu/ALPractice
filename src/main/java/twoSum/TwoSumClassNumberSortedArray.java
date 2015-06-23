package main.java.twoSum;

import java.util.ArrayList;
import java.util.List;

import main.java.Utility;



public class TwoSumClassNumberSortedArray {
	
	//solution2: store number in list with sorted order
	List<Integer> numbers;
	//int[] intNumbers;
	
/*
 * Function: add number to class member
 * Time :O(1)
 */
	public TwoSumClassNumberSortedArray(){
		numbers = new ArrayList<Integer>();
	} 
	
	public void add(Integer number){
		// maintain a sorted array when add new element
		int index = Utility.binarySearchInsert(Utility.convertIntegers(numbers), number);
		//put the number at right index place
		numbers.add(index, number);
		
	}

/*
 * Function: find index in class member for a target sum 
 * Time: O(N)
 * Space: O(N)
 */		
	
	public int[] find(Integer target){
		return TwoSumSorted.twoPointerSearch(Utility.convertIntegers(numbers), target);
	}
	

	

	
	
	
	
	

}
