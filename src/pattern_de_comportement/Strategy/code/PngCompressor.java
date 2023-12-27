package pattern_de_comportement.Strategy.code;

//Classe concrète pour le compresseur PNG
public class PngCompressor implements Compressor {
 @Override
 public void compress(Image image) {
     // Algorithme de compression PNG
     System.out.println("Compressing image to PNG format...");
 }
}