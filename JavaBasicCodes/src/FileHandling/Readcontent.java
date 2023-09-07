package FileHandling;                // how much lowercase is present in paragraph

import java.io.FileReader;
import java.io.IOException;

public class Readcontent {

	public static void main(String[] args) {
		String s="";
		int count =0;
		try {
		FileReader fr=new FileReader("/home/chandhru/Desktop/FILE i o/ABC.txt");
		int i=0;
		s=s+(char)i;
		while((i=fr.read())!=-1) {
			if(i>='a' && i<='z')
			//System.out.println((char)i+"---->"+i);
		
			count +=1;
		}
	}
catch(IOException e){
	//e.printStackTrace();
	System.out.println("check code");
	//System.out.println(e);
}
		System.out.println(s);
		System.out.println(count);
	}

}
   