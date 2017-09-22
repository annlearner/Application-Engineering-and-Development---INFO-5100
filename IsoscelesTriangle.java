package com.java1995;

import java.util.Scanner;

public class IsoscelesTriangle {
	public static void main(String args[]){
		System.out.print("please enter the length of the equal side:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printIsoscelesTriangle(n);
	}
public static void printIsoscelesTriangle(int n){
	//根据输入的长度计算打出多少行，及每行的布局分部。
	for(int i=1;i<=n;i++){
		if(i<n){
		   for(int p=0;p<=i;p++){
				if(p==0||p==i-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
		   }
		   System.out.println();
		}else if(i==n){
			for(int t=0;t<i;t++){
				System.out.print("*");
		}
		}
		System.out.println();
		}
		
			
		}
			
		}
	

