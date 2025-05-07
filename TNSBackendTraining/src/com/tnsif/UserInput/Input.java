package com.tnsif.UserInput;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Input {

	public static void main(String[] args) throws IOException {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=sc.nextLine();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Name:"+name+",age: "+age);
*/
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name :");
		String name=bf.readLine();
		System.out.println("Enter the age");
		int age=bf.read();
		System.out.println("Name:"+name+",age: "+age);	
	}

}
