package chap13.pro.ex04;

public class UtilEx {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("������", 100);
		Integer score = Util.getValue(pair,"������");
		System.out.println(score);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("������", 200);
		score = Util.getValue(childPair,"������2");
		System.out.println(score);
		
//		OtherPair<String, Integer> otherPair = new OtherPair<>("������3", 300);
//		score = Util.getValue(otherPair,"������3");
//		System.out.println(score);
		
	}

}
