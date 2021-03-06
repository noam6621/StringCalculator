package StringCalculatorKata.tests;

//import static org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Test;

import StringCalculatorKata.StringCalculator;

public class StringCalculatorAddTest {

	@Test
	public void add0Test() {
		StringCalculator calculator = new StringCalculator();
		String value = "";
		calculator.add(value);
		
		assertEquals("0", calculator.prompt);
	}
	
	@Test
	public void add1Test() {
		StringCalculator calculator = new StringCalculator();
		String value = "23";
		calculator.add(value);
		
		assertEquals("23", calculator.prompt);
	}
	
	@Test
	public void add2Test() {
		StringCalculator calculator = new StringCalculator();
		String value = "23,5";
		calculator.add(value);
		
		assertEquals("28", calculator.prompt);
	}
	
	@Test
	public void add8Test() {
		StringCalculator calculator = new StringCalculator();
		String value = "23,5"+'\n'+"3,67"+'\n'+"143,7"+'\n'+"4";
		calculator.add(value);
		
		assertEquals("252", calculator.prompt);
	}
}
