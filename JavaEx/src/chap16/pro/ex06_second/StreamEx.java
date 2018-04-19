package chap16.pro.ex06_second;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class StreamEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("±èÁö¹Î", 30),
			new Member("¼Õ¿À°ø", 28),
			new Member("º£ÁöÅÍ", 27)
		);
		
		double avg = list.stream()
		.mapToInt(member -> member.getAge())
		.average().getAsDouble();
//		.mapToInt(new ToIntFunction<Member>() {
//			public int applyAsInt(Member member) {
//				return member.getAge();
//			};
//		}).average().getAsDouble();
		
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
