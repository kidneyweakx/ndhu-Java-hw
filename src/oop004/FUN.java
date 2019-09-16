package oop004;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FUN 
{
	static int Rand(int n)
	{ return( (int)(n*Math.random()) ); }
	
	static int Rand(int n, int m)
	{ return( n+Rand(m-n+1) ); }
	
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
	
	static int InputNum(String msg, String errmsg)
	{
		boolean fg=false; int k=0; String s;
		do{
			fg=false;
	        try
		    { s=FUN.Input(msg);  k=Integer.parseInt(s); }
	        catch(Exception e)
	        { System.out.println(errmsg);  fg=true; }
		}while(fg==true);    
		return(k);
	}	
	static String toBinary(int x){
		int p=0;String s="";
		do{
		p = x%2;
		x =(x-p)/2;
		s = String.valueOf(p) + s;
		}while(x>0);
		return (s);
	}
	static String toHex(int x){
		int p=0;String s="";
		do{
		p = x%16;
		x =(x-p)/16;
		if(p<10){s = String.valueOf(p) + s;}
		else{ 
			p=p+55;
			s =(char)(p)+s;
		}
	}while(x>0);
		return (s);
}
}



