package chap15.pro.ex10_second;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();
		treeSet.add(new Student("I", 89));
		treeSet.add(new Student("love", 96));
		treeSet.add(new Student("you", 93));
		
		Student student = treeSet.last();
		System.out.println("�ְ�����: " + student.score);
		System.out.println("�ְ������� ���� ���̵�: " + student.id);
	}
}
