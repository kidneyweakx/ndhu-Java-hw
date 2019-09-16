package mid;

public class exam {
	static void printx(String s){
		
		for(int i =0;i<s.length();i++)
		System.out.println(s.substring(0,i+1));
	}
	static String inverse(String s){
		String c="";
		for(int i=s.length();i>0;i--){
			c+=s.substring(i-1,i);
		}
		return c;
	}
	public static void main(String a[]){
		printx("ABCDE");
		System.out.println(inverse("ABCDE"));
	}
}
