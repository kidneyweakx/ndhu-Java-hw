package final_exam;

public class inverse {
	public static String insert(String a,String b,int c) {
		return(a.substring(0,c+1)+b+a.substring(c+1,a.length()));
	}
	public static String verse(String s) {
		String n="";
		for(int i=s.length();i>0;i--) {
			n=insert(n,s.substring(i-1, i),n.length()-1);
		}return n;
	}
	public static void main(String[] a) {
		System.out.println(verse("ABCDE"));
	}
}
