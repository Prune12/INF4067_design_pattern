package pattern_de_construction.builder.builder1.code;

public class Client {

    public static void main(String args[]){

        Directeur director = new Directeur();
        MonteurPizzaPiquante builder= new MonteurPizzaPiquante();
        director.construire(builder);
        Pizza pizza= builder.getPizza();
        System.out.println(pizza);

    }
}
