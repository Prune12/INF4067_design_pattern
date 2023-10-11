package pattern_de_construction.factory.fabrique_abstraite2.code;

public class Main {
    public static void main(String[] args) {

       IProduitFactory produitFactory1=new ProduitFactory1();

       produitA produitA=null;
       produitB produitB=null;
       produitC produitC=null;

       System.out.println("utilisation de la premiere fabrique");
       produitA=produitFactory1.getProduitA();
       produitB=produitFactory1.getProduitB();
       produitC=produitFactory1.getProduitC();

       produitA.methodA();
       produitB.methodA();
        produitC.methodA();
    }
}