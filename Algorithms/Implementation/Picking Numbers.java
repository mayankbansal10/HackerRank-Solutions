import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int[] b= new int[n];
        int[] c= new int[n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]-a[j]<=1 && a[i]-a[j]>=0)
                    b[i]++;       
            }}
        int max1=b[0];
        for(int i=1;i<n;i++){
            if(b[i]>max1)
                max1=b[i];
        }
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]-a[j]>=-1 && a[i]-a[j]<=0)
                    c[i]++;       
            }}
        int max2=c[0];
        for(int i=1;i<n;i++){
            if(c[i]>max2)
                max2=c[i];
        }
        if(max1>=max2)
        System.out.println(max1);
        else
            System.out.println(max2);
    }
}
