package protected_test.packageMain;

import protected_test.packageB.*;

public class TypeMain {
	
	public static void main(String[] args) {
		TypeB b = new TypeB();
		b.asd();
		// b.protectedFunction();
	}
	
}