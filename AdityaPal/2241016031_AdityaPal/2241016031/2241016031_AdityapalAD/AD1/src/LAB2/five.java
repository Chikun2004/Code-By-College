package LAB2;
import java.util.*;
public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a, b, gcd;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Two Number");
		    a = sc.nextInt();
		    b = sc.nextInt();
		    gcd = getGcd(a, b);
		    System.out.println("GCD = " + gcd);
		  }
		  public static int getGcd(int a, int b) {
		    if (b == 0) {
		      return a;
		    } else {
		      return getGcd(b, a % b);
		    }
	}

}
