package chap14.pro.ex05_second;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = { 10, 50, 3 };

	public static void main(String[] args) {
		int max = maxOrMin(
			(a, b) -> {
				if(a > b) {
					return a;
				} else {
					return b;
				}
			}
		);
		System.out.println("ÃÖ´ñ°ª: " + max);
		
		int min = maxOrMin(
			(a, b) -> {
				if(a < b) {
					return a;
				} else {
					return b;
				}
			}
		);
		System.out.println("ÃÖ¼Ú°ª: " + min);
	}

	private static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score:scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}


}
