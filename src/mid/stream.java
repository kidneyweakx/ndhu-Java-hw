package mid;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class stream {
	static String Input(String msg)	{
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
	
	public static void main(String arg[]){
		int a=0,b=0;
		a=Integer.parseInt(Input(""));
		b=Integer.parseInt(Input(""));
	    int k=a,m=1;
	    if(a>b){k=b;}
	    for(int i=k;i>=1;i--){if(a%i==0&&b%i==0){m=i;}}
	    System.out.println("GCD"+m);		
	}
}
