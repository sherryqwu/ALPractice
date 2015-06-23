package main.java.twoSum;

import java.util.ArrayList;
import java.util.List;

import main.java.Utility;

public class TwoSumClassNumberArray {
	// private int[];
	
	//solution1: store number in list with unsorted order
	List<Integer> numbers;
	
/*
 * Function: add number to class member
 * Time :O(1)
 */
	public TwoSumClassNumberArray(){
		numbers = new ArrayList<Integer>();
	} 
	
	public void add(Integer number){
		numbers.add(number);	
	}

/*
 * Function: find index in class member for a target sum 
 * Time: O(N)
 * Space: O(N)
 */		
	
	public int[] find(Integer target){
		return TwoSumUnsorted.twoSumUsingHash(Utility.convertIntegers(numbers), target);
	}
}
