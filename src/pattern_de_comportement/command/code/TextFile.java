package pattern_de_comportement.command.code;

// c'est le receiver
public class TextFile {
    private String content;

    public void open() {
        System.out.println("ouverture du fichier...");
    }

    public void write(String text) {
        content = text;
        System.out.println(content);
    }

    public void save() {
    	System.out.println("informations enregistrées avec succes!!");
    }
}