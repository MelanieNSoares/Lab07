public class Tower extends Piece{

    public Tower(int team){
    super(team);
  }

    public char getPiece(){
    if(team == 1){
      return 't';
    }
    else {
      return 'T';
    }
  }
    
    public boolean checkSpaces(Table table, int i, int j, int l, int m){
    boolean empty = true;
    while(empty && table.vTable[i][j] != table.vTable[l][m]){
        if(table.vTable[i][j] != null){
            empty = false;
        }
        
        if(j == 0){
            i = (Math.abs(i) + 1 )*(i/Math.abs(i));
        }
        else if(i==0){
            j = (Math.abs(i) + 1 )*(i/Math.abs(i));
        }
    }
      return empty;

  }

  public void verifyMovement(Table table, int init_row, int init_col, int fin_row, int fin_col){
      
      int x_movement = fin_col - init_col;
      int y_movement = fin_row - init_row;
    
    if(x_movement != 0 || y_movement != 0){
      return;
    }

    if(table.vTable[fin_row][fin_col] == null){
      if (checkSpaces(table, init_row, init_col, fin_row, fin_col)){
          table.movePiece(init_row,init_col, fin_row,fin_col);
      }
    }
    else if(table.vTable[fin_row][fin_col].team != team){
      if (checkSpaces(table, init_row, init_col, fin_row, fin_col)){
        table.movePiece(init_row,init_col, fin_row,fin_col);
      }
    }

    
  }
  
}