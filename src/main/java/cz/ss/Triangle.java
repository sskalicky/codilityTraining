package cz.ss;

import java.util.Arrays;

public class Triangle {
	public int checkTriangularTripletExists(int[] elements) {
		Arrays.sort(elements);
		for(int i = 0; i < elements.length; i++){
			int p = i;
			int q = i+1;
			int r = i+2;
			if(r < elements.length){
				if(elements[p] + elements[q] > elements[r]){
					return 1;
				}
			} else {
				break;
			}
		}
		return 0;
	}
}
