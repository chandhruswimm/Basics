package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadContentexr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileReader fr=new FileReader("//home//chandhru//Desktop//java code//Test.java");
	BufferedReader br=new BufferedReader(fr);
	while(br.ready()) {
		System.out.println(br.readLine());
	}
	br.close();
}
	catch(IOException e){
		System.out.println("check code");
	}
}
}
