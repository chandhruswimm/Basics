package Recursion;

public class Recursion_gone_wrong {

	void display() {
		System.out.println("Hello World");
		display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion_gone_wrong rgw=new Recursion_gone_wrong();
		rgw.display();
	}

}
