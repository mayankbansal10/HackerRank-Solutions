import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
       if(x1>x2 && v1>v2)
            System.out.print("NO");
        else if(x2>x1 && v2>v1)
            System.out.print("NO");
        else
            {
                int dis1=x1,dis2=x2,diff;
                if(dis1>dis2)
                	diff=dis1-dis2;
                else
                	diff=dis2-dis1;
                while(diff>0) 
               {
                     dis1+=v1;
                    dis2+=v2;
                    if(dis1>dis2)
                    	diff=dis1-dis2;
                    else
                    	diff=dis2-dis1;
                }
            if(diff==0)
                System.out.print("YES");
            else
                System.out.print("NO");
            }   
    }
}
