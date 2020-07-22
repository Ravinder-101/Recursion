public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int chess[][] = new int[n][n];
    if(!printnqueens(chess, 0)){
        System.out.print("Not posiible");
    }


 }
 public static boolean  printnqueens(int chess[][] , int row){
     if( row == chess.length ){
         print(chess);
         System.out.println();
         return true;
     }
    
    for(int c=0;c<chess.length;c++){
        if(isSafe(chess, row , c ) == true){
            chess[row][c] = 1;
            if( printnqueens(chess, row+1)){
                return true;
            }
            
            chess[row][c] = 0;
        }
        
    }
    
    return false;
}
public static boolean isSafe(int chess[][],int row,int col){
        
        //left diagonal
        for(int i =row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        // top 
        for(int i=row-1;i>=0;i--){
            if(chess[i][col]==1){
                return false;
            }
        }
        //right diagonal 
        for(int i =row-1,j=col+1;i>=0&&j<chess[0].length;i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }
         
        return true;
        
    }
public static void print(int arr[][]){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+" ");
        }
         System.out.println();
    }
   
}


}