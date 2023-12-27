package pattern_de_comportement.Template_Method.code;

public class CommandeGabon extends Commande {
	protected float montantPrestationHt;
	protected float montantMaterielHt;

    public CommandeGabon(float montantHt,float montantPrestationHt,float montantMaterielHt) {
    	super(montantHt);
        this.montantMaterielHt=montantMaterielHt;
        this.montantPrestationHt=montantPrestationHt;
    }

    @Override
    public void calculeTva() {
        montantTva = (float) ((montantPrestationHt * 0.12) + (montantMaterielHt * 0.15));
    }

    @Override
    public void affiche() {
        System.out.println("**Commande Gabon**");
        System.out.println("Montant montantPrestationHt : " + montantPrestationHt);
        System.out.println("Montant montantMaterielHt: " + montantMaterielHt);
        System.out.println("Montant TVA : " + montantTva);
        System.out.println("Montant TTC : " + montantTtc);
    }

}