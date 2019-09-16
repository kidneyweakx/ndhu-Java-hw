package oop007;

	
public class cwm007 {
	static int sum( int n ){
		if (n==1){return(1);}
		return( n+sum(n-1));
	}
	static String binary( int n){		
		if(n<2){return(String.valueOf(n));}
		return( binary(n>>1)+String.valueOf(n%2));
	}
	static int max (int a, int b){
		if(a>b){return (a);}else {return (b);}
	}
	static int max (int a, int b,int c){
		return(max(max(a,b),c));
	}
	public static void main(String[] a){
		int k =sum(100);
		System.out.println(k);
		int n=255; System.out.println(binary(n));
	}
}
