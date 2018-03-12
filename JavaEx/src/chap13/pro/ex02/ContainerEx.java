package chap13.pro.ex02;

public class ContainerEx {

	public static void main(String[] args) {
		Container<String> container1 = new Container<>();
		container1.set("±èÁö¹Î");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<>();
		container2.set(6);
		int value = container2.get();
		
		System.out.println(str);
		System.out.println(value);
	}
}
