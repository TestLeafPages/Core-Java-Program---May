package week1.day1.assignments;

public class SumOfDigits {
public static void main(String[] args) {
	int number = 36785, solution = 0;
	// 3+6+7+8+5 = 29
	while(number>0) {
		// Retrieving the last digit from the number
		int lastDigit = number%10;
		// Adding the digit to the solution
		solution = solution +lastDigit;
		// Removing the last digit from the number
		number = number/10;
	}
	System.out.println(solution);
}
}
