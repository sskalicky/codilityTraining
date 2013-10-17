package cz.ss;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogRiverOneTest {
	private FrogRiverOne frogRiverOne;

	private int[] fallingLeaves;
	private int leavingPosition;
	private int earliestCrossingTime;

	@Before
	public void init(){
		frogRiverOne = new FrogRiverOne();
	}

	@Test
	public void findEarliestCrossingTimeCodilityTest(){
		givenLeavingPosition(5);
		givenFallingLeavesArrayOfValue(new int[] {1, 3, 1, 4, 2, 3, 5 ,4});
		whenLookingForEarliestCrossingTime();
		thenTheResultShouldBe(6);
	}

	@Test
	public void frogNeverCrossesToTheOtherSideTest(){
		givenLeavingPosition(5);
		givenFallingLeavesArrayOfValue(new int[] {1, 3, 1, 4, 2});
		whenLookingForEarliestCrossingTime();
		thenTheResultShouldBe(-1);
	}

	@Test
	public void LowerFallingLeavesCountThanLeavingPositionTest(){
		givenLeavingPosition(5);
		givenFallingLeavesArrayOfValue(new int[] {1, 3, 1});
		whenLookingForEarliestCrossingTime();
		thenTheResultShouldBe(-1);
	}

	@Test
	public void missingLeafInTheMiddleTest(){
		givenLeavingPosition(5);
		givenFallingLeavesArrayOfValue(new int[] {1, 3, 1, 4, 3, 5, 4 });
		whenLookingForEarliestCrossingTime();
		thenTheResultShouldBe(-1);
	}

	@Test
	public void firstLeafAtTheEndTest(){
		givenLeavingPosition(5);
		givenFallingLeavesArrayOfValue(new int[] {2, 3, 4, 3, 5, 5, 4, 1 });
		whenLookingForEarliestCrossingTime();
		thenTheResultShouldBe(7);
	}

	private void givenFallingLeavesArrayOfValue(int[] fallingLeaves) {
		this.fallingLeaves = fallingLeaves;
	}

	private void givenLeavingPosition(int leavingPosition){
		this.leavingPosition = leavingPosition;
	}

	private void whenLookingForEarliestCrossingTime() {
		this.earliestCrossingTime = frogRiverOne.findEarliestCrossingTime(leavingPosition, fallingLeaves);
	}

	private void thenTheResultShouldBe(int result) {
		assertEquals(result, this.earliestCrossingTime);
	}
}
