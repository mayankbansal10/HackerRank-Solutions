import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        String st=s.next();
        int m=st.length();
        int sum=0,count=0,vcount=0;
        boolean up=false;
        
        for(int i=0;i<m;i++){
            if(sum==0 && up==false &&i!=0 )
                count++;
            if(st.charAt(i)=='U')
            {
                if(sum==0)
                {
                   sum=sum-1; 
                   up=true;
                }
                else{
                    sum=sum-1; 
                }
                
            }else if(st.charAt(i)=='D')
            {
                if(sum==0){
                    up=false;
                    sum+=1;
                    vcount++;
                }else{
                    sum+=1;
                }
            }
            
        }
        if(sum==0)
                count++;
        System.out.println(vcount);
    }
}
