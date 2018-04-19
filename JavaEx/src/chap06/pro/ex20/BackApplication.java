package chap06.pro.ex20;

import java.util.Scanner;

public class BackApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.�������� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("����]: ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accoutList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}			
		}
		System.out.println("���α׷� ����");
	}

	private static void withdraw() {		
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine(); 
		System.out.print("��ݾ�: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		if(account != null) {
			if( account.getBalance() >= balance) {
				account.setBalance(account.getBalance() - balance);
				System.out.println("���: ����� �����Ǿ����ϴ�.");	
			} else {
				System.out.println("���: �ܾ��� �����մϴ�.");
			}
			
		} else {
			System.out.println("���: ��ġ�ϴ� ���°� �����ϴ�.");
		}	
	}

	private static void deposit() {
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine(); 
		System.out.print("���ݾ�: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		if(account != null) {
			account.setBalance(account.getBalance() + balance);
			System.out.println("���: ������ �����Ǿ����ϴ�.");
		} else {
			System.out.println("���: ��ġ�ϴ� ���°� �����ϴ�.");
		}		
	}

	private static void accoutList() {
		System.out.println("------");
		System.out.println("���¸��");
		System.out.println("------");
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			} else {
				break;
			}
		}
	}

	private static void createAccount() {
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine(); 
		System.out.print("������: ");
		String owner = scanner.nextLine(); 
		System.out.print("�ʱ��Աݾ�: ");
		int balance = Integer.parseInt(scanner.nextLine()); 
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			} else if(accountArray[i].getAno().equals(ano)) {
				System.out.println("���: ������ ���¹�ȣ�� �ֽ��ϴ�.");
				break;
			}
		}		
	}
	
	private static Account findAccount(String ano) {
		Account account = null;;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				break;
			} else 	if(accountArray[i].getAno().equals(ano)) {
				account = accountArray[i];
				break;
			}
		}
		return account;
	}

}
