public class Pawn extends Piece{

    public Pawn(int team,char symbol){
    super(team,symbol);
  }


  int moved = 1; // if pawn has moved yet; 0 yes 1 no



  public void verifyMovement(int init_row, int init_col, int fin_row, int fin_col, Table table){



    super.verifyMovement(init_row, init_col,fin_row,fin_col,table);



    if((team == 1 && y_movement < 0) || (team == -1 && y_movement > 0)){
      System.out.println("+");
      return;
    }

    else if((Math.abs(y_movement) != 1 && Math.abs(x_movement) != 0) || (moved == 0 && Math.abs(y_movement) == 2) ) {      System.out.print("yes5"); return;}

    else if((Math.abs(x_movement) == Math.abs(y_movement)) && (table.vTable[fin_row][fin_col] == null ||table.vTable[fin_row][fin_col].team == team)){
      System.out.println("++");
      return;}

    else if((Math.abs(x_movement) == 0 && y_movement != 0) && (table.vTable[fin_row][fin_col] != null)){
      System.out.println("cant move in this direction");
      return;
    }


    else if(table.vTable[fin_row][fin_col] == null){
      table.movePiece(init_row,init_col, fin_row,fin_col);
      moved = 0;
    }

    else if(table.vTable[fin_row][fin_col].team != team){
      table.movePiece(init_row,init_col, fin_row,fin_col);
      moved = 0;
      
   }

  
  }
}