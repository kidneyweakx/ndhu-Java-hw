package final_exam;

public class Evenstring {
	public static String EvenString(String s) {
		int n=s.length();String x="";
		for(int i=0;i<n;i++) {
			if(i%2!=0) x+=s.charAt(i);
		}
		return x;
	}
	public static void main(String[] a) {
		String s="AB1230GP"; 
		System.out.println(EvenString(s));
	}
}
