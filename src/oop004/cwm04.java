package oop004;

public class cwm04 {
	static int binaryToint(String s){
		String z="";int sum=0,k=0,i=0,b=0;
		k=s.length();b=1;
		for(i=k-1;i>=0;i--){
			z=s.substring(i, i+1);
			if(z.compareTo("1")==0){sum=sum+b;}
			b=b*2;
		}
		return (sum);
	}
	public static void main(String[] a){
		String s=FUN.Input("Enter a Binary");
		System.out.println(binaryToint(s));
	}

}
