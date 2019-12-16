package core.java.basics;

public class EqualsMethodTest {
	
	public static void main(String[] args) {
		
		
		String name = "abhilash";
		String name2 = "abhilash";
		
		String nm1 = new String("abhilash");
		String nm2 = new String("Abhilash");
		
		System.out.println(nm1.hashCode());
		System.out.println(nm2.hashCode());
		
		
		int one = 1;
		int two = 2;
		
		Object object1 = 2;
		Object object2 = 3;
		
		if(object1.equals(object2)) {
			System.out.println("objects memory address is same");
			
		}
		
		if(one == two) {
			System.out.println("integers equal operator work...");
		}
		
		
		
		System.out.println(name.hashCode());
		System.out.println(name2.hashCode());
		
		
		if(name.equalsIgnoreCase("Abhilash")) {
			System.out.println("Eqauls Ignore case method work...");
		}
		
		if(name.equals(name2)) {
			System.out.println("Equals method work...");
		}
		
		if(name == name2) {
			System.out.println("Equals operator work...");
		}
		
		
		
		
	}

}
