package chap16.pro.ex07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("������", "������"),
			new Member("�տ���", "������"),
			new Member("������", "������")
		);
		
		List<Member> developers = list.stream()
				.filter(m -> m.getJob().equals("������"))
				.collect(Collectors.toList());
		
		developers.stream().forEach(a -> System.out.println(a.getName()));		
	}
	
	static class Member {
		private String name;
		private String job;
		
		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}

		public String getName() {
			return name;
		}

		public String getJob() {
			return job;
		}		
	}
}
