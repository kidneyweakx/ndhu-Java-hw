package oopguess01;

public class cwmguess01 {
	static int CountAB(String s1,String s2){
		String z=""; int k=0 , A=0 , B=0;
		for(int i=0;i<4;i++){
			z=s2.substring(i,i+1);k=s1.indexOf(z);
			if(k>=0){
				if(k==i){A++;}
				else {B++;}
			}
		}
		return(A*10+B);
	}
	public static void main(String[] a){
		String ans = FUN.MakeAnswer();String gus;
		System.out.println("Ans="+ans);int k,A,B;
		do{
			gus = FUN.Guess("4-Digits:");
			k=CountAB(ans,gus);
			B=k%10;A=(k-B)/10;
			System.out.println( A+"A ,"+B+"B" );
		}while(A<4);
		System.out.println("Good");
	}
}	
