package main.java.palindrome;

public class TwoPointer {
	
	public static boolean isPalindrome(String s){
/*		
 * Time: O(n)
 * Space: O(1)
 */
		int i = 0;
		int j = s.length() -1;
		while (i <= j){  //i=j?
			// skip all char that is not letter or digital
/*			if (!Character.isLetterOrDigit(s.charAt(i))) i++;
			if (!Character.isLetterOrDigit(s.charAt(i))) j--;*/
			while (i<=j && !Character.isLetterOrDigit(s.charAt(i))) i++;
			while (i<=j && !Character.isLetterOrDigit(s.charAt(j))) j--;
		
/*			if (s.charAt(i) != s.charAt(j)){
				return false;
			}*/
			// palindrom is case incensitive
/*			System.out.print("i: " + i + "\n");
			System.out.print("j: " + j + "\n");
			System.out.print("Comparing " + s.charAt(i) + " And " + s.charAt(j) + "\n");*/
			if (Character.toLowerCase(s.charAt(i))
				!= Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}
}
