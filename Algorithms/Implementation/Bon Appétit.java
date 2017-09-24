import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] c=new int[n];
        for(int i=0;i<n;i++)
            {
            c[i]=s.nextInt();
            }
        int b=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            {
            sum+=c[i];
        }
        
        sum=sum-c[k];
        sum=sum/2;
        if(sum==b)
            System.out.print("Bon Appetit");
        else
            System.out.print(b-sum);
    }
            
}
