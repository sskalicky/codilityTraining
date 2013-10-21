package cz.ss;

import java.util.HashSet;
import java.util.Set;

public class DistinctDigits {
	public int countDistinctDigits(int input) {
		Set<Integer> digits = new HashSet<Integer>();

		while(input != 0){
			int digit = input % 10;
			digits.add(digit);
			input /= 10;
		}

		return digits.size();
	}
}
