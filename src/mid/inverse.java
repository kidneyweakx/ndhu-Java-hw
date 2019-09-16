package mid;

public class inverse {
	static String Inverse(String s){
		int i=s.length();
		if(i==1) return s.substring(0,1);
		else return (s.substring(i-1,i)+Inverse(s.substring(0,i-1)));
	}
	public static void main(String[] a){
		System.out.println(Inverse("ABCDE"));
	}
}
