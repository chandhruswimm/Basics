package Testing;

public class PTonStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long starttime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("java");
		for(int i=1;i<1000000;i++) {
			sb.append("Program");
		}
		long endtime=System.currentTimeMillis();
System.out.println(endtime-starttime+"Mc");
	}

}
