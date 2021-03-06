package PF.Session2.Assignment2;

import PF.Session2.UserException.IllegalExpressionException;
/**
 * 
 * @author Anshul Agarwal
 * This class is used to print pattern
 * if n=5,
 * 12345
 *  1234
 *   123
 *    12
 *     1
 *     
 * Custom Exception is called if row number is greater than n  
 */
public class SimplePattern {
	/**
	 * 
	 * @param n
	 * @return pattern as string array
	 * @throws IllegalExpressionException
	 */
	String[] printPattern(int n) throws IllegalExpressionException{
		if(n>=0){
			String result[] =  new String[n];
			for(int i=0;i<n;i++){
				System.out.println(spaces(i,n)+numbers(i, n)); // print pattern
				result[i] = spaces(i,n) + numbers(i, n); // save pattern as string
			}
			return result;
		} else {
			throw new IllegalExpressionException("Negative values not allowed");
		}
	}
	/**
	 * 
	 * @param row
	 * @param n
	 * @return spaces as string according to pattern
	 * @throws IllegalExpressionException
	 */
	String spaces(int row, int n) throws IllegalExpressionException{
		
		String space = "";
		// row used be less than n otherwise it will throw exception
		if(row < n) {
			for(int i=0;i<row;i++) {
				space = space.concat(" ");
			}
		} else {
			throw new IllegalExpressionException("This row value is not allowed"); // exception thrown if row is greater than n
		}
		return space;
	}
	 /**
	  * 
	  * @param row
	  * @param n
	  * @return number as string according to question
	  * @throws IllegalExpressionException
	  */
	String numbers(int row,int n) throws IllegalExpressionException {
		
		String number = "";
		// row used be less than n otherwise it will throw exception
		if(row < n) {
			for(int i=1;i <= n-row;i++) {
				number = number.concat(String.valueOf(i));
			}
		} else {
			throw new IllegalExpressionException("This row value is not allowed"); // exception thrown if row is greater than n
		}
		return number;	
	}
}
