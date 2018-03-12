package chap09;

public class NestedClassEx {
	int filed;
	
	void method1(int value) {
		int localValue = 10;
		localValue = 20;
		value = 30;
		
		CalculatableInterface ci = new CalculatableInterface() {			
			@Override
			public int sum() {
//				int result = value + localValue;
				return 0;
			}
		};
	}
}
