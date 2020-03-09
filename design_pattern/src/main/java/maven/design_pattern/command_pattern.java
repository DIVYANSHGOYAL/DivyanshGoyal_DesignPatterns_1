package maven.design_pattern;

import java.util.Scanner;
import java.math.*;
public class command_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the command + or - or * or / or %");
		String c=sc.next();
		double a=(Math.random()+Math.random());
		double b=(Math.random()+Math.random());
		System.out.println(a+" "+b);
		if(c.equalsIgnoreCase("+"))
			System.out.println(a+b);
		if(c.equalsIgnoreCase("-"))
			System.out.println(a-b);
		if(c.equalsIgnoreCase("*"))
			System.out.println(a*b);
		if(c.equalsIgnoreCase("/"))
			System.out.println(a/b);
		if(c.equalsIgnoreCase("%"))
			System.out.println(a%b);
	}

}
