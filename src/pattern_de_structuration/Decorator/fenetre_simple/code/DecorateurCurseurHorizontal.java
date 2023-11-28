package pattern_de_structuration.Decorator.fenetre_simple.code;

public class DecorateurCurseurHorizontal extends DecorateurFenetre{
	public DecorateurCurseurHorizontal(Fenetre fenetre) {
        super(fenetre);
    }

    public void dessiner() {
        super.dessiner();
        dessinerCurseurHorizontal();
    }

    public void dessinerCurseurHorizontal() {
        System.out.println("Dessin du curseur horizontal");
    }
    
    public void decrire() {
        super.decrire();
        System.out.println("Défilement horizontal activé");
    }


}
