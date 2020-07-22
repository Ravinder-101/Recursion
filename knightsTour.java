import java.util.*;

public class Main{

public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int chess[][] = new int[n][n];
    knightTour(chess, 0, 0 , 1);

 }
 public static void knightTour(int chess[][] , int row, int col , int n ){
     if(row < 0 || col <0 || row>=chess.length || col >= chess.length || chess[row][col] !=0 ){
         return ;
     } 
     if(n == chess.length*chess.length){
         chess[row][col] = n;
         print(chess);
         System.out.println();
         return;
         
     }
     
     
     chess[row][col] = n;
     
     knightTour(chess, row-2, col +1, n+1);
     knightTour(chess, row -1, col +2, n+1);
     knightTour(chess, row +1, col +2, n+1);
     knightTour(chess, row +2, col+1 , n+1);
     knightTour(chess, row +2, col -1, n+1);
     knightTour(chess, row +1, col-2 , n+1);
     knightTour(chess, row -1, col-2 , n+1);
     knightTour(chess, row -2, col -1, n+1);
     
     chess[row][col] = 0;
     
     
     
     
     
 }
 public static void print(int chess[][]){
     for(int i=0;i<chess.length;i++){
         for(int j=0;j<chess.length;j++){
             System.out.print(chess[i][j]+" ");
         }
         System.out.println();
     }
 }
 
 
}