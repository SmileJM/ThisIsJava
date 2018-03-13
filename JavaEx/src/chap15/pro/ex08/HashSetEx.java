package chap15.pro.ex08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "�տ���"));
		set.add(new Student(2, "������"));
		set.add(new Student(1, "���ݷ�"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ": " + student.name);
		}
	}

}
