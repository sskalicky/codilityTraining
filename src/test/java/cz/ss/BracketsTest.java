package cz.ss;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BracketsTest {
	private Brackets brackets;

	private String inspectedString;
	private int result;

	@Before
	public void init(){
		brackets = new Brackets();
	}

	@Test
	public void bracketsProperlyNestedCodilityPositiveTest(){
		givenInspectedStringOfValue("{[()()]}");
		whenCheckingTheBracketsAreProperlyNested();
		thenTheResultShouldBe(1);
	}

	@Test
	public void bracketsProperlyNestedCodilityNegativeTest(){
		givenInspectedStringOfValue("([)()]");
		whenCheckingTheBracketsAreProperlyNested();
		thenTheResultShouldBe(0);
	}

	@Test
	public void bracketsProperlyNestedEmptyStringTest(){
		givenInspectedStringOfValue("");
		whenCheckingTheBracketsAreProperlyNested();
		thenTheResultShouldBe(1);
	}

	@Test
	public void bracketsProperlyNestedFirstRightBracketTest(){
		givenInspectedStringOfValue("}(){");
		whenCheckingTheBracketsAreProperlyNested();
		thenTheResultShouldBe(0);
	}

	@Test
	public void bracketsProperlyNestedNegativeTest(){
		givenInspectedStringOfValue("()]{");
		whenCheckingTheBracketsAreProperlyNested();
		thenTheResultShouldBe(0);
	}


	private void givenInspectedStringOfValue(String inspectedString) {
		this.inspectedString = inspectedString;
	}

	private void whenCheckingTheBracketsAreProperlyNested() {
		this.result = brackets.checkProperlyNestedBrackets(this.inspectedString);
	}

	private void thenTheResultShouldBe(int result) {
		assertEquals(result, this.result);
	}

}
