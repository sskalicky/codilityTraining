package cz.ss;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermCheckTest {
	private PermCheck permCheck;

	private int[] elements;
	private int permutation;

	@Before
	public void init(){
		this.permCheck = new PermCheck();
	}


	@Test
	public void permCheckCodilityTestPositive(){
		givenElementsArrayOfValue(new int[]{4,1,3, 2});
		whenCheckingPermArray();
		thenTheResultShouldBe(1);
	}

	@Test
	public void permCheckCodilityTestNegative(){
		givenElementsArrayOfValue(new int[]{4,1,3});
		whenCheckingPermArray();
		thenTheResultShouldBe(0);
	}

	@Test
	public void permCheckOf2ElementsArrayWithPositiveResult(){
		givenElementsArrayOfValue(new int[]{1,2});
		whenCheckingPermArray();
		thenTheResultShouldBe(1);
	}

	@Test
	public void permCheckOf2ElementsArrayOfIdenticalValuesWithNegativeResult(){
		givenElementsArrayOfValue(new int[]{2,2});
		whenCheckingPermArray();
		thenTheResultShouldBe(0);
	}

	@Test
	public void permCheckOf2ElementsArrayContainingOutOfRangeValueWithNegativeResult(){
		givenElementsArrayOfValue(new int[]{1,3});
		whenCheckingPermArray();
		thenTheResultShouldBe(0);
	}

	@Test
	public void permCheckOf1ElementArrayContainingOutOfRangeValueWithNegativeResult(){
		givenElementsArrayOfValue(new int[]{3});
		whenCheckingPermArray();
		thenTheResultShouldBe(0);
	}

	@Test
	public void permCheckOf1ElementArrayWithPositiveResult(){
		givenElementsArrayOfValue(new int[]{1});
		whenCheckingPermArray();
		thenTheResultShouldBe(1);
	}

	private void givenElementsArrayOfValue(int[] elements) {
		this.elements = elements;
	}

	private void whenCheckingPermArray() {
		this.permutation = permCheck.checkArrayPermutation(elements);
	}

	private void thenTheResultShouldBe(int result) {
		assertEquals(result, this.permutation);
	}
}
