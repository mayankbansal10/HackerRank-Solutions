import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function
        int count=0;
        if(p<=n/2)
        {
         for(int i=1;i<=p;i++)
         {
             count+=1;
         }
        }else{
             if(n%2!=0){
                count=-1;  
               }
           for(int i=n;i>=p;i--){
              count+=1;
           } 
        }
        return count/2;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
