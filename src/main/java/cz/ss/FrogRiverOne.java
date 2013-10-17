package cz.ss;

public class FrogRiverOne {

	public int findEarliestCrossingTime(int leavingPosition, int[] fallingLeaves) {
		int[] leavesPositionCount = new int[leavingPosition + 1];
		int unmarkedPositions = leavingPosition;

		if(fallingLeaves.length < leavingPosition){
			return -1;
		}

		for(int i = 0; i < fallingLeaves.length; i++){
			if(leavesPositionCount[fallingLeaves[i]] == 0){
				unmarkedPositions--;
			}
			leavesPositionCount[fallingLeaves[i]] += 1;

			if(unmarkedPositions == 0){
				return i;
			}
		}
		return -1;
	}
}
