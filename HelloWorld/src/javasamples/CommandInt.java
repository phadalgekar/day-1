package javasamples;

import java.util.Scanner;

public class CommandInt {
	public static void main(String args[]) {
		int a,b,sum;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the first number");
		a=scanner.nextInt();
		System.out.println("enter the second number");
		b=scanner.nextInt();
		sum=sum(a,b);
		System.out.println("the sum of two numbers a and b is:"+sum);
	}
	public static int sum(int x,int y) {
		int sum=x+y;
		return sum;

	}
	

}
