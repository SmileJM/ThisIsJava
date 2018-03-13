package chap15.pro.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 9);
		map.put("love", 87);
		map.put("you", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
						
		Set<String> set = map.keySet();
		for(String key : set) {
			int score =  map.get(key);
			if(maxScore < score) {
				maxScore = score;
				name = key;
			}
			totalScore += score;
		}		
		double avg = (double)totalScore / map.size();		
		
		System.out.println("평균점수: " + avg);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);		
	}
}
