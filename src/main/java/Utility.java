package main.java;
import java.util.List;

import org.apache.log4j.Logger;


public class Utility {
	
	private static final Logger logger = Logger.getLogger(Test1.class.getName());
	
	public static int[] convertIntegers(List<Integer> integers)
	{
	    int[] ret = new int[integers.size()];
	    for (int i=0; i < ret.length; i++)
	    {
	        ret[i] = integers.get(i).intValue();
	    }
	    return ret;
	}
	
	//VERY IMPORTANT UTIL!!! Time: O(log(n))
	//find index, if not exist, throw exception
	public static Integer binarySearch(int[] A, int target){
		int L = 0, R = A.length -1;
		//Attention: <=
		// be ware of infinate loop
		while (L <= R){
			int M = (L + R)/2;
			if (A[M] == target){
				return M;
			}
			else if(A[M] > target){
				R = M - 1;
			}
			else if(A[M] < target){
				// L++;
				L = M + 1 ;
			}
		}
		throw new IllegalArgumentException("no result found!");
	}
	
	//find index, if not exist, return the correct index it should insert to
	public static Integer binarySearchInsert(int[] A, int target){
		int L = 0, R = A.length -1;
		//Attention: <=
		// be ware of infinate loop
		while (L <= R){
			int M = (L + R)/2;
			if (A[M] == target){
				System.out.print("Find "+ target + "in array already, cannot insert \n");
				return M;
			}
			else if(A[M] > target){
				R = M - 1;
			}
			else if(A[M] < target){
				// L++;
				L = M + 1 ;
			}
		}
/*		System.out.print("R:" + R + "\n");
		System.out.print("L:" + L + "\n");*/
		//A[L] = target; //Wrong: this will replace the element in the array, and if trying to insert a new element at the end, ERROR: index out of error
		return L;
		//throw new IllegalArgumentException("no result found!");
	}
	
	//return a new array 
	
	public static void printCharArray(char[] s){
		StringBuilder output = new StringBuilder();
		for(int i = 0; i <= s.length-1; i++){
			output.append(s[i]);
		}
		System.out.print(output.toString() + "\n");
	}
	
	//reverse a char array, better solution: with i as increment, then move i 
	public static void reverseInPlaceClean(char[] s, int wordStartPointer, int wordEndPointer){// don't use string, use char[] cause going to in place change
		//for(int j = wordStartPointer; j <= wordEndPointer/2; j++){ //wrong
		while(wordStartPointer <= wordEndPointer){
			char tem = s[wordStartPointer];
			s[wordStartPointer] = s[wordEndPointer];
			s[wordEndPointer] = tem;
			wordStartPointer++;
			wordEndPointer--;
			
		}
/*		for(int i = 0; i <= (wordEndPointer - wordStartPointer)/2; i++){
			//logger.info("looping through s[]: j= " + j);
			char tem = s[wordStartPointer + i];
			
			s[wordStartPointer + i] = s[wordEndPointer - i]; //s[i] = s[s.length - i ]; remeber -1
			//logger.info("looping through s[]: s[j] = " +s[j]);
			s[wordEndPointer - i] = tem;
			//logger.info("looping through s[]: s[wordEndPointer] = " +s[wordEndPointer]);
		}*/
	}
}
