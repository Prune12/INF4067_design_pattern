package pattern_de_structuration.Decorator.fenetre_simple.code;

public abstract class DecorateurFenetre implements Fenetre{
	protected Fenetre fenetreDecoratee;

	public DecorateurFenetre(Fenetre fenetreDecoratee) {
		super();
		this.fenetreDecoratee = fenetreDecoratee;
	}
	
	public void dessiner() {
		fenetreDecoratee.dessiner();
	}
	
	public void decrire() {
		fenetreDecoratee.decrire();
	}
	
	

}
