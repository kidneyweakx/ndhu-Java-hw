package oophw2;
import java.util.*;

public class AIguess {	
	public static void main(String[] a){
			System.out.println("°õ¦æ¶i¶¥ª©²q¼Æ¦r...");
			ArrayList<String> set=new ArrayList<String>(); int AB=0,A=0,B=0,k=0;
			String gus="",s="",ans="";
			for(int i=1023;i<=9876;i++){
				s=String.valueOf(i);
				if(FUN.CheckSame(s)==false){
					set.add(s);}  }	
			do {
			gus = FUN.Guess("4-Digits:");
			if(set.size()==1||set.size()==0) {
				System.out.println( "4A ,0B" );}
			else
				System.out.println( "0A ,1B" );
			AB=0*10+1;
			for(int i =set.size()-1;i>=0;i--){
				if(FUN.CountAB(gus, String.valueOf(set.get(i)))!= AB){
				set.remove(i);
				}}
			}while((set.size()>10));
			ans=String.valueOf(set.get(FUN.Rand(0, set.size()-1)));
			do{
				gus = FUN.Guess("4-Digits:");
				k=FUN.CountAB(ans,gus);
				B=k%10;A=(k-B)/10;
				System.out.println( A+"A ,"+B+"B" );
			}while(A<4);			
			System.out.println("Good");
			}
}
