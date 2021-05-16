package hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
	
	public static String timeConversion(String s) {
		 String[] split_string=s.split(":");
		    int a=Integer.parseInt(split_string[0]);
		    int b=Integer.parseInt(split_string[1]);
		    String c=split_string[2];
		      //  String b=split_string[1];
		       // String c=split_string[2];
		        String time_ss=c.substring(0,2);
		        int time_ss1=Integer.parseInt(time_ss);
		        String am_pm=c.substring(2,4);
		        String am="AM";
		        String pm="PM";
		       // System.out.println(a+" "+b+" "+c+ " " +am_pm);
		        if(am_pm.equals(am) && a==12){
		            a=00;
		           // System.out.println(a);
		        }
		        if(am_pm.equals(pm) ){
		            if(a>=12){
		             a=a;   
		    
		            }
		            else{
		            a=a+12;}
		           // System.out.println(a);
		        }
		       //return  System.out.printf("%02d:%02d:%02d",a,b,time_ss1);
		        //System.out.println(s);
		       // return s;
		     // System.out.printf("%02d:%02d:%02d",a,b,time_ss1);
		     //  return String.format("%02d:%02d:%02d",hour,min,sec);
		      return s.format("%02d:%02d:%02d",a,b,time_ss1);
	}

	public static void main(String[] args){
		
		String s = "02:01:00PM";
		System.out.println(timeConversion(s));

	}

}
