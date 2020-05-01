public class Horse extends Piece{

  public Horse(int team){
    super(team);
  }

  public char getPiece(){
    if(team == 1){
      return 'h';
    }
    else {
      return 'H';
    }
  }
    
    public void verifyMovement(Table table, int init_row, int init_col, int fin_row, int fin_col){
      int x_movement = fin_col - init_col;
      int y_movement = fin_row - init_row;
    
    if(( Math.abs(x_movement) != 2 || Math.abs(y_movement) != 1) || ( Math.abs(x_movement) != 1 || Math.abs(y_movement) != 2 ) ){
      return;
    }

    if(table.vTable[fin_row][fin_col] == null){
       table.movePiece(init_row,init_col, fin_row,fin_col);
    }
    else if(table.vTable[fin_row][fin_col].team != team){
        table.movePiece(init_row,init_col, fin_row,fin_col);
    }

    
  }
}
  
