package com.kodnest.onedarray;

import java.util.Scanner;

public class BacklogsOfStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of Semesters"); 
		int semester=scan.nextInt();
		//creating an array
		//will take data type as String because will taking the user input as true or false but will display yes or no
		String []arr=new String[semester];
		
		//Strong the elements in array
		for(int i=0;i<=arr.length-1;i++)
		{
			
			System.out.println("Do you have any backlogs in semester"+(i+1));
			boolean res=scan.nextBoolean();
			if(res==true)
			{
				arr[i]="Yes"; 
			}
			else
			{
				arr[i]="No";
			}
			
			
		}
		
		//Display the elements in array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Backlog in semester"+" " +(i+1)+":"+arr[i]);
			
		}
	}
}

