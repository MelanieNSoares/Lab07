import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CSVReader {
private String dataSource;
private String[] commands;
private Commands[] commandsssssssssss;

 public CSVReader() {
 this.commands = null;
 this.dataSource = null;
 }
 public String getDataSource() {
 return dataSource;
 }
 public void setDataSource(String dataSource) {
 this.dataSource = dataSource;
 if (dataSource == null) {
 commands = null;
 } else
 readCSV();
 }

 public Commands[] requestCommands() {
   return setBlah();
 }

 private void readCSV() {
 try {
 BufferedReader file = new BufferedReader(new
FileReader(dataSource));

 String line = file.readLine();
 if (line != null) {
 commands = line.split(",");
 line = file.readLine();
 }
 file.close();
 } catch (IOException erro) {
 erro.printStackTrace();
 }
 }

     public Commands[] setBlah( ){
      commandsssssssssss = new Commands[commands.length];
      for(int i = 0; i < commands.length; i++){
          if(commands[i].length() == 1){
            commandsssssssssss[i] = new Transform(commands[i]);
            commandsssssssssss[i].setLastCommand(commands[i-1]);
          }

          else if(commands[i].length() == 5){
            commandsssssssssss[i] = new Movement(commands[i]);
          }

      }
      return commandsssssssssss;
    }

}