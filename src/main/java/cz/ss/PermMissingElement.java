package cz.ss;

import java.math.BigDecimal;

public class PermMissingElement {
	public int findMissingElement(int[] elements, int elementsLength) {
		int possibleSumOfAllElements = (elementsLength + 2) * (elementsLength + 1) / 2;
		BigDecimal result = new BigDecimal(possibleSumOfAllElements);
		for(int i = 0; i < elementsLength; i++){
			result = result.subtract(BigDecimal.valueOf(elements[i]));
		}

		return result.intValue();
	}
}
