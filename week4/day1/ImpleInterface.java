package week4.day1;

public class ImpleInterface implements LearnJava8Features {

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		System.out.println("Hey");
	}
	public static void main(String[] args) {
		LearnJava8Features obj = new ImpleInterface();
		obj.sendKeys();
		LearnJava8Features.click();
	}

}
