package chap16.pro.ex06;

import java.util.Arrays;
import java.util.List;

public class StreamEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("±èÁö¹Î", 30),
			new Member("¼Õ¿À°ø", 28),
			new Member("º£ÁöÅÍ", 27)
		);
		
		double avg = list.stream()
				.mapToInt(m -> m.getAge())
				.average()
				.getAsDouble();
		
		System.out.println("Æò±Õ³ªÀÌ: " + avg);
	}
	
	static class Member {
		private String name;
		private int age;
		
		public Member(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}		
	}
}
