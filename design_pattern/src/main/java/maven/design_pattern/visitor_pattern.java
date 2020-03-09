package maven.design_pattern;

import java.util.Scanner;
public class visitor_pattern {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weather you are married or unmarried");
		String status=sc.next();
		if(status.equalsIgnoreCase("married"))
			System.out.println("Cost of Hotel room is ₹4000");
		else
			System.out.println("Cost of Hotel room is ₹3000");
	}

}
