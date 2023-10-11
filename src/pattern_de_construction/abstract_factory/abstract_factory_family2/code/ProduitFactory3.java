package pattern_de_construction.abstract_factory.abstract_factory_family2.code;

public class ProduitFactory3 implements IproduitFactory{

    @Override
    public ProduitA getProduitA() {
        return new ProduitA3();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB3();
    }
}
