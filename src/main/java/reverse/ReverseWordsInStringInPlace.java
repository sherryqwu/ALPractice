package main.java.reverse;

import main.java.Utility;

import org.apache.log4j.Logger;

public class ReverseWordsInStringInPlace {
	
	private static final Logger logger = Logger.getLogger(ReverseWordsInStringInPlace.class.getName());
	
	//"the sky is blue"
	//reverse a char array, with j and k assign to start and end pointer, then move j and k
	private static void reverseInPlace(char[] s, int wordStartPointer, int wordEndPointer){// don't use string, use char[] cause going to in place change
		//for(int j = wordStartPointer; j <= wordEndPointer/2; j++){ //wrong
		for(int j = wordStartPointer, k= wordEndPointer; j <= (wordEndPointer + wordStartPointer)/2; ){
			//logger.info("looping through s[]: j= " + j);
			char tem = s[j];
			
			s[j] = s[k]; //s[i] = s[s.length - i ]; remeber -1
			//logger.info("looping through s[]: s[j] = " +s[j]);
			s[k] = tem;
			//logger.info("looping through s[]: s[wordEndPointer] = " +s[wordEndPointer]);
			//Utility.printCharArray(s);
			j++;
			k--;
		}
		Utility.printCharArray(s);
	}

	//reverse a char array, better solution: with i as increment, them move i 
	private static void reverseInPlaceClean(char[] s, int wordStartPointer, int wordEndPointer){// don't use string, use char[] cause going to in place change
		//for(int j = wordStartPointer; j <= wordEndPointer/2; j++){ //wrong
		for(int i = 0; i <= (wordEndPointer - wordStartPointer)/2; i++){
			//logger.info("looping through s[]: j= " + j);
			char tem = s[wordStartPointer + i];
			
			s[wordStartPointer + i] = s[wordEndPointer - i]; //s[i] = s[s.length - i ]; remeber -1
			//logger.info("looping through s[]: s[j] = " +s[j]);
			s[wordEndPointer - i] = tem;
			//logger.info("looping through s[]: s[wordEndPointer] = " +s[wordEndPointer]);
			//Utility.printCharArray(s);
		}
		//Utility.printCharArray(s);
	}
	
	//reverse twice, by whole char[], then by words 
	/* Time: O(N+N)
	 * Space: O(1)
	 * 
	 * */ 
	public static char[] reverseWordsInPlace(char[] s){
		//reverseInPlace(s, 0 , s.length-1);
		reverseInPlaceClean(s, 0 , s.length-1);

		//Utility.printCharArray(s);
		//System.out.print(s.toString());
		
		int wordStartPointer = 0;
		for (int i = 0; i <= s.length; i++){
			//if (s[i] == ' '){ //wrong
			if (i == s.length || s[i] == ' '){ //when i at the end of char[], there is one last word need to be reversed
			//if (s[i] == ' ' || i == s.length){ //wrong, ArrayIndexOutOfBoundsException
				//logger.info("find a space at: "+ i);
				//reverseInPlace(s, wordStartPointer, i-1);
				reverseInPlaceClean(s, wordStartPointer, i-1);
				//Utility.printCharArray(s);
				//logger.info("after reverse i = "+ i);
				wordStartPointer = i + 1; 
			}
		}
		return s;
	}

}
