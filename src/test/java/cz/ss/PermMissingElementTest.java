package cz.ss;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermMissingElementTest {
	private PermMissingElement permMissingElement;

	private int[] elements;
	private int missingElement;

	@Before
	public void init(){
		permMissingElement = new PermMissingElement();
	}

	@Test
	public void findMissingElementInArrayOf4Elements(){
		givenElementsArrayOfValue(new int[] {2, 3, 1, 5});
		whenSearchingForMissingElement();
		thenTheResultShouldBe(4);
	}

	@Test
	public void findMissingElementInArrayOf5Elements(){
		givenElementsArrayOfValue(new int[] {2, 3, 1, 5, 4});
		whenSearchingForMissingElement();
		thenTheResultShouldBe(6);
	}

	@Test
	public void findMissingElementInArrayOfHighAmountOfElements(){
		givenElementsArrayOfElementCountAndElementValue1Missing(100000);
		whenSearchingForMissingElement();
		thenTheResultShouldBe(1);
	}

	@Test
	public void findMissingElementInArrayOf0Elements(){
		givenElementsArrayOfValue(new int[] {});
		whenSearchingForMissingElement();
		thenTheResultShouldBe(1);
	}

	private void givenElementsArrayOfValue(int[] elements) {
		this.elements = elements;
	}

	/**
	 * fills this.elmement array with values  1 ... elementsCount
	 * @param elementsCount
	 */
	private void givenElementsArrayOfElementCountAndElementValue1Missing(int elementsCount) {
		int actualElementValue = 2;
		this.elements = new int[elementsCount];

		for(int i = 0; i < this.elements.length; i++){
			this.elements[i] = actualElementValue++;
		}
	}

	private void whenSearchingForMissingElement() {
		this.missingElement = permMissingElement.findMissingElement(elements, elements.length);
	}

	private void thenTheResultShouldBe(int result) {
		assertEquals(result, this.missingElement);
	}

}
