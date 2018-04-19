package chap04.pro.ex07;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ�  | 4.����");
			System.out.println("-----------------------------");
			System.out.print("����] ");
			int select = scanner.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("���ݾ�] ");
				balance+=scanner.nextInt();
				break;
			case 2:
				System.out.print("��ݾ�] ");
				int money = scanner.nextInt();
				if(balance < money) {
					System.out.println("�ܰ����");
				} else {
					balance -= money;
				}				
				break;
			case 3:
				System.out.println("�ܰ�] " + balance);				
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
			
		}
		System.out.println("���α׷� ����");
	}
}
