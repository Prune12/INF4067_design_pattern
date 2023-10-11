package pattern_de_construction.abstract_factory.abstract_factory_family1.code;

public class ProduitFactory2 implements IproduitFactory{

    @Override
    public ProduitA getProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB2();
    }
}
