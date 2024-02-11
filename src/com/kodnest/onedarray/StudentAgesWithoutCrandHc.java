package com.kodnest.onedarray;
import java.util.Scanner; 
public class StudentAgesWithoutCrandHc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an array
		int []arr=new int[5];
		//Without code redundancy we did not give the ages of students
		//Storing the elements in array
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the ages of student"); 
		for(int i=0;i<=4;i++)//here hard coded the size of array
		{
			arr[i]=scan.nextInt();//storing the ages in this array
		}
		//Displaying the ages in  array
		for(int i=0;i<=4;i++)
		{
			System.out.print( arr[i]+" ");
		}
		

	}

}
