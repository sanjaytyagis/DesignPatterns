package SingeltonDesignpattern;

/*
 It controls the login of creation
Eager initialisation means direct create object and assign to getInstance method
Lazy initialisation means check If instance is null then create new object otherwise assign old one, 
Also in lazy If two threads comes at a time then both thread will check and creates local variable and check if instance is null create object,
 so to avoid this we use double locking.
 If use (synchronised method)  It's expensive because in method if your are using get instance in other rows of same method 
 then other thread won't be used because in synchronised only one thread can access at a timne  
 
 */

public class Singeltonpattern {
	
	private Singeltonpattern() { // Private constructor means object of this class can't be created outside this class
		
	}
	
	private static Singeltonpattern Instance = null;
	
	 public static Singeltonpattern getInstance() {
		
		if(Instance == null) {
			synchronized(Singeltonpattern.class) { // Double Locking
			Instance = new Singeltonpattern();
			}
		}
		return Instance;
	}

	public static void main(String[] args) {
		System.out.println(Singeltonpattern.getInstance());
		
		Singeltonpattern ob1 = new Singeltonpattern();
		Singeltonpattern ob2 = new Singeltonpattern();
		System.out.println(ob1);
		System.out.println(ob2);

	}

}
