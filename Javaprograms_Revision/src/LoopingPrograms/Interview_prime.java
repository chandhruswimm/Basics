package LoopingPrograms;

public class Interview_prime {

	public static void main(String[] args) {
		
		int div=2;
		//int count=0;
		for(int no=3;no<=4;no++) {
		while(div<=no) {
			
			if(no%div==0) {
				System.out.println("No");
				//count++;
				break;
			}
			if(no%div==1) {
				System.out.println("yes");
				//count++;
				break;
			}
			div++;
		}
	}
	}
}
