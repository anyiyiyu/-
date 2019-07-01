package se.day05;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		File file=new File("log.txt");{
			file.createNewFile();
			System.out.println("创建完毕");
		}

	}

}
