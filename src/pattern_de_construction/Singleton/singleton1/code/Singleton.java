package pattern_de_construction.Singleton.singleton1.code;

public final class Singleton {

    private static Singleton instance=null;
    private int x;
    private int y;

    private Singleton(){
        super();
    }

    private Singleton(int x,int y){
        this.x=x;
        this.y=y;
    }
    public static Singleton getInstance()

    {

        if (instance == null)
        {

            instance = new Singleton();

        }

        return instance;

    }

    public static Singleton getInstance(int x, int y)

    {

        if (instance == null)
        {

            instance = new Singleton(x,y);

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

    //affichage
    public void affiche(){
        System.out.println("\nje suis une instance ,mes valeurs sont : x="+this.x+"et y="+this.y);
    }

    @Override
    public Object clone() throws
            CloneNotSupportedException {

        throw new CloneNotSupportedException();

    }
}


