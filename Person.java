package MyAssignment;

import java.util.Scanner;

public class Person {
	private int age;
	private int income;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("enter person's age");
		age = sc.nextInt();
		System.out.println("enter person's income");
		income = sc.nextInt();
	}

	public void show() {
		System.out.println("the person's age is " + age);
		System.out.println("the person's income is $" + income);
		if (age > 18 && age < 60 && income > 25000) {
			System.out.println("person is eigible for loan");
		} else
			System.out.println("person is not eligible for loan");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.accept();
		person.show();
	}

}
