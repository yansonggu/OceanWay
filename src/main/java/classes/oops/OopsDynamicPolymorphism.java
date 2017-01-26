package classes.oops;

/*
 * Overriding is dynamic or runtime polymorphism
 * In overriding, method invoked based on object not reference
 * Compiler don't know which method to run it decide at run time
 */

class Base {
	public void speed() {
		System.out.println("Parent speed");
	}
}

class Audi extends Base {
	@Override
	public void speed() {
		System.out.println("Child speed");
	}
}

public class OopsDynamicPolymorphism {
	
	public static void main(String[] args) {
		Base obj1 = new Base();
		Base obj2 = new Audi();   // Parent reference, Child object
		obj1.speed(); // Parent speed
		obj2.speed(); // Child speed
	}
}
