package mid;

public class repeat {
	static String Repeat(String s,int n){
		String ans="";
		for(int i=0;i<n;i++){
			ans+=s;
		}
		return(ans);
	}
	public static void main(String[] a) {
		System.out.println(Repeat("AB",3));
		}
}
