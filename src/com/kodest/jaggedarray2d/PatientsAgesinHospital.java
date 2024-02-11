package com.kodest.jaggedarray2d;
import java.util.Scanner;
public class PatientsAgesinHospital {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		//creating an array
		//This program is hard coded
		int [][] arr=new int[3][];
		
		//representing the how many columns are presented in each row
    /*row */arr[0]=new int[2];//representing columns values
            arr[1]=new int[4];
            arr[2]=new int[3];
            
          //Storing the elements in array
           for(int i=0;i<=arr.length-1;i++)//for rows
           {
        	   for(int j=0;j<=arr[i].length-1;j++)//for columns
        	   {
        		   System.out.println("Enter the age of hospital "+" "+(i+1)+"Patient"+(j+1));
        		   arr[i][j]=scan.nextInt();
        	   }
           }
           //Displaying the elements in array
           for(int i=0;i<=arr.length-1;i++)//for rows
           {
        	   for(int j=0;j<=arr[i].length-1;j++)//for columns
        	   {
        		   System.out.println(" The age of hospital "+" "+(i+1)+" "+"Patient"+" "+(j+1)+"is "+arr[i][j]);
        		   
        	   }
           }
	}

}
