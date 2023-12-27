package pattern_de_comportement.Strategy.code;

public class Client {

	 public static void main(String[] args) {
	     // Création d'un compresseur et d'un filtre
	     Compressor compressor = new PngCompressor();
	     Filter filter = new BlackAndWhiteFilter();

	     // Création d'une instance de stockage d'images
	     ImageStorage storage = new ImageStorage(compressor, filter);

	     // Chargement d'une image
	     Image image = new Image("image.png");

	     // Sauvegarde de l'image
	     storage.store(image);
	 }

}
