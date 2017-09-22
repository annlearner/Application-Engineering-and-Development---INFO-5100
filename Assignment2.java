package com.java1995;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

		 class EmployeeSalary {
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
			
			   static String num;
			   static int res=0;
			   
		public static void addDigits(){
					@SuppressWarnings("resource")
					Scanner scan=new Scanner(System.in);
					System.out.print("please enter you number:"); 
					num=scan.nextLine(); 
					int input=Integer.parseInt(num);
					if(num==null){
						System.out.print("the sum does not exist");
					}else{
					System.out.print("the sum is "+addDigits(input));
					}
					
			}
			
		public static int addDigits(int input){
			int sum=0;
			String p=String.valueOf(input);
			for (int i = 0; i < p.length(); i++) {
				String []a=new String[p.length()];
				a[i]=num.substring(i,i+1);
				sum+=Integer.parseInt(a[i]);
				//将整型数转化为string
				}
			if(sum>=10){
				res=addDigits(sum);
		   }else{
				res=sum;
				}
		    return res;
		}
		
		
		public static int n=42;
		
		public static void PerfectNumbers(){
			printPerfectNumbers(n); 
		}
	public static void printPerfectNumbers( int n){
		//find all of the factors
		 for (int p = 1; p < n; p++){
			 int sum = 0;
			int factor=1;
			List <Integer>factors=new ArrayList<>();
		while(factor<p){
			if(p%factor==0){
				factors.add(factor);
				}
					factor++;
				}
			for (int i = 0; i < factors.size(); i++){ 
				int j=(Integer) factors.get(i);
				sum+=j;
				}
			if(p==sum){
				 System.out.println(p);
			}
			}
		}
		
	
	
}


