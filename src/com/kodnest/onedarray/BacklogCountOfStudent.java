package com.kodnest.onedarray;

import java.util.Scanner;

public class BacklogCountOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of Semesters"); 
		int semester=scan.nextInt();
		//creating an array
		//will take data type as Integer because will taking the backlog count from user
		int []arr=new int[semester];
		
		//Strong the elements in array
		for(int i=0;i<=arr.length-1;i++)
		{
			
			System.out.println("Do you have any backlogs in semester"+(i+1));
			boolean res=scan.nextBoolean();
			if(res==true)
			{
				System.out.println("Enter the no backlogs in semester"+(i+1));
			    arr[i]=scan.nextInt();
			}
			else
			{
				arr[i]=0;
			}
			
			
		}
		
		//Display the elements in array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("The no of Backlog in semester"+" " +(i+1)+":"+arr[i]);
			
		}
	}


	}


