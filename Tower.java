public class Tower extends Piece{

    public Tower(int team,char symbol){
    super(team,symbol);
  }

    
    public void checkSpaces(Table table, int i, int j, int l, int m){
      super.checkSpaces(table, i, j, l, m);

      int foward = l - i, horizontal = m-j;

      if(foward == 0){
        horizontal = horizontal / Math.abs(horizontal);
      }
      else 
      {
        foward = (foward/Math.abs(foward));
      }


    while(empty && ( Math.abs(foward) < Math.abs(l - i) || Math.abs(horizontal) < Math.abs(m - j))){
        if(table.vTable[i+foward][j+horizontal] != null){
            empty = false;
        }
        
        if(m-j == 0){
            foward = (Math.abs(foward) + 1)*(foward/Math.abs(foward));
        }
        else if(l-i==0){
          horizontal = (Math.abs(horizontal) + 1 )*(horizontal/Math.abs(horizontal));
        }
    }


  }

  public void verifyMovement( int init_row, int init_col, int fin_row, int fin_col, Table table){
      
      super.verifyMovement(init_row, init_col,fin_row,fin_col,table);

    System.out.println("*");

    System.out.println(x_movement + " " + y_movement);
    
    if((x_movement != 0 && y_movement == 0) || (y_movement != 0 && x_movement == 0)){
    }
    else {
      System.out.println("**");
      return;
    }


    if(table.vTable[fin_row][fin_col] == null || table.vTable[fin_row][fin_col].team != team){
      System.out.println("***");

      checkSpaces(table,init_row, init_col,fin_row,fin_col);

      if (empty){
          table.movePiece(init_row,init_col, fin_row,fin_col);
      }
    }


    
  }
  
}