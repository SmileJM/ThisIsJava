package chap18.ex;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample2 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		byte[] bytes = new byte[100];
		
		System.out.print("누구? ");
		
		int readBytes = is.read(bytes);
		String name = new String(bytes, 0 , readBytes-2);
		System.out.println(name  + " 좋아해");		
	}
}
