package com.bridgelabz;
import java.util.Scanner;
     public class linecomparison {
	 public static void main(String[] args){
		System.out.println("Welcome to Line Comparison program");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter co-ordinates of first line = ");
  	    double x1=sc.nextDouble();
  	    double y1=sc.nextDouble();
  	    double x2=sc.nextDouble();
  	    double y2=sc.nextDouble();
		double length1 = Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
		System.out.println("The Length of Line 1 is = " + length1);
		
		System.out.println(" Enter co-ordinates of second line = ");
  	    double a1=sc.nextDouble();
  	    double b1=sc.nextDouble();
  	    double a2=sc.nextDouble();
  	    double b2=sc.nextDouble();
  	  double length2 = Math.sqrt(Math.pow((a2-a1),2)+Math.pow((b2-b1),2));
	    System.out.println(" Length of line2 is = "+length2);
	    if (length2 == length1)
    	System.out.println("Two Lines are Equal");
       else
        System.out.println("Two Lines are Not Equal");
	}

}