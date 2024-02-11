package com.kodnest.matrix;

import java.util.Scanner;

public class SumOfElementsOfRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int rows=scan.nextInt();
		System.out.println("Enter the no of columns");
		int col=scan.nextInt();
		//creating a matrix
		int[][]matrix=new int[rows][col];
		//Storing the elements in matrix
		System.out.println("Enter the numbers in matrix");
		for(int i=0;i<=matrix.length-1;i++)//for rows
		{
			for(int j=0;j<=matrix[i].length-1;j++)//for columns
			{
				
				matrix[i][j]=scan.nextInt();
			}
		}
		//displaying the elements in matrix
		int sum=0;
		for(int i=0;i<=matrix.length-1;i++)//for rows
		{
			for(int j=0;j<=matrix[i].length-1;j++)//for columns
			{
				
				sum=sum+matrix[i][j];
				
			}
				System.out.println("The sum of elements are:"+sum);
		}
				
				System.out.println();
		}}
		

	
		
		
	



