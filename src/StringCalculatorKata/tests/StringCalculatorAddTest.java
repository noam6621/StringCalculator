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
		String value0 = "";
		calculator.add(value0);
		
		assertEquals("0", calculator.prompt);
	}
}
