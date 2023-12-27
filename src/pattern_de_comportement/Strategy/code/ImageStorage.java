package pattern_de_comportement.Strategy.code;

//Classe principale
public class ImageStorage {

private Compressor compressor;
private Filter filter;

public ImageStorage(Compressor compressor, Filter filter) {
   this.compressor = compressor;
   this.filter = filter;
}

public void store(Image image) {
   // Compression de l'image
   compressor.compress(image);

   // Application du filtre
   filter.apply(image);

   // Sauvegarde de l'image
   System.out.println("Saving image...");
}
}
