public class Table{
  Piece vTable = new Piece[8][8];
  int round;

  public void setTable(int i, int j, Piece piece){
    vTable[i][j] = piece;
  }


}