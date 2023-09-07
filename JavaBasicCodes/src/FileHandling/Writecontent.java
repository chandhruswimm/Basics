package FileHandling;

import java.io.FileWriter;

public class Writecontent {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("/home/chandhru/Desktop/FILE i o/GHI.txt",true);
			String s="java is super cool language";
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}