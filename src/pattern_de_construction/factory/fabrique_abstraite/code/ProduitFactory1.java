package pattern_de_construction.factory.fabrique_abstraite.code;

public class ProduitFactory1 implements IProduitFactory{
    @Override
    public produitA getProduitA() {
        return new produitA();
    }
    public produitB getProduitB(){
        return new produitB();
    }

}
