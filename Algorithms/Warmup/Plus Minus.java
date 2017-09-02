import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        double posNum=0,negNum=0,zeros=0;
        for(int i=0;i<n;i++){
			if(arr[i]>0)
				posNum++;
			if(arr[i]<0)
				negNum++;
			if(arr[i]==0)
				zeros++;
		}
		double num=(double)n;
		double posFrac,negFrac,zerFrac;
		posFrac=posNum/num;
		negFrac=negNum/num;
		zerFrac=zeros/num;
        System.out.println(posFrac);
		System.out.println(negFrac);
		System.out.println(zerFrac);
    }
}
