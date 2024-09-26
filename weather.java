package MyAssignment;
import java.util.Scanner;
public class Weather {
	private double temp;
	private boolean rain;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Temperature:");
		temp = sc.nextDouble();
		System.out.println("Is it Raining?");
		String r = sc.next();
		rain = r.equals("yes");
	}

	public void checkWeatherCondition() {
		if ((temp <= 20 && temp >= 30) && !rain) {
			System.out.println("it's not safe to go outside..");
		} else
			System.out.println("it's safe to go outside");
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Weather t1 = new Weather();
		t1.accept();
		t1.checkWeatherCondition();
	}
}
