package FileHandling;

import java.io.File;

public class LearnFile {

	public static void main(String[] args) {
File f = new File("/home/chandhru/Documents/chan.txt");
System.out.println(f.canExecute());
System.out.println(f.canRead());
System.out.println(f.canWrite());
System.out.println(f.isFile());
System.out.println(f.isDirectory());


File ff= new File("/home/chandhru/Documents/chanFloder");
System.out.println(ff.mkdir());
	}

}

