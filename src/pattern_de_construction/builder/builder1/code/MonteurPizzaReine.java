package pattern_de_construction.builder.builder1.code;

public class MonteurPizzaReine extends MonteurPizza{
    public void monterPate()
    { pizza.setPate("croisée"); }
    public void monterSauce()
    { pizza.setSauce("douce"); }
    public void monterGarniture() {
        pizza.setGarniture("jambon+champignon"); }
}
