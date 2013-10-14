package cz.ss;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJumpTest {

	FrogJump frogJump;
	private int startPoint;
	private int endPoint;
	private int jumpDistance;

	private int minimalJumpsCount;

	@Before
	public void init(){
		frogJump = new FrogJump();
	}

	@Test
	public void canCalculateMinimalNumberOfJumps(){
		giveStartPointValueOf(10);
		givenEndPointValueOf(85);
		givenJumpDistanceValueOf(30);

		whenCalculatingMinimalNumberOfJumps();

		thenTheResultShouldBe(3);
	}

	@Test
	public void canCalculateExactMinimalNumberOfJumps(){
		giveStartPointValueOf(5);
		givenEndPointValueOf(85);
		givenJumpDistanceValueOf(20);

		whenCalculatingMinimalNumberOfJumps();

		thenTheResultShouldBe(4);
	}

	@Test
	public void canCalculateLongJump(){
		giveStartPointValueOf(5);
		givenEndPointValueOf(25);
		givenJumpDistanceValueOf(100);

		whenCalculatingMinimalNumberOfJumps();

		thenTheResultShouldBe(1);
	}

	@Test
	public void canCalculateMinimalNumberOfJumpsHighValues(){
		giveStartPointValueOf(1);
		givenEndPointValueOf(1000000000);
		givenJumpDistanceValueOf(1);

		whenCalculatingMinimalNumberOfJumps();

		thenTheResultShouldBe(999999999);
	}

	private void giveStartPointValueOf(int startPoint) {
		this.startPoint = startPoint;
	}

	private void givenEndPointValueOf(int endPoint) {
		this.endPoint = endPoint;
	}

	private void givenJumpDistanceValueOf(int jumpDistance) {
		this.jumpDistance = jumpDistance;
	}

	private void whenCalculatingMinimalNumberOfJumps() {
		this.minimalJumpsCount = frogJump.calculateMinimalNumberOfSteps(this.startPoint, this.endPoint, this.jumpDistance);
	}

	private void thenTheResultShouldBe(int result) {
		assertEquals(result, this.minimalJumpsCount);
	}
}
