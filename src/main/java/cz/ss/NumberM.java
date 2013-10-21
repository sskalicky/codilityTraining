package cz.ss;

import java.util.Arrays;

public class NumberM {
	public int calculate(int[] elements) {
		long result = 0;

		for(int i = 0; i < elements.length; i++){
			result += Math.pow(-2, elements[i]);
		}

		if(Math.abs(result) > 10000000){
			return -1;
		} else {
			return (int)result;
		}
	}
}