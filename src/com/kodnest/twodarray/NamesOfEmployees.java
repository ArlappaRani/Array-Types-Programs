package com.kodnest.twodarray;
import java.util.Scanner;
public class NamesOfEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of companies");
		int row=scan.nextInt();
		System.out.println("Enter the no of employees in each company");
		int col=scan.nextInt();
		//Creating an array
		//taking the names of employee so will take string data type
		String[][]arr=new String[row][col];
		
		//Storing the elements in array
		for(int i=0;i<=arr.length-1;i++)//for rows or companies
		{
			for(int j=0;j<=arr[i].length-1;j++)//for columns or employees
			{
				System.out.println("Enter the name for company"+" "+(i+1)+"employee"+" "+(j+1));
				arr[i][j]=scan.next();
			}
		}
		//Displaying the array elements
		for(int i=0;i<=arr.length-1;i++)//for rows or companies
		{
			for(int j=0;j<=arr[i].length-1;j++)//for columns or employees
			{
				System.out.println(" The name of company"+" "+(i+1)+"employee"+" "+(j+1)+"is"+arr[i][j]);
			}
	     }

}
}
