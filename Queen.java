public class Queen extends Piece{

    public Queen(int team,char symbol){
    super(team,symbol);
  }

   

    
    public void checkSpaces(Table table, int i, int j, int l, int m){
        super.checkSpaces(table, i, j, l, m);
        
        if(i != 0 && j != 0){
            while(empty && table.vTable[i][j] != table.vTable[l][m]){
                if(table.vTable[i][j] != null){
                    empty = false;
            
                }   
        
                i = (Math.abs(i) + 1 )*(i/Math.abs(i));
                j = (Math.abs(j) + 1 )*(j/Math.abs(j));
            }
        }

            
        else{
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
        }
        
    }
    
  public void verifyMovement(Table table, int init_row, int init_col, int fin_row, int fin_col){
      
      super.verifyMovement(init_row, init_col,fin_row,fin_col,table);
      
      if(x_movement != 0 || y_movement != 0 || (Math.abs(x_movement) != Math.abs(y_movement)) ){
        return;
    }
      
    if(table.vTable[fin_row][fin_col] == null || table.vTable[fin_row][fin_col].team != team){
      checkSpaces(table,init_row, init_col,fin_row,fin_col);
      if (empty){
        table.movePiece(init_row,init_col, fin_row,fin_col);
      }
    }
}
}