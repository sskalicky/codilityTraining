package cz.ss;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeEquilibriumTest {
	private int[] tapeArray;
	private int minimalDifference;

	private TapeEquilibrium tapeEquilibrium;

	@Before
	public void init(){
		tapeEquilibrium = new TapeEquilibrium();
	}

	@Test
	public void findMinimalDifferenceInTapeOf2Elements(){
		givenElementsArrayOfValue(new int[] {1,3});
		whenSearchingForMissingElement();
		thenTheResultShouldBe(2);
	}

	@Test
	public void findMinimalDifferenceInTapeOf2ElementsNegative(){
		givenElementsArrayOfValue(new int[] {-2000,0});
		whenSearchingForMissingElement();
		thenTheResultShouldBe(2000);
	}

	@Test
	public void findMinimalDifferenceInTapeOf2ElementsOf0Values(){
		givenElementsArrayOfValue(new int[] {0,0});
		whenSearchingForMissingElement();
		thenTheResultShouldBe(0);
	}

	@Test
	public void findMinimalDifferenceInTapeOf5Elements(){
		givenElementsArrayOfValue(new int[] {3,1,2,4,3});
		whenSearchingForMissingElement();
		thenTheResultShouldBe(1);
	}

	@Test
	public void findMinimalDifferenceInTapeOf5NegativeElements(){
		givenElementsArrayOfValue(new int[] {-3,-1,-2,-4,-3});
		whenSearchingForMissingElement();
		thenTheResultShouldBe(1);
	}

	@Test
	public void findMinimalDifferenceInTapeOf4Elements(){
		givenElementsArrayOfValue(new int[] {3,1,2,2});
		whenSearchingForMissingElement();
		thenTheResultShouldBe(0);
	}

	private void givenElementsArrayOfValue(int[] tape) {
		this.tapeArray = tape;
	}

	private void whenSearchingForMissingElement() {
		this.minimalDifference = tapeEquilibrium.findMinimalDifference(tapeArray);
	}

	private void thenTheResultShouldBe(int result) {
		assertEquals(result, this.minimalDifference);
	}
}
