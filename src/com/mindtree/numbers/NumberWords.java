package com.mindtree.numbers;

import java.io.IOException;
import java.util.Scanner;

public class NumberWords {
	private String[] unitplace = {
			"Zero",
			"One",
			"Two",
			"Three",
			"Four",
			"Five",
			"Six",
			"Seven",
			"Eight",
			"Nine",
			"Ten",
			"Eleven",
			"Twelve",
			"Thirteen",
			"Fourteen",
			"Fifteen",
			"Sixteen",
			"Seventeen",
			"Eighteen",
			"Nineteen"};
	private String[] tenplace = {
			"Twenty",
			"Thirty",
			"Fourty",
			"Fifty",
			"Sixty",
			"Seventy",
			"Eighty",
			"Ninety"};
		
	public String toWords( int num ) {
		String result = null;
		
		if (num == 0) {
			System.out.println("Program Exited !!! Good Bye .");
			System.exit(0);
		}else if(num < 0) {
			result = "Negative numbers are not accepted. Please Enter Positive numbers";
			return result;
		}
		
		if (num < 20) {
			return unitplace[num];
		}
		
		result = lessThan100(num) == null ? lessThan1000(num) : lessThan100(num);
		
		if (result == null) {
			result = "Number is out of range";
		}
		
		return result;
	}
	
	private String lessThan100(int number) {
		if (number >=100)
		{
			return null;
		}
		if(number < 20) {
			return unitplace[number];
		}
		
		StringBuilder result = new StringBuilder();
		
		int num = number % 10;
		int dividedValue = (number - num) / 10;
		
		result.append(tenplace[dividedValue - 2]);
		
		if(num != 0) {
			result.append(" ").append(unitplace[num]);
		}
		
		return result.toString();
	}
	
	private String lessThan1000(int number) {
		if (number >= 1000) {
			return null;
		}
		
		StringBuilder result = new StringBuilder();
		
		int num = number % 100;
		
		int dividedValue = (number - num) / 100;
		
		result.append(unitplace[dividedValue]).append(" ").append("Hundred");
		
		if(num != 0) {
			result.append(" ").append(lessThan100(num));
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		NumberWords Obj = new NumberWords();
		String inputNumber = "";
		Scanner scanner = new Scanner(System.in);
	try {
			System.out.print( "Enter a number to convert into Words and zero (0) to EXIT : \n " ) ;
			String value = scanner.nextLine();
			int number = Integer.parseInt( value) ;
			System.out.println(Obj.toWords(number));
		} catch ( NumberFormatException e ) {
			System.out.println( "Invalid Number" ) ;
		}
		
	}

		
	
}
