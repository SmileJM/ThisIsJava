package chap15.pro.ex10;

public class Student implements Comparable<Student> {
	public String id;
	public int score;
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}

	@Override
	public int compareTo(Student student) {
		int result = -1;
		if(student.score > score) {
			result = -1;
		} else if(student.score == score) {
			result = 0;			
		} else {
			result = 1;
		}
		return result;
	}	
}
