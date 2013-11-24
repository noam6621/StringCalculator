package StringCalculatorKata;

public class StringCalculator {

	public String prompt;
	
	public StringCalculator() {
		
	}

	public void add(String value) {
		String[] recValues = value.split("[^0-9]");
		if(recValues.length == 0)
			prompt = "0";
	}
}
