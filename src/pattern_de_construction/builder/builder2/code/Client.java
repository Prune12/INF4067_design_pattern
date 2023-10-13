package pattern_de_construction.builder.builder2.code;


public class Client {

	public static void main(String[] args) {
		Directeur director = new Directeur();

        MonteurPizzaPiquante builderPiquante = new MonteurPizzaPiquante();
        director.construire(builderPiquante);
        Pizza pizzaPiquante = builderPiquante.getPizza();
        System.out.println("Pizza Piquante :");
        pizzaPiquante.print();

        MonteurPizzaReine builderReine = new MonteurPizzaReine();
        director.construire(builderReine);
        Pizza pizzaReine = builderReine.getPizza();
        System.out.println("Pizza Reine :");
        pizzaReine.print();
        
        MonteurPizzaTraditionnelle builderTra = new MonteurPizzaTraditionnelle();
        director.construire(builderTra);
        Pizza pizzaTra = builderTra.getPizza();
        System.out.println("Pizza Traditionnelle :");
        pizzaTra.print();

	}

}
