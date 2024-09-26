package MyAssignment;

import java.util.Scanner;

public class VotingCheck {
	private int age;
	boolean citizen;
	Scanner sc = new Scanner(System.in);

	public void get() {
		System.out.println("enter age");
		age = sc.nextInt();
		System.out.println("enter true or false");
		citizen=sc.nextBoolean();
	}

	public void show() {
		if (age>18&&citizen==true) {
			System.out.println("person is eligible for vote");
		}

		else
			System.out.println("peron is not eligible for vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotingCheck votingcheck = new VotingCheck();
		votingcheck.get();
		votingcheck.show();

	}

}
