package StringCalculatorKata;

public class StringCalculator {

	public String prompt;
	
	public StringCalculator() {
		prompt = "0";
		
	}

	public void add(String string) {
		String[] recValues = string.split("[^0-9]");
		int value = 0;
		//System.out.println(recValues.length);
		if(recValues.length == 1)
		{
			if(recValues[0] == "")
				prompt = "0";
			else
			{
				value = Integer.parseInt(recValues[0]);
				prompt = Integer.toString(value);
			}
			//System.out.println("in 0");
		}
		else
		{
			for(int i = 0; i < recValues.length; i++)
			{
				value += Integer.parseInt(recValues[i]);
			}
			prompt = Integer.toString(value);
			System.out.println("in default");
		}
	}
}
