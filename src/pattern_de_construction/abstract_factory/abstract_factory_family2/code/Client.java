package pattern_de_construction.abstract_factory.abstract_factory_family2.code;

public class Client {
    public static void main(String[] args) {
        IproduitFactory produitfactory1=new ProduitFactory1();
        IproduitFactory produitfactory2=new ProduitFactory2();
        IproduitFactory produitfactory3=new ProduitFactory3();

        ProduitA produitA =null;
        ProduitB produitB=null;

        System.out.println("utilisation de la premiere fabrique");
        produitA = produitfactory1.getProduitA();
        produitB= produitfactory1.getProduitB();
        produitA.methodA();
        produitB.methodB();

        System.out.println("utilisation de la deuxieme fabrique");
        produitA = produitfactory2.getProduitA();
        produitB= produitfactory2.getProduitB();
        produitA.methodA();
        produitB.methodB();

        System.out.println("utilisation de la troisieme fabrique");
        produitA = produitfactory3.getProduitA();
        produitB= produitfactory3.getProduitB();
        produitA.methodA();
        produitB.methodB();
    }
}