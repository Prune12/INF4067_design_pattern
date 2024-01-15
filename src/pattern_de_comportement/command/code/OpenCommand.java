package pattern_de_comportement.command.code;

//ConcreteCommand pour ouvrir un fichier
public class OpenCommand implements Command {
 private TextFile textFile;

 public OpenCommand(TextFile textFile) {
     this.textFile = textFile;
 }

 public void execute() {
     textFile.open();
 }
}
