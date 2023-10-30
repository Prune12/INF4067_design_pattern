package pattern_de_structuration.Adapter.example2.code;

public class Gestion {

	public static void main(String[] args) {
		 Stack stack = new DListImpStack();

	        // ajout des elements
	        stack.push("Element 1");
	        stack.push("Element 2");
	        stack.push("Element 3");

	        System.out.println(stack.top());  // Affiche "Element 3"
	        System.out.println(stack.pop());  // Affiche "Element 3"
	        System.out.println(stack.top());  // Affiche "Element 2"

	}

}
