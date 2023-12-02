package LAB2;
import java.util.Scanner;
public class six {
	static char[] hexChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	  
	  static String strHex = "";
	  static int num = 0;

	  public static String decToHex(int dec) {
	    if (dec != 0) {
	      num = dec % 16;
	      strHex = hexChar[num] + strHex;
	      dec = dec / 16;
	      decToHex(dec);
	    }
	    return strHex;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner X = new Scanner(System.in);
	    int num = 0;
	    String res;
	    System.out.printf("Enter number: ");
	    num = X.nextInt();
	    res = decToHex(num);
	    System.out.printf("Hex-Decimal number is: " + res);
	}
}