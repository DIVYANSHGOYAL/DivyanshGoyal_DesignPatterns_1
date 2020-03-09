package maven.design_pattern;

public class sandwitch {
	int bread,tomato,onion,cucumber;
	String Ketchup;
	sandwitch(){
		
	}
	sandwitch(int b,int t,int o,int c,String k)
	{
		bread=b;
		tomato=t;
		onion=o;
		cucumber=c;
		Ketchup=k;
	}
	void display()
	{
		System.out.println("Your ingredients are");
		if(bread>0)
			System.out.println(bread+" breads");
		if(tomato>0)
			System.out.println(tomato+" tomato slices");
		if(onion>0)
			System.out.println(onion+" onion slices");
		if(cucumber>0)
			System.out.println(cucumber+" cucumber slices");
		if(Ketchup.equalsIgnoreCase("yes"))
			System.out.println("Ketchup");
	}

	public static void main(String[] args) {
		

	}

}
