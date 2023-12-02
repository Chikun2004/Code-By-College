import java.util.Scanner;
public class one {
	  
	public static void main(String[] args)   
	{  
	 Scanner sc  =new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int n= sc.nextInt();
	 int i , sum = 0;
	 for(i=0;i<=n;i++) {
		 sum = sum + i;
	 }
	 System.out.println("The sum of n number :"+ sum);
	}
	}