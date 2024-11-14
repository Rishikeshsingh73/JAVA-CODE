// INTERFACE-LUDO-CODE-BY-OOPS

public class interfac {

    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        
        Rook r = new Rook();
        r.moves();

        King R = new King();
        R.moves();
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal (in all 4 direction)");
 }
    }

 class Rook implements chessPlayer{
        public void moves(){
            System.out.println("up , down , left , right");
     }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal - (by 1 step)");
    }
}
