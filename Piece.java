public class Piece{
  int team;
  char symbol;
  int x_movement, y_movement;
  boolean empty;

  public Piece(int team,char symbol){
    this.team = team;
    this.symbol = symbol;
    x_movement = 0;
    y_movement = 0;
  }

  public char getSymbol(){
    return symbol;
  }

  public void verifyMovement(int init_row, int init_col, int fin_row, int fin_col,Table table){
    
    x_movement = fin_col - init_col;
    y_movement = fin_row - init_row;
    
  }

  public void checkSpaces(Table table, int i, int j, int l, int m){
    empty = true;
  }
}