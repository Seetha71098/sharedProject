package sharedProject;

import java.util.Scanner;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        
        System.out.println((num1>num2 && num1>num3)?num1:(num2>num3 && num2>num1)?num2:num3);
	}

}
