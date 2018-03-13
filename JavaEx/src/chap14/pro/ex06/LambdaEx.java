package chap14.pro.ex06;

import java.util.function.ToIntFunction;

public class LambdaEx {
	private static Student[] students = {
			new Student("������", 100, 96),
			new Student("������2", 80, 99)
	};
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : students) {
			sum += function.applyAsInt(student);
		}
		double avg = sum / students.length;
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore());
		System.out.println("����  ��� ����: " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore());
		System.out.println("����  ��� ����: " + mathAvg);

	}
	
	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		public String getName() {
			return name;
		}
		public int getEnglishScore() {
			return englishScore;
		}
		public int getMathScore() {
			return mathScore;
		}
		
		
	}

}
