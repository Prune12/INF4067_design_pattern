package pattern_de_construction.builder.builder2.code;

public class MonteurPizzaPiquante extends MonteurPizza{
    public void monterPate()
    { pizza.setPate("feuilletée"); }
    public void monterSauce()
    { pizza.setSauce("piquante"); }
    public void monterGarniture() { pizza.setGarniture("pepperoni+salami");
    }
}
