package cz.ss;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {

	public int checkProperlyNestedBrackets(String inspectedString) {
		int result = 0;

		Deque<Character> stack = new ArrayDeque<>();

		for(int i = 0; i < inspectedString.length();i++){
			stack.addFirst(inspectedString.charAt(i));
			if(!checkStackValidity(stack)){
				return 0;
			}
		}

		if (stack.isEmpty()){
			result = 1;
		}

		return result;
	}

	private boolean checkStackValidity(Deque<Character> stack) {
		boolean roundBracketsCheck = checkBracketsClosure('(', ')', stack);
		boolean squareBracketsCheck = checkBracketsClosure('[', ']', stack);
		boolean curlyBracketsCheck = checkBracketsClosure('{', '}', stack);

		return roundBracketsCheck && squareBracketsCheck && curlyBracketsCheck;
	}

	private boolean checkBracketsClosure(char left, char right, Deque<Character> stack) {
		if(!stack.isEmpty()){
			if(stack.peekFirst() == right){
				stack.removeFirst();
				if (stack.isEmpty()){
					return false;
				}
				if(stack.peekFirst() == left){
					stack.removeFirst();
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
