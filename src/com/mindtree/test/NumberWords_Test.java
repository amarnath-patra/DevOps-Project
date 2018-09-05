package com.mindtree.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.mindtree.numbers.NumberWords;

public class NumberWords_Test {

	private NumberWords numberWords ;
	
	@Before
	public void setup() { 
		numberWords = new NumberWords();
	}
	
	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Negative numbers are not accepted. Please Enter Positive numbers", numberWords.toWords(-1)) ;
	}
	
	@Test
	public void numberLessThanNineteen() {
		Assert.assertEquals( "Fourteen", "Fourteen", numberWords.toWords(14 )) ;
	}
	
	@Test
	public void numberSeventySeven() {
		Assert.assertEquals("Seventy Seven", "Seventy Seven", numberWords.toWords(77));
	}
	
	@Test
	public void numberLessThanHundred() {
		Assert.assertEquals( "Nighty One", "Ninety One", numberWords.toWords(91) ) ;
	}
	 
	@Test
	public void numberLessThanThousand() {
		Assert.assertEquals("Nine Hundred Ninety Nine", "Nine Hundred Ninety Nine", numberWords.toWords(999)) ;
	}
	
	@Test
	public void numberOutOfRangeReturnsErrorGreaterThanThousand() {
		Assert.assertEquals( "Error", "Number is out of range", numberWords.toWords( 1000 ) ) ;

}
}
