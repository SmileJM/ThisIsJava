package chap16.pro.ex07_second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("김지민", "개발자"),
			new Member("손오공", "개발자"),
			new Member("베지터", "무도가")
		);
		
		List<Member> developers = list.stream()
				.filter(t ->t.getJob().equals("개발자"))					
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
