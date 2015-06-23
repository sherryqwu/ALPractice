package main.java.validNumber;

import main.java.interfaces.FunctionInterface;

public class isStringvalidNumber implements FunctionInterface<String, Boolean>{
	
	@Override
	public Boolean runFunction(String s){
		
/*		
 * 
 * s1. Leading whitespaces (optional).
 * s2. Plus (+) or minus (–) sign (optional).
 * s3. Number.
 * s4. Optional trailing whitespaces (optional).
 * 
 * 
 * IMPORTANT!!!!
 * do not try to prove it is not valid (too much cases)
 * try to prove it is valid
 * */
		
		
		int i = 0;
		int length = s.length();
		
		//result flag!! set it as false
		// isValidNumber flag & isDigit: isDigit determines isValidNumber is false 
		boolean isValidNumber = false;
		
		//s1. Leading whitespaces (optional)
		while( i < length && s.charAt(i) == ' ' ) i++;
		
		//s2. Plus (+) or minus (–) sign (optional)
		if (i < length && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
		
/*		a. Integer part
		b. Decimal point
		c. Fractional part*/
		
		//a. Integer part
		while( i < length && Character.isDigit(s.charAt(i))) {
			//twist the flag;
			isValidNumber = true;
			i++;
		}	
		
		//b. Decimal point, not in the loop
		if (s.charAt(i) == '.') {
			i++;
			//c. Fractional part, in the '.' if clause
			while ( i < length && Character.isDigit(s.charAt(i))){
				isValidNumber = true;
				i++;
			}	
		}
		
		//s4. Optional trailing whitespaces
		while( i < length && s.charAt(i) == ' ' ) i++;
		
		// 1. cursor move to the end, 2. flag is true
		if (i == length && isValidNumber) {
			return true; 
		}
		else return false;
	}



}
