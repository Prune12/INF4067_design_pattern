package pattern_de_structuration.Composite.code;

public abstract class Element {
    String nom;
    String type;

    abstract void decrire();
    void ajouter(Element e) { throw new UnsupportedOperationException(); }
    void supprimer(Element e) { throw new UnsupportedOperationException(); }
    Element obtenir(int i) { throw new UnsupportedOperationException(); }
}