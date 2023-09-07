package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class Readlines {

	public static void main(String[] args) {
		
		int line=0;
		try {
			FileReader fr=new FileReader("//home//chandhru//Desktop//FILE i o//DEF.txt");
			BufferedReader br=new BufferedReader(fr);
			while(br.ready()) {
				//System.out.println(br.readLine());
				br.readLine();
				line++;
		}
		}
		catch(Exception e) {
			System.out.println("check code");
		}
		System.out.println(line);
}
	}