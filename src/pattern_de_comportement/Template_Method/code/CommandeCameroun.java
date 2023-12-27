package pattern_de_comportement.Template_Method.code;

public class CommandeCameroun extends Commande {

    public CommandeCameroun(float montantHt) {
        super(montantHt);
    }

    @Override
    public void calculeTva() {
        montantTva = (float) (montantHt* 0.196);
    }

    @Override
    public void affiche() {
        System.out.println("**Commande Cameroun**");
        System.out.println("Montant HT : " + montantHt);
        System.out.println("Montant TVA : " + montantTva);
        System.out.println("Montant TTC : " + montantTtc);
    }

}
