import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        
        System.out.print(targetsum(arr, tar,0 , 0 ));
    }
    public static boolean  targetsum(int arr[] , int tar ,int i, int asf){
        if(i== arr.length){
            return false;
        }
        if( tar < asf ){
            return false;
        }
        if( tar == asf ){
            return true;
        } 
        
        boolean result = targetsum(arr,tar,i+1, asf + arr[i]) ||targetsum(arr, tar,i+1, asf ) ;
        return result;
    }
}
