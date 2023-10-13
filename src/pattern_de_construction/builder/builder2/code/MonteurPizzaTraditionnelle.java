package pattern_de_construction.builder.builder2.code;

public class MonteurPizzaTraditionnelle extends MonteurPizza{
	
	public void monterPate()
    { pizza.setPate("escargots"); }
    public void monterSauce()
    { pizza.setSauce("sauce jaune"); }
    public void monterGarniture() {
        pizza.setGarniture("feuille de macabo"); }

}
