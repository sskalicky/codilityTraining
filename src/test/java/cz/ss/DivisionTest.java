package cz.ss;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {

	private Division division;

	private int a;
	private int b;
	private int k;
	private int result;

	@Before
	public void init(){
		this.division = new Division();
	}

	@Test
	public void distinctDigitsCodilityTest1(){
		givenInputOfValues(6, 11, 2);
		whenCountingDistinctDigits();
		thenTheResultShouldBe(3);
	}

	@Test
	public void distinctDigitsCodilityTest2(){
		givenInputOfValues(6, 12, 2);
		whenCountingDistinctDigits();
		thenTheResultShouldBe(4);
	}

	@Test
	public void distinctDigitsCodilityTest3(){
		givenInputOfValues(7, 12, 2);
		whenCountingDistinctDigits();
		thenTheResultShouldBe(3);
	}

	private void givenInputOfValues(int a, int b, int k) {
		this.a = a;
		this.b = b;
		this.k = k;
	}

	private void whenCountingDistinctDigits() {
		this.result = division.countDivisibleNumbers(this.a, this.b, this.k);
	}

	private void thenTheResultShouldBe(int result) {
		assertEquals(result, this.result);
	}
}
