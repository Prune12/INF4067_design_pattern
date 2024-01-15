package pattern_de_comportement.command.code;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        TextFile textFile = new TextFile();

        Command openCommand = new OpenCommand(textFile);
        Command writeCommand;
        Command saveCommand = new SaveCommand(textFile);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le texte à écrire dans le fichier :");
        String text = scanner.nextLine();

        writeCommand = new WriteCommand(textFile, text);


        MenuOptions menu = new MenuOptions(openCommand, writeCommand, saveCommand);

        menu.clickOpen();
        menu.clickWrite();
        menu.clickSave();
        
        scanner.close();
    }
}
