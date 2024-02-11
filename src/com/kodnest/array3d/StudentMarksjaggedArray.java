package com.kodnest.array3d;

import java.util.Scanner;

public class StudentMarksjaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of schools");
		int block=scan.nextInt();
		//creating an array
		int[][][] arr=new int[block][][];
		//in each block representing the rows
		//creating rows in 3d jagged array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the no of classes in each School"+(i+1));
			int row=scan.nextInt();
			arr[i]=new int[row][];
		}
		//Creating columns in 3d jagged array
		//for every block every row column will be represent
        for(int i=0;i<=arr.length-1;i++)
		{
        	for(int j=0;j<=arr[i].length-1;j++)
        	{
        	System.out.println("Enter the no of students in school"+(i+1)+"class"+(j+1));
        	int col=scan.nextInt();
			arr[i] [j]=new int[col];
		}}
		
		//Storing the marks in array
		for(int i=0;i<=arr.length-1;i++)//for blocks
		{
			for(int j=0;j<=arr[i].length-1;j++)//for rows
			{
				for(int k=0;k<=arr[i][j].length-1;k++)//for columns
				{
					System.out.println("Enter the marks for school"+(i+1)+" "+"class"+(j+1)+" "+"student"+(k+1));
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		//displaying the marks in array
	   for(int i=0;i<=arr.length-1;i++)//for blocks
			{
			  for(int j=0;j<=arr[i].length-1;j++)//for rows
					{
						for(int k=0;k<=arr[i][j].length-1;k++)//for columns
						{
							System.out.println("The marks for school"+(i+1)+" "+"class"+(j+1)+" "+"student"+(k+1)+"is"+arr[i][j][k]);
							
						}
					}
				}
				

	}
	}



