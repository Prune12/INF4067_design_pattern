package pattern_de_structuration.Adapter.example1.documenthtmlandPDF.code;

public class ServerWeb {

	public static void main(String[] args) {

		Document dochtml=new DocumentHTML();
		Document docpdf=new DocumentPDF();
		
		
		System.out.println("affichage du contenu document HTML \n");
		System.out.println("le contenu du document html est : \t"+dochtml.setContenu(8)+"\n");
        
		System.out.println("impression du document html \n");
		System.out.println("le document html imprimé contient : \t"+dochtml.imprime()+"\n");
		
		System.out.println("dessin \n");
		System.out.println("l'operation dessine() contient : \t"+dochtml.dessine()+"\n");
		
		System.out.println("affichage du contenu document PDF \n");
		System.out.println("le contenu du document PDF est : \t"+docpdf.setContenu(8)+"\n");
        
		System.out.println("impression du document PDF \n");
		System.out.println("le document PDF imprimé contient : \t"+docpdf.imprime()+"\n");
		
		System.out.println("dessin \n");
		System.out.println("l'operation dessine() contient : \t"+docpdf.dessine()+"\n");
		
		

	}

}
