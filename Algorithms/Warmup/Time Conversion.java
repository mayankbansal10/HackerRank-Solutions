import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String hr=time.substring(0, 2);
		String min=time.substring(3, 5);
		String sec=time.substring(6, 8);
		String tm=time.substring(8, 10);
		switch(hr)
		{
		case "01":
			if(tm.equals("AM")){
				hr="01";
			}
			else if(tm.equals("PM"))
				hr="13";
			break;
		case "02":
			if(tm.equals("AM")){
				hr="02";
			}
			else if(tm.equals("PM"))
				hr="14";
			break;
		case "03":
			if(tm.equals("AM")){
				hr="03";
			}
			else if(tm.equals("PM"))
				hr="15";
			break;
		case "04":
			if(tm.equals("AM")){
				hr="04";
			}
			else if(tm.equals("PM"))
				hr="16";
			break;
		case "05":
			if(tm.equals("AM")){
				hr="05";
			}
			else if(tm.equals("PM"))
				hr="17";
			break;
		case "06":
			if(tm.equals("AM")){
				hr="06";
			}
			else if(tm.equals("PM"))
				hr="18";
			break;
		case "07":
			if(tm.equals("AM")){
				hr="07";
			}
			else if(tm.equals("PM"))
				hr="19";
			break;
		case "08":
			if(tm.equals("AM")){
				hr="08";
			}
			else if(tm.equals("PM"))
				hr="20";
			break;
		case "09":
			if(tm.equals("AM")){
				hr="09";
			}
			else if(tm.equals("PM"))
				hr="21";
			break;
		case "10":
			if(tm.equals("AM")){
				hr="10";
			}
			else if(tm.equals("PM"))
				hr="22";
			break;
		case "11":
			if(tm.equals("AM")){
				hr="11";
			}
			else if(tm.equals("PM"))
				hr="23";
			break;
		case "12":
			if(tm.equals("AM")){
				hr="00";
			}
			else if(tm.equals("PM"))
				hr="12";
			break;
		}
		
		
		System.out.println(hr+":"+min+":"+sec);
    }
}
