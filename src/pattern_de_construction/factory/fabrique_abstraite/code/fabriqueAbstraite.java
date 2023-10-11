package pattern_de_construction.factory.fabrique_abstraite.code;

public class fabriqueAbstraite {
    public static void main(String[] args) {

       IProduitFactory produitFactory1=new ProduitFactory1();

       produitA produitA=null;
       produitB produitB=null;


       System.out.println("utilisation de la premiere fabrique");
       produitA=produitFactory1.getProduitA();
       produitB=produitFactory1.getProduitB();


       produitA.methodA();
       produitB.methodA();

    }
}