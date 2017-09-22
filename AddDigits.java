package com.java1995;

import java.util.Scanner;

public class AddDigits {
	   static String num;
	   static int res=0;
public static void main(String[] args) {
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
}