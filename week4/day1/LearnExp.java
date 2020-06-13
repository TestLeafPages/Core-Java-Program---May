package week4.day1;

public class LearnExp {
	public static void main(String[] args) {
		int a[] = { 5, 2 };
		int b = 3;
		try {
			System.out.println(b / 0);
//			System.out.println(a[3]);

		} /*
			 * catch (ArithmeticException exp) {
			 * System.out.println("Divisible by 0 is not possible"); exp.printStackTrace();
			 * }
			 catch (Exception exp) {
			System.out.println("Something went wrong");
			exp.printStackTrace();
		} */
		finally {
			System.out.println("Boy will suffer");
		}
		System.out.println("Life goes on");
	}
}
