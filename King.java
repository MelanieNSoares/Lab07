public class King extends Piece{

    public King(int team,char symbol){
    super(team,symbol);
  }


    
  public void verifyMovement(Table table, int init_row, int init_col, int fin_row, int fin_col){
    
      super.verifyMovement(init_row, init_col,fin_row,fin_col,table);
    
    if((Math.abs(x_movement) != 1 || Math.abs(y_movement) != 0) || (x_movement != 0 || Math.abs(y_movement) != 1) || (Math.abs(x_movement) != Math.abs(y_movement)) ){
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