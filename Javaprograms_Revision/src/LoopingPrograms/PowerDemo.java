package LoopingPrograms;

public class PowerDemo {

	public static void main(String[] args) {
		PowerDemo pd=new PowerDemo();
		int no=5;
		while(no>=3) {
			pd.find_power(no,no-1);
			no--;
		}

	}

	private void find_power(int base, int power) {
		int no=1;
		while(power>0) {
			no=no*base;
			power--;
		}
		System.out.println(no+" ");
	}

}
