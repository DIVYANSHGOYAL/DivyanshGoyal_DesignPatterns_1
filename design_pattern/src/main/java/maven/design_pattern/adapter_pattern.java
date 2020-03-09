package maven.design_pattern;

import java.util.Scanner;
public class adapter_pattern {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		System.out.println("The entered number is "+n);
		System.out.println("Here sc.nextInt is acting as adapter "
				+ "the string user input is converted it to integer without changing data");
	}

}
