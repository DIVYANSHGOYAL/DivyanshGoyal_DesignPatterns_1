package maven.design_pattern;

import java.util.Scanner;
public class bridge_patttern extends bridge_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		bridge_number bn=new bridge_number(n);
		System.out.println("In this any changes done in bride_patter reflects "
				+ "in bridge_number and extends keyword is acting as bridge");

	}

}
