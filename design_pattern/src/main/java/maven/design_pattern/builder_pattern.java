package maven.design_pattern;

import java.util.Scanner;
public class builder_pattern extends sandwitch {

	public static void main(String[] args) {
		System.out.println("Enter the quantity of ingredients required"
				+ " to prepare the sandwitch based on your choice");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount of bread");
		int bread=sc.nextInt(); 
		System.out.println("Enter the amount of tomatos");
		int tomato_slice=sc.nextInt(); 
		System.out.println("Enter the amount of onions");
		int onion_slice=sc.nextInt();
		System.out.println("Enter the amount of cucumber");
		int cucumber_slice=sc.nextInt();
		System.out.println("Weather you want Ketchup");
		String ketchup=sc.next();
		System.out.println("The ingedients in your sandwitch are ");
		sandwitch s=new sandwitch(bread,tomato_slice,onion_slice,cucumber_slice,ketchup);
		s.display();

	}

}
