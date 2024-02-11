package com.kodnest.array3d;
import java.util.Scanner;
public class StudentMarksApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of schools");
		int block=scan.nextInt();
		System.out.println("Enter the no of classes");
		int rows=scan.nextInt();
		System.out.println("Enter the no of students in each class");
		int col=scan.nextInt();
		//creating an array
		int[][][] arr=new int[block][rows][col];
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
