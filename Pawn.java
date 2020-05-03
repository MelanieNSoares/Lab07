public class Pawn extends Piece{

    public Pawn(int team,char symbol){
    super(team,symbol);
  }


  int moved = 1; // if pawn has moved yet; 0 yes 1 no



  public void verifyMovement(int init_row, int init_col, int fin_row, int fin_col, Table table){

    System.out.print("yes2");

    super.verifyMovement(init_row, init_col,fin_row,fin_col,table);
    System.out.print("yes4");


    if((team == 1 && x_movement < 0) || (team == -1 && x_movement > 0)){
      return;
    }

    else if((Math.abs(y_movement) != 1 && Math.abs(x_movement) != 0) || (moved == 0 && Math.abs(y_movement) == 2) ) {      System.out.print("yes5"); return;}

    else if((Math.abs(x_movement) == Math.abs(y_movement)) && (table.vTable[fin_row][fin_col] == null || table.vTable[fin_row][fin_col].team != team)){return;}


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