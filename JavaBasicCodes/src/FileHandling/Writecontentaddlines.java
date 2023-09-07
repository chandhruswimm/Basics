package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writecontentaddlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter("/home/chandhru/Desktop/FILE i o/GHI.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Asalt aravindh"+"\n");
			bw.write("compiler chandhru"+"\n");
			bw.write("sambavam saravan"+"\n");
			bw.flush();
			bw.close();
			System.out.println("success");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
