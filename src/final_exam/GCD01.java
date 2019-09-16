package final_exam;

public class GCD01 {
	public static int gcd(int a, int b) {
		while(b != 0) { 
	        int r = a % b; 
	        a = b; 
	        b = r; 
	    } 
	    return a;
	}
	public static int primesum(int a, int b,int c) {
		int n=0;
		for (int i=a;i<=b;i++) {
		if(gcd(i,c)==1) n+=i;}
		return n;
	}
	public static void main(String[] a) {
		int x=primesum(1,10,4);
		System.out.println(x);
	}
}
