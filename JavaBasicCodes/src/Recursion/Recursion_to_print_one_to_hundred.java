package Recursion;

public class Recursion_to_print_one_to_hundred {
void m (int i) {
	System.out.println(i);
	i=i+1;
	if(i<=100) {
		m(i);
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion_to_print_one_to_hundred obj=new Recursion_to_print_one_to_hundred();
		obj.m(1);
	}

}
