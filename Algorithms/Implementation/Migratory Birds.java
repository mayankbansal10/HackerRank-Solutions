import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        // your code goes here
        int[] bird=new int[5];
        for(int i=0;i<types.length;i++){
            bird[types[i]-1]++;
        }
        
        int max=0;
        for(int i=0;i<5;i++){
            if(bird[i]>bird[max])
                max=i;
        }
        System.out.print(max+1);
        
    }
}
