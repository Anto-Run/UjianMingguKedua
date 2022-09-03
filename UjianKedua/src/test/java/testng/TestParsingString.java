package testng;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestParsingString {
	ParsingString ps;
	int intLengthString =0;
    boolean useLetters = false;
    boolean useNumbers = true;
    String strInput = "";
	
	@BeforeClass
	public void befClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void befTest() {
		ps = new ParsingString();
		System.out.println("===========================");
		System.out.println("      Test Dimulai !!");
		System.out.println("===========================");
		
	}
	@BeforeMethod
	public void befMethod(){
		System.out.println("Before Method");
	}
	
	@Test
	public void testParsingStringToInt() {
		System.out.println("==================================");
		System.out.println("  Test Luas Parse String to Int ");
		System.out.println("==================================");
	    intLengthString = 10;
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);
		System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToIntActual(strInput),ps.parseStringToIntExcept(strInput));
		System.out.println("==================================");
	}
	@Test
	public void testParsingStringtoDouble() {
		System.out.println("==================================");
		System.out.println("  Test Luas Parse String to Double ");
		System.out.println("==================================");
	    intLengthString = 15;
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);
		System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToDoubleActual(strInput),ps.parseStringToDoubleExcept(strInput));
		System.out.println("==================================");
	}

	@Test
	public void testParsingStringToFloat() {
		System.out.println("==================================");
		System.out.println("  Test Luas Parse String to Float ");
		System.out.println("==================================");
	    intLengthString = 15;
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);
	    
	    assertEquals(ps.parseStringToFloatActual(strInput),ps.parseStringToFloatExcept(strInput));
		System.out.println("==================================");
	}
	@AfterClass
	public void aftClass()
	{
		System.out.println("Ini Adalah After Class Class");
	}
	
	@AfterMethod
	public void aftMethod()
	{
		System.out.println("Ini Adalah After Method ");
	}
	
	@AfterTest
	public void aftTest()
	{
		System.out.println("===========================");
		System.out.println("Test Sudah Selesai Dilakukan");
		System.out.println("===========================");
	}
}
