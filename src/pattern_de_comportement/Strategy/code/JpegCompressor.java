package pattern_de_comportement.Strategy.code;

//Classe concrète pour le compresseur JPEG
public class JpegCompressor implements Compressor {
 @Override
 public void compress(Image image) {
     // Algorithme de compression JPEG
     System.out.println("Compressing image to JPEG format...");
 }
}










