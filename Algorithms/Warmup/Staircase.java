import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int j=0;
        for(int i=0;i<n;i++){
            j=0;
            for(j=0;j<n-i-1;j++)
                {
                System.out.print(" ");
            }
            for(;j<n;j++)
                {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
