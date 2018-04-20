package chap18.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File dir1 = new File("e://Temp//Test");
		File file1 = new File("e://Temp//Test//sh.png");
		File file2 = new File("e://Temp//Test//me.txt");
		
		if(!dir1.exists()) {
			dir1.mkdirs();
			System.out.println("���丮 ����");
		}
		
		if(!file1.exists()) {
			file1.createNewFile();
			System.out.println("����1 ����");
		}

		if(!file2.exists()) {
			file2.createNewFile();
			System.out.println("����2 ����");
		}
		
		File file3 = new File("e://Temp//sh.png");
		FileInputStream fis = new FileInputStream(file3);
		byte[] bytes = new byte[100];
		int readBytes = 0;
		
		FileOutputStream fos = new FileOutputStream(file1);
		while(true) {
			readBytes = fis.read(bytes);
			if(readBytes == -1) {
				break;
			}
			fos.write(bytes, 0, readBytes);
		}	

		fos.flush();
		fos.close();
		fis.close();
		
		fis = new FileInputStream("e://Temp//me.txt");
		fos = new FileOutputStream("e://Temp//Test//me.txt");
		
		while(true) {
			readBytes = fis.read(bytes);
			if(readBytes == -1) {
				break;
			}
			fos.write(bytes, 0, readBytes);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("���� �Ϸ�!!");
	}

}
