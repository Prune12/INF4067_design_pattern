package pattern_de_structuration.Adapter.example1.documenthtml.code;

public class ServerWeb {

	public static void main(String[] args) {

		Document dochtml=new DocumentHTML();
		
		System.out.println("affichage du contenu \n");
		System.out.println("le contenu du document html est : \t"+dochtml.setContenu(8)+"\n");
        
		System.out.println("impression du document html \n");
		System.out.println("le document html imprimé contient : \t"+dochtml.imprime()+"\n");
		
		System.out.println("dessin \n");
		System.out.println("l'operation dessine() contient : \t"+dochtml.dessine()+"\n");


	}

}
