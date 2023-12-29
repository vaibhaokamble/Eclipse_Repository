package vaibhao.vk;

import java.io.*;
public class FileHandlingApplication3 {
	public static void main(String[] args)throws IOException {
		/*File f = new File("D:\\NOTES FOR LANGUAGE\\COURSE\\test.doc");
		 boolean b =f.createNewFile();
		 if(b) {
			 System.out.println("File Created");
		 }
		 else {
			 System.out.println("Some problem............");
		 }*/
System.out.println((new File("D:\\\\NOTES FOR LANGUAGE\\\\COURSE\\test.doc").createNewFile())?"File Created":"Some problem............");
	   }
}
