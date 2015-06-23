package main.java.atoi;

import main.java.Test1;

import org.apache.log4j.Logger;

public class Atoi {
	
	/*The heart of this problem is dealing with overflow*/
	
	
	private static final Logger logger = Logger.getLogger(Test1.class.getName()); 
	private static final int maxDiv10 = Integer.MAX_VALUE / 10;
	//not good, because 
	private static final int removeFirstDigitalOfIntMaxValuePos = Integer.parseInt((String.valueOf(Integer.MAX_VALUE)).substring(1));
	private static final int removeFirstDigitalOfIntMinValueNag = Integer.parseInt((String.valueOf(Integer.MIN_VALUE)).substring(2));
	

	
	public static int atoi(String s){
		
		
		
		int result = 0; 
		int sign = 1;
		int start = 0;
		logger.info("Integer.MAX_VALUE: " + Integer.MAX_VALUE); //2147483647 pow(2,31)
		logger.info("Integer.MIN_VALUE: " + Integer.MIN_VALUE);	//-2147483648 pow(2,32)
		logger.info("Integer.MAX_VALUE: " + removeFirstDigitalOfIntMaxValuePos);	//147483647 pow(2,32)
		logger.info("Integer.MIN_VALUE: " + removeFirstDigitalOfIntMinValueNag);	//147483648 pow(2,32)
		logger.info("maxDiv: " + maxDiv10);
		
		
		//filter out whitespace
		//while(s.charAt(start) == ' ') start++;
		//if(s.length() - start)
		
		//loop through string, each digital * weight: Math.pow(10, i) 
		for(int i = 0; i <= s.length() - 1; i++){
			//if(s.charAt(s.length() - 1 - i) == '-' && !Character.isDigit(s.length() - 1 - i -1))	sign = -1;
			// loop through from the array's end, should have use loop through the head, and * 10 every time
			if(Character.isDigit(s.charAt(s.length() - 1 - i))){
			//result += s.charAt(i) * i * 10; //wrong
			//logger.info("result);
			//wrong, even get the char, it is still char, not a number, use Character.getNumericValue to
			//result = (int) (result + s.charAt(s.length() - 1 - i) * Math.pow(10, i)); 
				logger.info(s.charAt(s.length() - 1 - i));
				int number = Character.getNumericValue(s.charAt(s.length() - 1 - i));
				logger.info(number);
					//if result is going to overflow
				if(sign == 1 && result >= removeFirstDigitalOfIntMaxValuePos && number >= 2 
					|| sign == -1 && result >= removeFirstDigitalOfIntMinValueNag && number >= 2){
					return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
				}
				result = result + (int) (number * Math.pow(10, start)); //result could overflow
				start++;
				logger.info("result: " + result);
			}
			
			else if(s.charAt(s.length() - 1 - i) == '-' && Character.isDigit(s.length() - i)){
				logger.info("Found a sign;");
				sign = -1;
				break;
			}

		}
		return result * sign;
	}
	
}
