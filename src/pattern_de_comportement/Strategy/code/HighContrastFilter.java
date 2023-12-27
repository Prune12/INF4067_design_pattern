package pattern_de_comportement.Strategy.code;

//Classe concrète pour le filtre à contraste élevé
public class HighContrastFilter extends Filter {
@Override
public void apply(Image image) {
   // Augmentation du contraste de l'image
   System.out.println("Applying high contrast filter...");
}
}
