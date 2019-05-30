package protected_test.packageA;

public class TypeA {
	
	protected void protectedFunction() {
		System.out.println("This is protected!");
		privateFunction();
	}
	
	private void privateFunction() {
		System.out.println("This is private!");
	}
	
}