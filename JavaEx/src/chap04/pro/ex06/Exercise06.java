package chap04.pro.ex06;

public class Exercise06 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");	
			}			
			System.out.println();
		}
	}
}
