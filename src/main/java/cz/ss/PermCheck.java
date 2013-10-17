package cz.ss;

public class PermCheck {
	public int checkArrayPermutation(int[] elements) {
		int[] countArray = new int[elements.length + 1];

		for(int i=0; i < elements.length; i++){
			if(elements[i] > elements.length || elements[i] < 1){
				return 0;
			}

			countArray[elements[i]] += 1;
		}

		for(int i = 1; i < countArray.length; i++){
			if(countArray[i] != 1){
				return 0;
			}
		}

		return 1;
	}
}
