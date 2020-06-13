package week4.day1;

public class LearnExp2 {
	public static void waitTime() throws InterruptedException  {
		
		Thread.sleep(5000);
	}
public static void main(String[] args)   {
	System.out.println("Started");
	throw new RuntimeException();
}
}
