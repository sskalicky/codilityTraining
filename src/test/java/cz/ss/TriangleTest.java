package cz.ss;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
	private Triangle triangle;

	private int[] elements;
	private int result;

	@Before
	public void init(){
		this.triangle = new Triangle();
	}

	@Test
	public void triangularCheckCodilityPositive(){
		givenElementsArrayOfValue(new int[]{10, 2, 5, 1, 8, 20});
		whenLookingForEarliestCrossingTime();
		thenTheResultShouldBe(1);
	}

	@Test
	public void triangularCheckCodilityNegative(){
		givenElementsArrayOfValue(new int[]{10, 50, 5, 1});
		whenLookingForEarliestCrossingTime();
		thenTheResultShouldBe(0);
	}

	private void givenElementsArrayOfValue(int[] elements) {
		this.elements = elements;
	}

	private void whenLookingForEarliestCrossingTime() {
		this.result = triangle.checkTriangularTripletExists(this.elements);
	}

	private void thenTheResultShouldBe(int result) {
		assertEquals(result, this.result);
	}

}
