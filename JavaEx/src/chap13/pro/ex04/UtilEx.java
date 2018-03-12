package chap13.pro.ex04;

public class UtilEx {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("梯雖團", 100);
		Integer score = Util.getValue(pair,"梯雖團");
		System.out.println(score);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("梯雖團", 200);
		score = Util.getValue(childPair,"梯雖團2");
		System.out.println(score);
		
//		OtherPair<String, Integer> otherPair = new OtherPair<>("梯雖團3", 300);
//		score = Util.getValue(otherPair,"梯雖團3");
//		System.out.println(score);
		
	}

}
