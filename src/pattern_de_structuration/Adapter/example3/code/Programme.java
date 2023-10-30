package pattern_de_structuration.Adapter.example3.code;

public class Programme {

	public static void main(String[] args) {
		Icarre icarre= new AdaptRectangle(5);
		
		System.out.println("calculons le perimetre du carre \n");

		System.out.println("le perimetre de ce carre de cote 5 est de :\t"+icarre.perimetre()+"\n");
	
		System.out.println("calculons l'aire du carre \n");

		System.out.println("l'aire de ce carre de cote 5 est de :\t"+icarre.aire()+"\n");
	
	}

}
