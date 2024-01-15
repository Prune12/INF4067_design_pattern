package pattern_de_comportement.command.code;

//ConcreteCommand pour écrire dans un fichier
public class WriteCommand implements Command {
 private TextFile textFile;
 private String text;

 public WriteCommand(TextFile textFile, String text) {
     this.textFile = textFile;
     this.text = text;
 }

 public void execute() {
     textFile.write(text);
 }
}
