package mid105;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class one {
	//overload�d��
	static int Rand(int n)	{ 
		return( (int)(n*Math.random()) ); 
	}
	
	static int Rand(int n, int m)	{ 
		return( n+Rand(m-n+1) );
	}
	//Try Catch �d��
	static String Input(String msg)
	{
		String s="";
	    BufferedReader br = new BufferedReader(
	    		                 new InputStreamReader(System.in) );
	    try{ 
	    	  System.out.print(msg); 
	    	  s=br.readLine(); 
	       }
	    catch(Exception e){   }		
		return(s);
	}	
	public static void main(String[] a) {
		//�e����&��e���j��d��
		int i=1;
		while(i>1) {
			System.out.println(i);
			i--;
		}//�e����
		System.out.println("===========");
		i=1;
		do {
			System.out.println(i);
			i--;
		}while(i>1);//��e��
	}
}
