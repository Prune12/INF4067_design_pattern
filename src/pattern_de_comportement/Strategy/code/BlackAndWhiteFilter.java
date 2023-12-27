package pattern_de_comportement.Strategy.code;

//Classe concrète pour le filtre noir et blanc
public class BlackAndWhiteFilter extends Filter {
	 @Override
	 public void apply(Image image) {
	     // Conversion de l'image en noir et blanc
	     System.out.println("Applying black and white filter...");
	 }
	}