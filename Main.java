public class Main{
  public void main(String args[]){

    for(int i; i<8; i++){
      for(int j; j<8; j++){

        if(i==1){
          setTable(i,j, new Pawn(1));
        }

        else if(i==6){
          setTable(i,j,new Pawn(0));
        }

        else if(i==0){
          if(j==0 || j==7){
            setTable(i,j,new Tower(1));

          }
          else if(j==1 || j==6){
            setTable(i,j,new Horse(1));
          }
          else if(j==2 || j==5){
            setTable(i,j,new Bishop(1));
          }
          else if(j==3){
            setTable(i,j,new Queen(1));
          }
          else{
            setTable(i,j,new King(1));
          }
        }
        else if(i==7){
          if(j==0 || j==7){
            setTable(i,j,new Tower(0));

          }
          else if(j==1 || j==6){
            setTable(i,j,new Horse(0));
          }
          else if(j==2 || j==5){
            setTable(i,j,new Bishop(0));
          }
          else if(j==3){
            setTable(i,j,new King(0));
          }
          else{
            setTable(i,j,new Queen(0));
          }
        }

      }
    }

  }
}