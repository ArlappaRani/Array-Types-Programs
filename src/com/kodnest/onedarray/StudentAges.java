package com.kodnest.onedarray;

import java.util.Scanner;

public class StudentAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an array
				int []arr=new int[5];
				//Without code redundancy we did not give the ages of students
				//Storing the elements in array
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the ages of student"); 
				//we use length for size(inbuilt)
				for(int i=0;i<=arr.length-1;i++)
				{
					arr[i]=scan.nextInt();//storing the ages in this array
				}
				//Displaying the ages in  array
				for(int i=0;i<=arr.length-1;i++)
				{
					System.out.print( arr[i]+" ");
				}
				


	}

}
