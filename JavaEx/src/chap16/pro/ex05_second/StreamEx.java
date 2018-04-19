package chap16.pro.ex05_second;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expression",
				"Java1.8");
		list.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				if(t.toLowerCase().contains("java"))
					return true;
				else return false;
		
			}
		}).forEach(a -> System.out.println(a));

	}

}
