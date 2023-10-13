package pattern_de_construction.builder.builder1.code;

public class Directeur {

    public  void construire(MonteurPizza monteur){
    	monteur.creerNouvellePizza();
        monteur.monterPate();
        monteur.monterSauce();
        monteur.monterGarniture();
        

    }
}
