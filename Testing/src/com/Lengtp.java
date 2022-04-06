package com;

public class Lengtp {

	public static void main(String[] args) {
		int no=12456;
		int length=0;
		while(no>0) {
			no=no/10;
			length=length+1;
		}
System.out.println("The total no of length is:"+ length);
	}

}
