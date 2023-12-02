package LAB2;

public class seven {
    static int power(int N,int P)
    {
    	if(P==0)
    		return 1;
    	else
    		return N * power(N,P-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int N = 2;
       int P = 7;
       System.out.println(power(N,P));
	}
}