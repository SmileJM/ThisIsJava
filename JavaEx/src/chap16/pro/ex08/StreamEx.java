package chap16.pro.ex08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("������", "������"),
			new Member("�տ���", "������"),
			new Member("������", "��ȹ��")
		);
		
		Map<String, List<String>> groupingMap = list
				.stream()
				.collect(
					Collectors.groupingBy(
						Member::getJob, 
						Collectors.mapping(
								Member::getName, 
								Collectors.toList()
						)
					)
				);
		
		System.out.print("[������] ");
		groupingMap.get("������").stream().forEach(n -> System.out.print(n + " "));
		
		System.out.print("\n[��ȹ��] ");
		groupingMap.get("��ȹ��").stream().forEach(n -> System.out.print(n + " "));
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
