package arrayproblems;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int Sem=scan.nextInt();
		String[] arr=new String[Sem];//creating a array
	    //storing the percentage in array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Do you have any backlog in semester"+(i+1));
		    Boolean res=scan.nextBoolean();
		    if(res==true)
		    {
		    	arr[i]="Yes";
		    }
		    else
		    {
		    	arr[i]="No";
		    }
		}
		//Displaying the Semesters
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("The backlog in semester"+(i+1)+"is"+arr[i]);
		}
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		    	
		    	
		   

}
