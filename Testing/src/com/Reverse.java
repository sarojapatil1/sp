package com;

public class Reverse {

	public static void main(String[] args) {
		int x= 1234578;
		
		int reverse=0;    //reminder=g
		
	 for(x=x;x!=0;x=x/10) {
		 int g=x%10;
		 reverse=reverse*10+g;
	 }
System.out.println("reverse no is "+reverse);
}
}