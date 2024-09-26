package MyAssignment;
import java.util.Scanner;
public class DoorAcess {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 boolean id=sc.nextBoolean();
		 boolean acessCard=sc.nextBoolean();
		 boolean admin=sc.nextBoolean();
		if((id==true && acessCard==true)|| admin==true) {
			System.out.println("person can access door");
		}
		else
			System.out.println("person cannot access door");
	}
}
