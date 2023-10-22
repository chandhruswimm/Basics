package LoopingPrograms;

public class Prime_two_to_twenty {

	public static void main(String[] args) {
		Prime_two_to_twenty pp=new Prime_two_to_twenty();
		int no=2;
		while(no<=20) {
			pp.find_prime(no);
			no++;
		}

	}

	private void find_prime(int no) {
		int count=0;
		for(int div=2;div<=no;div++) {
			if(no%div==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(no);
		}
	}

}
