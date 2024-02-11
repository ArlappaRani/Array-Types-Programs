package com.kodnest.twodarray;

public class MarksOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an array
		int [][]arr=new int[2][4];
		//storing the elements the array
		arr[0][0]=78;//hard coded and code redundancy will be presented
		arr[0][1]=87;
		arr[0][2]=88;
		arr[0][3]=98;
		arr[1][0]=54;
		arr[1][1]=63;
		arr[1][2]=78;
		arr[1][3]=45;
		//displaying the elements in array
        System.out.print(arr[0][0]+" ");
        System.out.print(arr[0][1]+" ");
        System.out.print(arr[0][2]+" ");
        System.out.print(arr[0][3]+" ");
        System.out.print(arr[1][0]+" ");
        System.out.print(arr[1][1]+" ");
        System.out.print(arr[1][2]+" ");
        System.out.print(arr[1][3]+" ");

	}

}
