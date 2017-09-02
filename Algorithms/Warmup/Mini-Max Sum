import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long[] sum=new long[5];
        sum[0]=b+c+d+e;
        sum[1]=a+c+d+e;
        sum[2]=a+b+d+e;
        sum[3]=a+b+c+e;
        sum[4]=a+b+c+d;
         int min=0,max=0;
        
        for(int i=0;i<5;i++)
          {  
            if(sum[min]>sum[i])
            {
            min=i;
            }
            if(sum[max]<sum[i])
                max=i;
        }
        System.out.print(sum[min]+" "+sum[max]);
    }
}
