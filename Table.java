public class Table{
  public Piece vTable[][] = new Piece[8][8];
  int round = 1;
  Piece oldPiece;
  Piece fin_piece;

  public void setTable(int i, int j, Piece piece){
    vTable[i][j] = piece;
  }

  public void movePiece(int init_row, int init_col, int fin_row, int fin_col){
    oldPiece = vTable[init_row][init_col];
    fin_piece = vTable[fin_row][fin_col];
    vTable[fin_row][fin_col] = vTable[init_row][init_col];
    vTable[init_row][init_col] = null; 
    System.out.println("Source: " + (char) (init_col + 97) +""+(char)(init_row + 49) + " Target: " + (char)(fin_col + 97)+""+(char)(fin_row + 49) );

    showTable();

      if (fin_piece instanceof King == true){
        System.out.println("Game over: Player " + ((oldPiece.team == 1) ? 1 : 2) + " Wins!!!!");
        System.exit(0);
    }
  }


  public void showTable(){
    for(int i=7; i>=0; i--){
      int linha = i + 1;
      System.out.print(linha + "\t");
      
      for(int j=0; j<8; j++){

        if(vTable[i][j] == null){
          System.out.print('-' + "\t");
        }
        else{

        System.out.print(vTable[i][j].getSymbol() + "\t");
        }
      }

      System.out.print("\n");
    }
    System.out.println("\t" + "a\t"+"b\t"+"c\t"+ "d\t"+ "e\t"+ "f\t"+ "g\t" + "h"  + "\n");
    System.out.print("\n");
  }


}