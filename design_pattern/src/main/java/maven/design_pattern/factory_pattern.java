package maven.design_pattern;

import java.util.Scanner;
public class factory_pattern {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weather you want blue or black pen");
		String pen=sc.next();
		if(pen.equalsIgnoreCase("black")) {
			black_pen bapen=new black_pen();
			bapen.display();
		}
		else {
		blue_pen blpen=new blue_pen();
		blpen.display();
		}
			
	}

}
