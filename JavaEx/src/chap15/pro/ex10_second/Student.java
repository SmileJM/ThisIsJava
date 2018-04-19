package chap15.pro.ex10_second;

public class Student implements Comparable<Student> {
	public String id;
	public int score;
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}

	@Override
	public int compareTo(Student stu) {
		if(stu.score > score) {
			return -1;
		} else if( stu.score < score) {
			return 1;			
		} else {
			return 0;
		}
	}

	
}
