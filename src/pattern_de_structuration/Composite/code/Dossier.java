package pattern_de_structuration.Composite.code;

import java.util.ArrayList;
import java.util.List;

public class Dossier extends Element {
    List<Element> elements = new ArrayList<>();

    Dossier(String nom) {
        this.nom = nom;
        this.type = "dossier";
    }

    void decrire() {
        System.out.println("Dossier : " + nom);
        for (Element e : elements) {
            e.decrire();
        }
    }

    void ajouter(Element e) {
    	  elements.add(e);
    }

    void supprimer(Element e) {
        elements.remove(e);
    }

    Element obtenir(int i) {
        return elements.get(i);
    }
}
    

