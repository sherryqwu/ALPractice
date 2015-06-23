package main.java.strstr;

public class StrStr {
	

//IMPORTANT!!	
/* Time: O(M*N)
 * Space: O(1)
 * */

	
	public static int bruteForce(String haystack, String neddle){
/*		for(int i = 0; i < b.length(); i++)
			for(int j = 0; j < a.length(); j++){
				if (b.charAt(i) == a.charAt(j)){
					
					String test = new String(a.substring(i, i+b.length()-1));
					if (test.equals(b)) {
						return j;
					}
					else {
						j
					}
				}
			}*/

		//just need scan string a
		for(int i = 0; i < haystack.length(); i++){
			if (haystack.charAt(i) == neddle.charAt(0)){
				//System.out.print(a.charAt(i));
				try{
					String test = haystack.substring(i, i+neddle.length());
					if (test.equals(neddle)) return i;
				}
				catch (StringIndexOutOfBoundsException e){
					return -1;
				}
				//System.out.print(test);
				
			}
		}
		return -1;
	}
	
	
	public static int bruteForce2(String haystack, String needle) {
		for(int i = 0; i < haystack.length(); i++){
			if (haystack.charAt(i) == needle.charAt(0)){
				int k = i; //start pointer for haystack
				int j = 0; //pointer for needle
				
				while (j < needle.length()){
					if (haystack.charAt(k) == needle.charAt(j)){
						k++;
						j++;
					}
					else break;
				}
				//lSystem.out.print("j: " + j + "\n");
				if (j == needle.length()) return i;
			}
		}
		return -1;
	}
	
	
	public static int bruteForce3(String haystack, String needle) {
		for (int i = 0; ; i++) {  //haystack
			for (int j = 0; ; j++) {  //needle
				if (j == needle.length()) return i;
				if (i + j == haystack.length()) return -1;
				if (needle.charAt(j) != haystack.charAt(i + j)) break;
			}
		}
	}

}
