package com.kodest.jaggedarray2d;
import java.util.Scanner;
public class PercentageOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of  classes");
		int row=scan.nextInt();
		//creating an array
		float[][]arr=new float[row][]; 
		//in each row how many students are presented
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.println("Enter the no of students in each class"+(i+1));
		int col=scan.nextInt();
		arr[i]=new float[col];
		}
		//Storing the data in array
		for(int i=0;i<=arr.length-1;i++)//for rows
		{
			for(int j=0;j<=arr[i].length-1;j++)//for columns
			{
				System.out.println("Enter the percentage of class"+(i+1)+" "+"Student"+" "+(j+1));
				arr[i][j]=scan.nextFloat();
			}
		}
		
		//Displaying the data in array
		for(int i=0;i<=arr.length-1;i++)//for rows
		{
			for(int j=0;j<=arr[i].length-1;j++)//for columns
			{
				System.out.println("The percentage of class"+(i+1)+" "+"Student"+" "+(j+1)+"is:"+arr[i][j]);
			}
		}
		

}}
