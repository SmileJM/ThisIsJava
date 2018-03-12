package chap13.pro.ex03;

public class ContainerEx {

	public static void main(String[] args) {
		Container<String, String> container1 = new Container<>();
		container1.set("±èÁö¹Î", "ÇĞ»ı");
		String name1 = container1.getKey(); 
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<>();
		container2.set("±èÁö¹Î", 100);
		String name2 = container2.getKey(); 
		int score = container2.getValue(); 
				
		System.out.println(name1 + ": " + job);
		System.out.println(name2 + ": " + score);		
	}
}
