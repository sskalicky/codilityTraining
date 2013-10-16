package cz.ss;

public class TapeEquilibrium {
	public int findMinimalDifference(int[] tapeArray) {
		int totalSum = 0;
		int leftSum = 0;
		int minimalDifference;

		for (int i = 0; i < tapeArray.length; i++){
			totalSum += tapeArray[i];
		}

		minimalDifference = Math.abs(totalSum);
		for(int i=0; i < tapeArray.length; i++){
			leftSum += tapeArray[i];
			int difference = Math.abs(totalSum - (2*leftSum));
			minimalDifference = (minimalDifference > difference) ? difference : minimalDifference;
			if (minimalDifference == 0){
				break;
			}
		}

		return minimalDifference;
	}
}
