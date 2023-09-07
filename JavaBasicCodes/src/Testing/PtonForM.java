package Testing;

public class PtonForM {

	public static void main(String[] args) {
		// Manual testing
//		int x=10;
//		for(int i=1;i<=x;i++) {
//			System.out.println(i);
//		}
		//Automation testing
		long starttime=System.currentTimeMillis();
int x=10000000;
for(int i=1;i<=x;i++) {
	System.out.println(i);
}
long endtime=System.currentTimeMillis();
	}

}
