package pattern_de_construction.factory.factory_method.code;

import pattern_de_construction.factory.factory_method.code.ProduitFactory;
import pattern_de_construction.factory.factory_method.code.produit;

public class Client {
    public static void main(String[] args) {

        ProduitFactory produitfactory = new ProduitFactory();
        produit product=null;

        product=produitfactory.getProduit(ProduitFactory.TYPE_PRODUITA1);
        product.methodA();

        product=produitfactory.getProduit(ProduitFactory.TYPE_PRODUITA2);
        product.methodA();


    }
}