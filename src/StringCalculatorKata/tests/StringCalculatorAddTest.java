package StringCalculatorKata.tests;

//import static org.junit.Assert.*;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import StringCalculatorKata.StringCalculator;

public class StringCalculatorAddTest {

	@Test
	public void addTest() {
		StringCalculator calculator = new StringCalculator();
		/*String value0 = "";
		calculator.add(value0);
		String value1 = "23";
		calculator.add(value1);*/
		String value2 = "23,5";
		calculator.add(value2);
		
		assertEquals("28", calculator.prompt);
	}
}
