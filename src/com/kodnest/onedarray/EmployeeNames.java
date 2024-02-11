package com.kodnest.onedarray;
import java.util.Scanner;
public class EmployeeNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an array
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=scan.nextInt();
		String []arr=new String[size];
		
		//Storing the employee names in array
		System.out.println("Enter the names of employee"); 
		String names=scan.nextLine();
		//Using in built variable length for size of an array using arr.length
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextLine();//next line using for storing multiple words
		}
		
		//Displaying the elements in array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Employees names in the company"+" "+arr[i]);
		}
		

	}

}
