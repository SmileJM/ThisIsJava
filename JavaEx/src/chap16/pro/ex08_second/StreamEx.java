package chap16.pro.ex08_second;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("김지민", "개발자"),
			new Member("손오공", "개발자"),
			new Member("베지터", "기획자")
		);
		
		Map<String, List<String>> groupingMap = list.stream()
				.collect(Collectors.groupingBy(Member::getJob,
						Collectors.mapping(Member::getName, 
						Collectors.toList())));		
		
		System.out.print("[개발자] ");
		groupingMap.get("개발자").stream().forEach(n -> System.out.print(n + " "));
		
		System.out.print("\n[기획자] ");
		groupingMap.get("기획자").stream().forEach(n -> System.out.print(n + " "));
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
