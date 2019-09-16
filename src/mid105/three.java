package mid105;

public class three {
	static String SameChar(String s1,String s2) {
		String Same="";int c=s1.length(),k=s2.length();
		for(int i=0;i<c;i++) {
			for(int n=0;n<k;n++) {
				if(s1.charAt(i)==s2.charAt(n)) {
					Same+=s1.charAt(i);}
			}
		}
		return(Same);
	}
	public static void main(String[] a) {
		String s1="AB1230GP";
		String s2="WSAV2PDP";
		String z=SameChar(s1,s2);
		System.out.println(z);
	}
}
