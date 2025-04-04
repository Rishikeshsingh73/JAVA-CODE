    //  N-QUEENS-PROGRAM --> (CHECK IF PROBLEM CAN BE SOLVED & PRINT ONLY 1 SOLUTION TO N-QUEENS PROBLEM)

    public class nqueen1sol {
        public static boolean isSafe(char board[][],int row ,int col){
            // VERTICAL-UP
            for(int i =row-1; i>=0; i--){
                if(board[i][col]=='Q'){
                    return false;
                }
            }
            //DIAGONAL-LEFT-UP
            for(int i=row-1,j=col-1; i>=0 && j>=0; i-- , j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            //DIAGONAL-RIGHT-UP
            for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
              return true;
        }
    
        public static boolean nQueens(char board[][] , int row){
              //base
              if(row==board.length){
                // printBoard(board);
                count++;
                return true;

              }
            for(int j=0; j<board.length; j++){
                if(isSafe(board,row,j)){
                  board[row][j]='Q';
                  if(nQueens(board,row+1)){  // function call
                return true;
                }
                board[row][j]='x';  //backtracking step
            }
        }
        return false;
    }
    
        public static void printBoard(char board[][]){
            System.out.println("-------------chess board--------");
            for(int i =0; i<board.length; i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
        }
    }
    static int count=0;
    public static void main(String args[]){
        int n =4;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }
    
        if(nQueens(board,0)){
            System.out.println("solution is possible");
            printBoard(board);
        } else {
            System.out.println("solution is not possible");
        }
        
      }
    }
    