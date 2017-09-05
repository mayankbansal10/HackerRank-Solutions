import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        int quo=0,diff=0;
        
        for(int i=0;i<grades.length;i++){
           quo=(grades[i]/5)+1;
            diff=(quo*5)-grades[i];
            if(diff<3 && grades[i]>=38)
                grades[i]=quo*5;
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for(int grades_i=0; grades_i < n; grades_i++){
        System.out.println(result[grades_i]);
        }
    }
}
