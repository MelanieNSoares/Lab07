public class Bishop extends Piece{

  public Bishop(int team,char symbol){
    super(team,symbol);
  }



  public void checkSpaces(Table table, int i, int j, int l, int m){
    super.checkSpaces(table,i,j,l,m);
    int foward = l - i, horizontal = m - j;
    foward = foward / Math.abs(foward);
    horizontal = horizontal / Math.abs(horizontal);


    while(empty && Math.abs(foward) < Math.abs(l - i)){
        if(table.vTable[i + foward][j+horizontal] != null){
            empty = false;
            
        }
        
        foward = (Math.abs(foward) + 1 )*(foward/Math.abs(foward));
        horizontal = (Math.abs(horizontal) + 1 )*(horizontal/Math.abs(horizontal));
    }

  }

  public void verifyMovement(int init_row, int init_col, int fin_row, int fin_col,Table table){
    
      super.verifyMovement(init_row, init_col,fin_row,fin_col,table);
      
    if(Math.abs(x_movement) != Math.abs(y_movement)){
      return;
    }

    if(table.vTable[fin_row][fin_col] == null || table.vTable[fin_row][fin_col].team != team){
      checkSpaces(table,init_row, init_col,fin_row,fin_col);
      if (empty){
        table.movePiece(init_row,init_col,fin_row,fin_col);
      }
    }


    
  }
  
}