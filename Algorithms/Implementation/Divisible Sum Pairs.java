import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int pair=0;
        // write your code here
        for(int i=0;i<a.length;i++){
            
            for(int j=i;j<a.length;j++){
                if(j>i){
                if((a[i]+a[j])%k==0)
                  pair++; 
                }
            }
        
    }
        System.out.print(pair);
}
}
