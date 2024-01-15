package pattern_de_comportement.command.code;

//ConcreteCommand pour enregistrer un fichier
public class SaveCommand implements Command {
 private TextFile textFile;

 public SaveCommand(TextFile textFile) {
     this.textFile = textFile;
 }

 public void execute() {
     textFile.save();
 }
}
