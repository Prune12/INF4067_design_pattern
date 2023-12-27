package pattern_de_comportement.Template_Method.code;


public abstract class Commande {

    protected float montantHt;
    protected float montantTva;
    protected float montantTtc;

    public Commande(float montantHt) {
        this.montantHt = montantHt;
    }

    public final void calculeMontantTtc() {
        // Méthode template
        calculeTva();
        montantTtc = montantHt + montantTva;
    }

    public abstract void calculeTva();

    public abstract void affiche();

}





