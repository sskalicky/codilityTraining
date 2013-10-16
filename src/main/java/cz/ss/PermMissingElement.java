package cz.ss;

public class PermMissingElement {
	public int findMissingElement(int[] elements, int elementsLength) {
		if (elementsLength == 0){
			throw new NoMissingElementException();
		}

		int possibleSumOfAllElements = (elementsLength + 2) * (elementsLength + 1) / 2;
		int result = possibleSumOfAllElements;
		for(int i = 0; i < elementsLength; i++){
			result -= elements[i];
		}

		return result;
	}
}
