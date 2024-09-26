package MyAssignment;

import java.util.Scanner;

public class Nevigation {
	private int num;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter num:");
		num = sc.nextInt();
	}

	public void checkNum() {
		if (!(num >= 10 && num <= 20)) {
			System.out.println(+num + " is not between 10 and 20");
		} else
			System.out.println(+num + " is between 10 and 20");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nevigation num = new Nevigation();
		num.accept();
		num.checkNum();
	}

}
