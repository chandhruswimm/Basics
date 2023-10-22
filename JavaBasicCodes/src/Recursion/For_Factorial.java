package Recursion;

public class For_Factorial {
int m(int i) {
	if(i==1) {
		return 1;
	}
	else {
		return (i*m(i-1));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		For_Factorial obj=new For_Factorial();
		System.out.println(obj.m(5));
	}

}
