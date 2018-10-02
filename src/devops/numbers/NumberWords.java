package devops.numbers;

public class NumberWords {

	public String toWords(int number) {
		String result = "";
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		
		if(number < 0 || number > 999){
			return "Number out of range";
		}
		
		if ((number / 100) > 0) {
			result += toWords(number / 100) + " hundred ";
			number %= 100;
		}

		if (number > 0) {
			if (number < 20) {
				result += unitsArray[number];
			} else {
				result += tensArray[number / 10];
				if ((number % 10) > 0) {
					result += " " +unitsArray[number % 10];
				}
			}
		}
		return result.trim();
	}

}
