
public class Main{
  public static void main(String args[]){

    Table table = new Table();
    CSVReader csv = new CSVReader();
    csv.setDataSource("teste02.csv");
    Commands commands[] = csv.requestCommands();



    for(int i = 0; i<8; i++){
      for(int j = 0 ; j<8; j++){

        if(i==1){
          table.setTable(i,j, new Pawn(1,'p'));
        }

        else if(i==6){
          table.setTable(i,j,new Pawn(-1,'P'));
        }

        else if(i==0){
          if(j==0 || j==7){
            table.setTable(i,j,new Tower(1,'t'));

          }
          else if(j==1 || j==6){
            table.setTable(i,j,new Horse(1,'h'));
          }
          else if(j==2 || j==5){
            table.setTable(i,j,new Bishop(1,'b'));
          }
          else if(j==3){
            table.setTable(i,j,new Queen(1,'q'));
          }
          else{
            table.setTable(i,j,new King(1,'k'));
          }
        }
        else if(i==7){
          if(j==0 || j==7){
            table.setTable(i,j,new Tower(-1,'T'));

          }
          else if(j==1 || j==6){
            table.setTable(i,j,new Horse(-1,'H'));
          }
          else if(j==2 || j==5){
            table.setTable(i,j,new Bishop(-1,'B'));
          }
          else if(j==3){
            table.setTable(i,j,new King(-1,'K'));
          }
          else{
            table.setTable(i,j,new Queen(-1,'Q'));
          }
        }

      }
    }

    table.showTable();
    System.out.print(commands[0].commands);

    //run commands
    for(int i = 0; i < commands.length; i++){
        commands[i].doCommand(table);
        
      }

  }
}