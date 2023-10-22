package FunctionalPrograms;

public class LambdaExpression {

	public static void main(String[] args) {

		calc calc = (a, b) -> {
			int c = a * b;
			return c;
		};
		System.out.println(calc.sum(5, 5));

	}

	interface calc {
		int sum(int a, int b);
	}
}
