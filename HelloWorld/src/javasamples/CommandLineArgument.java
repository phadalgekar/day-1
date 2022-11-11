package javasamples;

import java.util.Scanner;

public class CommandLineArgument {
	public static void main(String rgs[]) {
		Scanner ref=new Scanner(System.in);
		System.out.println("Write your wish : ");
		String s=ref.nextLine();
		System.out.println("Your wish is: "+s);
	}

}
