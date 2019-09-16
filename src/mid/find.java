package mid;

public class find {
	static int find(String s1,String s2) {
		String z1="";int k=s2.length(),c=0,d=0;
			for(int i=0;i<=s1.length()-k;i++){
			z1=s1.substring(i,i+k);d=s2.indexOf(z1);
			if(d>=0) c++;}
		return(c);
	}
	public static void main(String[] a) {
		System.out.println(find("ACACFAC13AC","AC"));
		}
}
