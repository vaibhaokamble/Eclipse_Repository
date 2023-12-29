package vaibhao.vk;

import java.io.File;

public class FileHandlingApplication2 {
	public static void main(String[] args) {
		/*File f = new File("D:\\OCT2022\\JAVA\\resume");
		boolean b=f.isDirectory();
		 if(b) {
			 System.out.println("path is folder");
		 }
		 else {
			 System.out.println("path is not folder");
		 }*/
System.out.println(new File("D:\\NOTES FOR LANGUAGE\\COURSE").isDirectory()?"path is folder":"path is not folder");
	   }
}
