package MyAssignment;
import java.util.Scanner;
public class JobClass {
	private boolean bachelor;
	private int experience;
	private boolean criminalRecord;
	Scanner sc=new Scanner(System.in);
	public void get() {
		bachelor=sc.nextBoolean();
		experience=sc.nextInt();
		criminalRecord=sc.nextBoolean();
	}
	public void show() {
		if(bachelor==true&&experience>=4&&criminalRecord==true) {
			System.out.println("eligible for job");
		}
		else
			System.out.println("not eligible got job");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobClass jobclass=new JobClass();
		jobclass.get();
		jobclass.show();
		
	}

}
