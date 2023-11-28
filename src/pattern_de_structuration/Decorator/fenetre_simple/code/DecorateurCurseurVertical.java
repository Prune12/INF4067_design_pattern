package pattern_de_structuration.Decorator.fenetre_simple.code;

public class DecorateurCurseurVertical extends DecorateurFenetre{
	  public DecorateurCurseurVertical(Fenetre fenetre) {
	        super(fenetre);
	    }

	    public void dessiner() {
	        super.dessiner();
	        dessinerCurseurVertical();
	    }

    public void dessinerCurseurVertical() {
        System.out.println("Dessin du curseur vertical");
    }

    public void decrire() {
        super.decrire();
        System.out.println("Défilement vertical activé");
    }

}
