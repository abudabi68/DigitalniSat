package edu.logic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Whatch {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat(" yyyy/MM/dd/HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		Date today=new Date();
		System.out.println("Danas je Casova "+today.getHours());
		int gornjaGranica=15;
		int donjaGranica=5;
		int ucesnici[]={5,22,1,68,42};
		int first,second,thrid;
		Random rand=new Random();
		int brzina=rand.nextInt(15)+5;
        System.out.println(brzina);
        int[] A = {2, 4, 3, 5, 5};
        Arrays.sort(A);
        int min = A[0];
        first=second=thrid=min;
        int max = A[A.length -1];
        System.out.println("Min Value = " + min);        
        System.out.println("Max Value = " + max);
        for(int i=0; i<A.length;i++){
        	if(A[i]>first){
        		thrid=second;
        		second=first;
        		first=A[i];
        	}
        	else if(A[i]>second){
        		thrid=second;
        		second=A[i];		
        	}
        	else if(A[i]>thrid){
        		thrid=A[i];
        	}
        }
        System.out.println("Prva tri elenta u nizu su : "+first +" " +second + " " +thrid );	
        
        
        
	}

}
