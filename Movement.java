public class Movement extends Commands{
  String command;

  public Movement(String commands){
    this.commands = commands;
  }

  public void doCommand(){

    init_col = command.charAt(0) - 'a';
    init_row = command.charAt(1) - '1';

    fin_col = command.charAt(3) - 'a';
    fin_row = command.charAt(4) - '1';

    table.vTable[init_row][init_col].verifyMovement();

  }
}