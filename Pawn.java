public class Pawn extends Piece{

    public Pawn(int team){
    super(team);
  }
  int moved = 1; // if pawn has moved yet; 0 yes 1 no

    public char getPiece(){
    if(team == 1){
      return 'p';
    }
    else {
      return 'P';
    }
  }

  public void verifyMovement(Table table, int init_row, int init_col, int fin_row, int fin_col){

    int x_movement = fin_col - init_col;
    int y_movement = fin_row - init_row;

    if(movement is backwards){

    }

    else if((Math.abs(x_movement) != 1 && Math.abs(y_movement) != 0) || (moved == 0 && Math.abs(x_movement) == 2) ) {return;}

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