package vaibhao.vk;

import java.io.*;
public class FileHandlingApplication1 {
	public static void main(String[] args) {
		/*File f = new File("D:\\OCT2022\\JAVA\\resume");
		boolean b1 = f.exists();
		if (f.exists()) {
			System.out.println("folder already exist");
		} else {
			boolean b = f.mkdir();
			if (b) {
				System.out.println("Folder created ");
			} else {
				System.out.println("Some problem is there..........");
			}
		}*/
		System.out.println(new File("D:\\NOTES FOR LANGUAGE\\COURSE").exists()?"folder already exist":new File("D:\\OCT2022\\JAVA\\resume12344445").mkdir() ? "Folder created ":"Some problem is there..........");
	}
}
