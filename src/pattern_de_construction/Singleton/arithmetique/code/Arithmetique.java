package pattern_de_construction.Singleton.arithmetique.code;

public final class Arithmetique {

    private static Arithmetique instance=null;
    private int x;
    private int y;

    private String nom;

    //constructeur vide par defaut
    private Arithmetique(){
        super();
    }
     //constructeur avec deux variables
    private Arithmetique(int x,int y){
        this.x=x;
        this.y=y;
    }

    //constructeur avec 3 variables
    private Arithmetique(int x,int y,String nom){
        this.x=x;
        this.y=y;
        this.nom=nom;
    }

    //instance pour le constructeur par defaut
    public static Arithmetique getInstance()

    {

        if (instance == null)
        {

            instance = new Arithmetique();

        }

        return instance;
    }

    //instance pour le constructeur à 2variables
    public static Arithmetique getInstance(int x, int y)

    {

        if (instance == null)
        {

            instance = new Arithmetique(x,y);

        }

        return instance;

    }

    //instance pour le constructeur à 3variables
    public static Arithmetique getInstance(int x, int y,String nom)

    {

        if (instance == null)
        {

            instance = new Arithmetique(x,y,nom);

        }

        return instance;

    }
    //fonction somme
    public int somme(int x,int y){
        return x+y;
    }
    //fonction moyenne
    public float moyenne(int x,int y){
        return somme(x,y)/2;
    }
    //fonction soustraction
    public int soustraction(int x,int y){
        return x-y;
    }
    //fonction multiplication
    public int multiplication(int x,int y){
        return x*y;
    }
    //fonction division
    public float division(int x,int y){
        return x/y;
    }

    //affichage
    public void affiche(){
        System.out.println("\nje suis une instance ,mes valeurs sont : x="+this.x+"et y="+this.y);
    }

    //affichage des variables pour le constructeur à 3 variables
    public void afficheAll(){
        System.out.println("\nje suis une instance ,mes valeurs sont : x="+this.x+"et y="+this.y+"et mon nom est :" +this.nom);
    }

    @Override
    public Object clone() throws
            CloneNotSupportedException {

        throw new CloneNotSupportedException();

    }
}


