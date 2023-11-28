package pattern_de_structuration.Decorator.fenetre_simple.code;

public class Client {

	public static void main(String[] args) {
		
		Fenetre fenetre = new FenetreSimple();
		//ajout du defilement vertical à la fenetre
        fenetre = new DecorateurCurseurVertical(fenetre);
        //ajout du defilement horizontal à la fenetre
        fenetre = new DecorateurCurseurHorizontal(fenetre);
        //on dessine la fenetre
        fenetre.dessiner();
        //on decrit la fenetre
        fenetre.decrire();

	}

}
