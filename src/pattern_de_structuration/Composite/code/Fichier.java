package pattern_de_structuration.Composite.code;

public class Fichier extends Element {
    Fichier(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    void decrire() {
        System.out.println("Fichier " + type + " : " + nom);
    }
}
