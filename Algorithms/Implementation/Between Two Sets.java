import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        int c=0;
        boolean flag=false;
        
        for(int i=a[a.length-1];i<=b[0];i++)
        {
            flag=false;
            for(int j=0;j<a.length;j++)
            {
                if(i%a[j]!=0)
                {
                    flag=true;
                    break;
                    
                }
            }
            //if(flag==true)
                //break;
            for(int j=0;j<b.length && flag==false;j++)
            {
                if(b[j]%i!=0)
                {
                    flag=true;
                    break;
                    
                }
            }
            if(flag==false)
            c++;
            
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
