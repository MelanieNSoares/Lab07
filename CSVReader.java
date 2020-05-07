import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CSVReader {
private String dataSource;
private String[] commands;
private Commands[] objectCommands;

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
   return setObjects();
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

     public Commands[] setObjects( ){
      objectCommands = new Commands[commands.length];
      for(int i = 0; i < commands.length; i++){
          if(commands[i].length() == 1){
            objectCommands[i] = new Transform(commands[i]);
            objectCommands[i].setLastCommand(commands[i-1]);
          }

          else if(commands[i].length() == 5){
            objectCommands[i] = new Movement(commands[i]);
          }

      }
      return objectCommands;
    }

}