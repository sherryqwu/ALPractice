package main.java.reverse;
import org.apache.log4j.Logger;


public class ReverseWordsInString {
	
	
	final static Logger logger = Logger.getLogger(ReverseWordsInString.class.getName()); 
	
/*	
 * Time: O(N+N)
 * Space: O(N) because the new string builder's space
 * 
 * */
	//"   the sky is    blue    "
	//not a good solution so far, because leading space and trailing spaces
	public static String reverseWordsTwoPath(String string){
		String[] splitedWords = string.split(" ");  //path1: split string into array of words
		String resultString = "";
		for(int i = splitedWords.length - 1; i >= 0; i--){ //path2: print words in reverse order
			resultString += splitedWords[i] + " ";
		}
		return resultString;
	}

	
/*	
 * Time: O(N)
 * Space: O(N) because the new string builder's space
 * 
 * */	
	public static String reverseWordsOnePath(String string){
		//String resultString = ""; 
		//use string builder
		StringBuilder resultString = new StringBuilder();
		int indexOfWordEnds = string.length() -1;


		//int indexOfWordStarts = string.length() -1;
		//"   the sky is    blue    "
		//"   the sky is    blue"
		for(int i = string.length()-1 ; i >= 0;  ){  //use one path from the end of string and keep track of a word's begin and end 
			//indexOfWordStart is the same as the pointer
		
			if(string.charAt(i) == ' '){
				if (i != string.length()-1){  //if this is not the space at the end of the string
					for(int k = i+1; k <= indexOfWordEnds; k++ ){
						resultString.append(string.charAt(k));
					}
					resultString.append(' ');
				}
	
				while (i >= 0 && string.charAt(i) == ' ' ){
					i--;
				}
				indexOfWordEnds = i;
			}
			else {
				i--;
			}
		}
		//return resultString;
		return resultString.toString();
	}
	
	//leetcode using one
	public static String reverseWords(String s) {
		StringBuilder reversed = new StringBuilder();
		int j = s.length();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				j = i;
			} else if (i == 0 || s.charAt(i - 1) == ' ') {
				if (reversed.length() != 0) {
					reversed.append(' ');
				}
				reversed.append(s.substring(i, j));
			}
		}
		return reversed.toString();
		}
	

}
