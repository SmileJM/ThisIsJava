package chap11.pro.ex08;

import java.util.StringTokenizer;

public class SplitEx {
	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		
		String[] newStr = str.split(",");
		for(String s : newStr) {
			System.out.println(s);
		}
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
