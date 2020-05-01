public class Commands{
    
    CSVReader csv;
	  String commands[];
    Commands commandsssssss[];

    public void setCommands(){
      csv = new CSVReader();
      csv.setDataSource("entrada01.csv");
      String commands[] = csv.requestCommands();
      commandsssssss = new Commands[commands.length];
    }

    public void setBlah(){
      for(int i = 0; i < commandsssssss.length; i++){
          if(commands[i].length == 7){
            commandsssssss[i] = new Transform(commands[i]);
          }

          else if(commands[i].length == 5){
            commandsssssss[i] = new Movement(commands[i]);
          }
      }
    }

    public void runCommands(){
      for(int i = 0; i < commandsssssss.length; i++){
        commandsssssss[i].doCommand();
      }
    }




}