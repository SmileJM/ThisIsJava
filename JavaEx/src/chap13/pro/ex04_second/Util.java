package chap13.pro.ex04_second;

public class Util {	
	public static <K, V> V getValue(Pair<K, V> pair, K k) {
		if(pair.getKey() == k) {
			return pair.getValue();
		}
		return null;
	}
}
