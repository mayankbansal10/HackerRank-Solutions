import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        boolean[] f=new boolean[n];
        int m=0;
        
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<n;j++)
            {
                if(c[i]==c[j] && f[i]==false && f[j]==false && i!=j)
                    {
                    m++;
                    f[i]=true;
                    f[j]=true;
                    }
            }
       }
        System.out.print(m);
		
		
    }
}
