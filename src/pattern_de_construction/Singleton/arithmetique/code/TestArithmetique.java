package pattern_de_construction.Singleton.arithmetique.code;

public class TestArithmetique {
    public static void main(String[] args) {
        //la somme
        int som = Arithmetique.getInstance().somme(2, 5);
        System.out.printf("la somme est %d",som);
        //la moyenne
        float moy = Arithmetique.getInstance().moyenne(2,5);
        System.out.printf("\nla moyenne est %f",moy);
        //la soustraction
        int minus = Arithmetique.getInstance().soustraction(2,5);
        System.out.printf("\nla difference  est de %d",minus);
        //la multiplication
        int mult = Arithmetique.getInstance().multiplication(2,5);
        System.out.printf("\nle produit est  est %d",mult);
        //la division
        float div = Arithmetique.getInstance().division(2,5);
        System.out.printf("\nle rapport  est %f",div);
        //affichage des  variables
        //Arithmetique s1 = Arithmetique.getInstance(8, 3);
        //s1.affiche();
        //Arithmetique s2 = Arithmetique.getInstance(5, 9);
         //s2.affiche();
         //affichage des 3 variables
        Arithmetique s3 = Arithmetique.getInstance(5, 9,"Arithmetique");
        s3.afficheAll();
    }
}