package cz.ss;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberMTest {
	private NumberM numberM;

	private int[] elements;
	private int result;

	@Before
	public void init(){
		this.numberM = new NumberM();
	}

	@Test
	public void numberMTest1(){
		givenElementsArrayOfValue(new int[]{5, 4, 7});
		whenCalculatingNumberM();
		thenTheResultShouldBe(-144);
	}

	@Test
	public void numberMTest2(){
		givenElementsArrayOfValue(new int[]{51, 50});
		whenCalculatingNumberM();
		thenTheResultShouldBe(-1);
	}

	@Test
	public void numberMTest3(){
		givenElementsArrayOfValue(new int[]{4, 50});
		whenCalculatingNumberM();
		thenTheResultShouldBe(-1);
	}

	@Test
	public void numberMTest4(){
		givenElementsArrayOfValue(new int[]{4, 1000000000});
		whenCalculatingNumberM();
		thenTheResultShouldBe(-1);
	}

	@Test
	public void numberMTest5(){
		givenElementsArrayOfValue(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000});
		whenCalculatingNumberM();
		thenTheResultShouldBe(-1);
	}

	private void givenElementsArrayOfValue(int[] elements) {
		this.elements = elements;
	}

	private void whenCalculatingNumberM() {
		this.result = numberM.calculate(this.elements);
	}

	private void thenTheResultShouldBe(int result) {
		assertEquals(result, this.result);
	}

}
