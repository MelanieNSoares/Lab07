public class King extends Piece{

    public King(int team){
    super(team);
  }

    public char getPiece(){
    if(team == 1){
      return 'k';
    }
    else {
      return 'K';
    }
  }
    
  public void verifyMovement(Table table, int init_row, int init_col, int fin_row, int fin_col){
    
    int x_movement = fin_col - init_col;
    int y_movement = fin_row - init_row;
    
    if((Math.abs(x_movement) != 1 || Math.abs(y_movement) != 0) || (x_movement != 0 || Math.abs(y_movement) != 1) || (Math.abs(x_movement) != Math.abs(y.movement)) ){
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