package pattern_de_construction.factory.factory_method.code;

public class ProduitFactory {

    public static final int  TYPE_PRODUITA1=1;
    public static final int  TYPE_PRODUITA2=2;

    public produit getProduit(int typeProduit){
        produit product = null;

        switch (typeProduit){
            case TYPE_PRODUITA1 :
                product = new produitA();
                break;
            case TYPE_PRODUITA2 :
                product = new produitB();
                break;

            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }
        return product;
    }
}
