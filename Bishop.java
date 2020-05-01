public class Bishop extends Piece{

  public Bishop(int team){
    super(team);
  }

  public char getPiece(){
    if(team == 1){
      return 'b';
    }
    else {
      return 'B';
    }
  }

  public boolean checkSpaces(Table table, int i, int j, int l, int m){
    boolean empty = true;
    while(empty && table.vTable[i][j] != table.vTable[l][m]){
        if(table.vTable[i][j] != null){
            empty = false;
            
        }
        
        i = (Math.abs(i) + 1 )*(i/Math.abs(i));
        j = (Math.abs(j) + 1 )*(j/Math.abs(j));
    }
      return empty;

  }

  public void verifyMovement(int init_row, int init_col, int fin_row, int fin_col,Table table){
    
      int x_movement = fin_col - init_col;
      int y_movement = fin_row - init_row;
      
    if(Math.abs(x_movement) != Math.abs(y.movement)){
      return;
    }

    if(table.vTable[fin_row][fin_col] == null){
      if (checkSpaces(init_row,init_col){
        table.movePiece(init_row,init_col, fin_row,fin_col);
      }
    }
    else if(table.vTable[fin_row][fin_col].team != team){
      if (empty){
        table.movePiece(init_row,init_col, fin_row,fin_col);
      }
    }

    
  }
  
}