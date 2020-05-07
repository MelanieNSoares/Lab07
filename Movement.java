public class Movement extends Commands{
  

  public Movement(String commands){
    super(commands);
  }

  public void doCommand(Table table){
    super.doCommand(table);
    table.round = table.round * -1;

  }
}