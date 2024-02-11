package com.kodnest.onedarray;
import java.util.Scanner;
public class PercentageofStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an array
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of semesters");
		int size=scan.nextInt();
		//storing the percentages so we take float data type in array creation
		float []arr=new float[size] ;
		
		//storing the elements in  array
		for(int i=0;i<=arr.length-1;i++)
		{
//will take i+1 because i starts from 0 so the semester starts from 1 so we add 1 to i
			System.out.println("Enter the percentage for semester"+(i+1));
			arr[i]=scan.nextFloat();
		}
		
		
		//displaying the elements in array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("The percentage of semester"+(i+1)+" "+"is"+arr[i]);
		}
		
		
		
		

	}

}
