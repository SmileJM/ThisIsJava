package chap18.ex;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("e://Temp//me.txt");
		char[] chars = new char[100];
		int readCharNo = 0;
		while(true) {
			readCharNo = fr.read(chars);
			if(readCharNo == -1) {
				break;
			}
			String data = new String(chars, 0, readCharNo);		
			System.out.println(data);
		}
		fr.close();
	}

}
