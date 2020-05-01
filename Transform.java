public class Transform extends Commands{
  String commands;
  Piece oldPiece;

  public Transform(String commands){
    this.commands = commands;
    oldPiece = null;
    
  }

  public void doCommand(){

    int init_col = command.charAt(0) - 'a';
    int init_row = command.charAt(1) - '1';

    int fin_col = command.charAt(3) - 'a';
    int fin_row = command.charAt(4) - '1';

    oldPiece = table.vTable[init_row][init_col]

    table.vTable[init_row][init_col].verifyMovement();

    if(oldPiece == table.vTable[fin_row][fin_col]){
      char transform = commands.charAt(6);
      
      if(transform == '')

    }


    
  }
}