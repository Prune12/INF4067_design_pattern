package pattern_de_comportement.Template_Method.code;

public class Client {

	public static void main(String[] args) {

		//commande pour le cameroun
        Commande commandeCameroun = new CommandeCameroun(100);
        commandeCameroun.calculeMontantTtc();
        commandeCameroun.affiche();

        System.out.println();

        //comment pour le Gabon
        Commande commandeGabon = new CommandeGabon(100,300,200);
        commandeGabon.calculeMontantTtc();
        commandeGabon.affiche();

    }
}
