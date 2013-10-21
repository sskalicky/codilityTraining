package cz.ss;

public class Division {

	public int countDivisibleNumbers(int a, int b, int k) {
		int result = 0;

		if(a % k == 0 || b % k == 0){
			result++;
		}

		int diff = b - a;
		result += diff / k;

		return result;
	}
}
