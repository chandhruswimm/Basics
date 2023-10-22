package LoopingPrograms;

public class First_ten_primeno {
	int prime_count=0;
	public static void main(String[] args) {
		First_ten_primeno pp=new First_ten_primeno();
		pp.find_prime(2);

	}

	private void find_prime(int no) {
		int div=2;
		int count=0;
		
		while(div<=no) {
			if(no%div==0) {
				count++;
				break;
			}div++;
		}
		
		if(count==0) {
			System.out.println("Prime no:"+no);
			prime_count++;
		}
		if(prime_count<=10) {
			no++;
			find_prime(no);
		}
	}

}
