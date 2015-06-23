package main.java;
import main.java.atoi.Atoi;
import main.java.interfaces.FunctionInterface;
import main.java.palindrome.TwoPointer;
import main.java.reverse.ReverseWordsInString;
import main.java.reverse.ReverseWordsInStringInPlace;
import main.java.reverse.RotateArrayKSteps;
import main.java.strstr.StrStr;
import main.java.twoSum.TwoSumClassNumberArray;
import main.java.twoSum.TwoSumClassNumberHash;
import main.java.twoSum.TwoSumClassNumberSortedArray;
import main.java.twoSum.TwoSumSorted;
import main.java.validNumber.isStringvalidNumber;

import org.apache.log4j.Logger;







public class Test1 {

	public static void main(String[] args) {
		

		final Logger logger = Logger.getLogger(Test1.class.getName()); 
		
		
		
		//class current = new class();
		
		// 1. find a two int sum result as target in an array
		int[] result = TwoSumSorted.twoPointerSearch(new int[]{1,2,3,4,5,10}, 11); 
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i] + "\n");
		}
		
		// 2. two sum class with data structure as unsorted array
		TwoSumClassNumberArray sumclass1 = new TwoSumClassNumberArray();
		sumclass1.add(1);
		sumclass1.add(2);
		sumclass1.add(4);
		int[] twoSumclassResult = sumclass1.find(3);
		
		for(int i = 0; i < twoSumclassResult.length; i++){
			System.out.print(twoSumclassResult[i] + "\n");
		}
		
		// 3. binary search
		System.out.print("3. Binary Search\n");
		int result3 = Utility.binarySearch(new int[]{1,2,4,6}, 4);
		System.out.print("Found Index:" + result3 + "\n");
		
		// 4. binary search insert
		System.out.print("4. Binary Search Insert\n");
		int[] input4 = new int[]{1,2,4,6,7,9};
		System.out.print("Before binary insert: \n");
		for(int i = 0; i < input4.length; i++){
			System.out.print(input4[i] + "\n");
		}
		
		int result4 = Utility.binarySearchInsert(input4, 0);
		

		System.out.print("Correct index is:" + result4 + "\n");
		
		System.out.print("After binary insert: \n");
		for(int i = 0; i < input4.length; i++){
			System.out.print(input4[i] + "\n");
		}
		
		// 5. two sum class with data structure as sorted array
		System.out.print("5. Two sum class with data structure as sorted array\n");
		TwoSumClassNumberSortedArray twoSumClassNumberSortedArray = new TwoSumClassNumberSortedArray();
		twoSumClassNumberSortedArray.add(1);
		twoSumClassNumberSortedArray.add(2);
		twoSumClassNumberSortedArray.add(4);
		
		int[] twoSumClassNumberSortedArrayResult = twoSumClassNumberSortedArray.find(3);
		
		for(int i = 0; i < twoSumClassNumberSortedArrayResult.length; i++){
			System.out.print(twoSumClassNumberSortedArrayResult[i] + "\n");
		}
		
		// 6. two sum class with data structure as hash 
		System.out.print("6. Two sum class with data structure as hash\n");
		TwoSumClassNumberHash twoSumClassNumberHash = new TwoSumClassNumberHash();
		twoSumClassNumberHash.add(2);
		twoSumClassNumberHash.add(3);
		twoSumClassNumberHash.add(4);
		
		int[] twoSumClassNumberHashRuslt = twoSumClassNumberHash.find(7);
		
		for(int i = 0; i < twoSumClassNumberHashRuslt.length; i++){
			System.out.print(twoSumClassNumberHashRuslt[i] + "\n");
		}
		
		// 7. Palindrome
		System.out.print("7. Palindrome\n");
		String palindromeString = "A man, a plan, a canal: Panama";
		boolean palindromeResult = TwoPointer.isPalindrome(palindromeString);
		System.out.print(palindromeResult + "\n");
		
		
		System.out.print("8. StrStr\n");
		String stringa = "mississippi";
		String stringb = "issi";
		int strstrResult = StrStr.bruteForce2(stringa, stringb);
		System.out.print(strstrResult + "\n");
		
		System.out.print("9. Reverse\n");
		/*String test = "blue";
		System.out.print(test.charAt(4));*/
/*		//test i++, i--
		int i = 5;
		int b = i--;  
		//result: b=5, i=4
		System.out.print("after b = i--; b = " + b +" \n");
		System.out.print("after b = i--; i = " + i +" \n");
		int c = --i;
		//result: c=3, i=3
		System.out.print("after c = --i; c = " + c +" \n");
		System.out.print("after c = --i; i = " + i +" \n");*/
		
		
		String stringReverse = "   the sky is    blue";
		System.out.print("Reverse words using two path: " + ReverseWordsInString.reverseWordsTwoPath(stringReverse)+ "\n");
		System.out.print("Reverse words using one path: " + ReverseWordsInString.reverseWordsOnePath(stringReverse)+ "\n");
		System.out.print("Reverse words using one path leetcode: " + ReverseWordsInString.reverseWords(stringReverse)+ "\n");
		//reverse in place requires no extra space at begin, end and in between words 
		char[] resultCharArray = ReverseWordsInStringInPlace.reverseWordsInPlace("the sky is blue".toCharArray());
		Utility.printCharArray(resultCharArray);
		//System.out.print(ReverseWordsInString.reverseWordsInPlace(stringReverse.toCharArray())+ "\n");
		
/*		logger.info("Test char to string");
		char a = 'c';
		logger.info("char a is: " + a);
		char[] charString = {'a', 'b', 'c'};
		logger.info("Cannot use char[].toSting(), toString() belongs to object method,  this method returns a string equal to the value of: "
				+ "getClass().getName() + '@' + Integer.toHexString(hashCode()");*/
 
		
		System.out.print("10. Rotate words\n");
		char[] rotateResult = RotateArrayKSteps.rotateCharArray(new char[]{'a','b','c','d','e','f','g'}, 2 );
		Utility.printCharArray(rotateResult);
		
		
		System.out.print("11. atoi\n");
		String atoiString = "    asdfasdf-12345asdfjasdf   ";
		System.out.print(Atoi.atoi(atoiString));
		
		
		/*
		 * 12. Validate if a given string is numeric.*/
		System.out.print("12. Valid Number");
		String testFloatString = "0.12";
		FunctionInterface<String, Boolean> runningClass = new isStringvalidNumber();
		System.out.print(runningClass.runFunction(testFloatString));
		
		/* end of
		 * 12. Validate if a given string is numeric.*/
		
	}
	
	


}
