package MyAssignment;

import java.util.Scanner;

public class StudentExam {
	private int sub1, sub2, sub3;
	private double avg;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("enter marks for 3 subject");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
		avg = (sub1 + sub2 + sub3) / 3;
	}

	public void show() {
		System.out.println("average is " + avg);
		if (sub1 > 40 && sub2 > 40 && sub3 > 40 && avg > 60) {
			System.out.println("passed");
		} else
			System.out.println("failed");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentExam studentexam = new StudentExam();
		studentexam.accept();
		studentexam.show();
	}

}
