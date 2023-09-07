package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writecontentexr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
FileWriter fw=new FileWriter("//home//chandhru//Desktop//JAVA//homework.java");
BufferedWriter bw=new BufferedWriter(fw);
bw.write("public class Awesome"+"\n");
bw.write("{"+"\n");
bw.write("public static void main ( )"+"\n");
bw.write("{"+"\n");
bw.write("System.out.println"+"(\"Awesome\");"+"\n");
bw.write("}"+"\n");
bw.write("}"+"\n");
bw.flush();
bw.close();
fw.close();
}
		catch(IOException e){
			System.out.println("check code");
		}
	}
}
