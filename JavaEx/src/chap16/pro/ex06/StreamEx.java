package chap16.pro.ex06;

import java.util.Arrays;
import java.util.List;

public class StreamEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("������", 30),
			new Member("�տ���", 28),
			new Member("������", 27)
		);
		
		double avg = list.stream()
				.mapToInt(m -> m.getAge())
				.average()
				.getAsDouble();
		
		System.out.println("��ճ���: " + avg);
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
