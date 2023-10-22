package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) {
		FileOperation fo=new FileOperation ();
		fo.mkdir();
		fo.listFiles();
		fo.isfile();
		fo.isDirectory();
		fo.canWrite();
		fo.canExecution();
		fo.canReady();
		fo.createNewFile();
	}

	private void createNewFile() {
		
		try {
			File f=new File("/home/chandhru/Documents/chan.txt");
			f.createNewFile();
			System.out.println("success");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	private void canReady() {
		File f=new File("/home/chandhru/Documents/chan");
		System.out.println(f.canRead());
		
	}

	private void canExecution() {
		File f=new File("/home/chandhru/Documents/chan");
		System.out.println(f.canExecute());
		
	}

	private void canWrite() {
		File f=new File("/home/chandhru/Documents/chan");
		System.out.println(f.canWrite());
		
	}

	private void isDirectory() {
		File f=new File("/home/chandhru/Documents/chan");
		System.out.println(f.isDirectory());
		
	}

	private void isfile() {
		File f=new File("/home/chandhru/Documents/chan");
		System.out.println(f.isFile());
	}

	private void listFiles() {
		File f=new File("/home/chandhru/Downloads");
		File fi[]=f.listFiles();
		for(File i:fi) {
			System.out.println(i);
		}
	}

	private void mkdir() {
		File f=new File("/home/chandhru/Documents//chan");
    	f.mkdir();
    	//System.out.println("success");
	}
}
