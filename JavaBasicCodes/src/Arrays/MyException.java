package Arrays;

public class MyException {
	public static void main(String[] args) {
int a=5;
int b=6;
try
{
	System.out.println(a/b);
}
catch(ArithmeticException ae) {
	System.out.println("b value can't be zero");
}
}
}
