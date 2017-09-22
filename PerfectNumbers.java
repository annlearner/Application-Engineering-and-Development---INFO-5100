package com.java1995;

import java.util.ArrayList;
import java.util.List;
 
public class PerfectNumbers {
	public static int n=42;
	
	public static void main(String arg[]){
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


