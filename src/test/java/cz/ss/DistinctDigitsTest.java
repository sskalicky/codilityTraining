package cz.ss;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistinctDigitsTest {

	private DistinctDigits distinctDigits;

	private int input;
	private int result;

	@Before
	public void init(){
		this.distinctDigits = new DistinctDigits();
	}

	@Test
	public void distinctDigitsCodilityTest1(){
		givenInputNumberOfValue(1519);
		whenCountingDistinctDigits();
		thenTheResultShouldBe(3);
	}

	@Test
	public void distinctDigitsCodilityTest2(){
		givenInputNumberOfValue(222);
		whenCountingDistinctDigits();
		thenTheResultShouldBe(1);
	}

	@Test
	public void distinctDigitsMaxTest(){
		givenInputNumberOfValue(2147483647);
		whenCountingDistinctDigits();
		thenTheResultShouldBe(7);
	}

	@Test
	public void distinctDigitsMinTest(){
		givenInputNumberOfValue(-2147483648);
		whenCountingDistinctDigits();
		thenTheResultShouldBe(7);
	}

	@Test
	 public void distinctDigitsLeading0Test(){
		givenInputNumberOfValue(11233);
		whenCountingDistinctDigits();
		thenTheResultShouldBe(3);
	}

	@Test
	public void distinctDigitsIncl0Test(){
		givenInputNumberOfValue(1120033);
		whenCountingDistinctDigits();
		thenTheResultShouldBe(4);
	}

	private void givenInputNumberOfValue(int input) {
		this.input = input;
	}

	private void whenCountingDistinctDigits() {
		this.result = distinctDigits.countDistinctDigits(this.input);
	}

	private void thenTheResultShouldBe(int result) {
		assertEquals(result, this.result);
	}
}
