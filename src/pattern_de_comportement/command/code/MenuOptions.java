package pattern_de_comportement.command.code;

//Invoker
public class MenuOptions {
 private Command openCommand;
 private Command writeCommand;
 private Command saveCommand;

 public MenuOptions(Command open, Command write, Command save) {
     this.openCommand = open;
     this.writeCommand = write;
     this.saveCommand = save;
 }

 public void clickOpen() {
     openCommand.execute();
 }

 public void clickWrite() {
     writeCommand.execute();
     
 }

 public void clickSave() {
     saveCommand.execute();
 }
}    