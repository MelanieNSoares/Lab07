public class Transform extends Commands{
  Piece oldPiece;

  public Transform(String commands){
    super(commands);
    oldPiece = null;
    
  }

  public void doCommand(Table table){

    oldPiece = table.vTable[init_row][init_col];

    super.doCommand(table);

    if(oldPiece == table.vTable[fin_row][fin_col]){
      char transform = commands.charAt(6);
      
      if(transform == 'q' || transform == 'Q'){
        table.vTable[fin_row][fin_col] = new Queen(oldPiece.team,transform);
      }

      else if(transform == 'b' || transform == 'B'){
        table.vTable[fin_row][fin_col] = new Bishop(oldPiece.team,transform);
        
      }

      else if(transform == 'h' || transform == 'H'){
        table.vTable[fin_row][fin_col] = new Horse(oldPiece.team,transform);
        
      }

            else if(transform == 'k' || transform == 'K'){
        table.vTable[fin_row][fin_col] = new King(oldPiece.team,transform);
        
      }

            else if(transform == 'p' || transform == 'P'){
        table.vTable[fin_row][fin_col] = new Pawn(oldPiece.team,transform);
        
      }

            else if(transform == 't' || transform == 'T'){
        table.vTable[fin_row][fin_col] = new Tower(oldPiece.team,transform);
        
      }

    }  
  }
}