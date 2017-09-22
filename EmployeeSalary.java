package com.java1995;

import java.util.Scanner;

	public class EmployeeSalary {
		  static double salary;
		  public static void main(String[] args) {
			    double hours=0.00;
			    
				System.out.print("please enter the work hours(range is from 0 to 48):");
			    Scanner scan=new Scanner(System.in); 
			    hours=scan.nextDouble();
			    System.out.print("salary is"+employeeSalary(hours));
		 }
		 
		public static  double employeeSalary( double hours){
			//The first 36 hours worked are paid at a rate of 15.0
		if(hours<=36){
			salary=15*hours;
			//then the next 5 hours are paid at a rate of 15 * 1.5
		}else if(hours>36 && hours<=41){
		 salary=36*15+15*1.5*(hours-36);
		}else if(hours>41 && hours<=48){
			 salary=36*15+15*1.5*5+15*2*(hours-41);
		}
		return salary;
		}
		
		}
