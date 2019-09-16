package mid;


public class mid {
	static String Sixth(int n){
		int p=0;String s="";
		do{
		p = n%6;
		n =(n-p)/6;
		s = String.valueOf(p) + s;
		}while(n>0);
		return (s);
	}
	static boolean Same(String s1,String s2){
		if(s2.compareTo(s1)==0){return (true);}
		else return false;
	}
	
	public static void main(String a[]){
		System.out.println(Sixth(27));
	}
}
