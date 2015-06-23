package main.java.reverse;

import main.java.Utility;

public class RotateArrayKSteps {
	
/*	Time: O(N+N+N) 
	Space: O(1)*/
	
	 public static char[] rotateCharArray(char[] charArray, int kStep){
		 
/*		 The trick is to do three reverse operation. 
		 One for the entire string, 
		 one from index 0 to k-1, 
		 and lastly index k to n-1. */
		Utility.reverseInPlaceClean(charArray, 0, charArray.length - 1);
		Utility.reverseInPlaceClean(charArray, 0, charArray.length - kStep - 1);
		Utility.reverseInPlaceClean(charArray, charArray.length - kStep, charArray.length - 1);
		return charArray;
	 }
}
