public class Commands{

    int init_col, init_row, fin_col, fin_row;
    String commands;
    String old_init;
    String old_fin;
    Piece oldPiece;

    public Commands(String commands){
      this.commands = commands;
      init_col = 0;
      init_row = 0;
      fin_col = 0;
      fin_row = 0; 
    }

    public void doCommand(Table table){

      init_col = commands.charAt(0) - 'a';
      init_row = commands.charAt(1) - '1';

      fin_col = commands.charAt(3) - 'a';
      fin_row = commands.charAt(4) - '1';

      oldPiece = table.vTable[init_row][init_col];

      if(table.round != table.vTable[init_row][init_col].team){
        System.out.println("It is not your turn!");
        return;
      }

      table.vTable[init_row][init_col].verifyMovement(init_row,init_col,fin_row,fin_col,table);

      old_init = commands.substring(0,2);
      old_fin =commands.substring(3);

  }

  public void setLastCommand(String lastCommand){}




}