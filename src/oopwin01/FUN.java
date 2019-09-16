package oopwin01;
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
	static boolean CheckSame(String s){
		String z1="",z2="";int k=s.length();
		if(k<=1){ return (false);}
		z1=s.substring(0,1);z2=s.substring(1,k);
		if(z2.indexOf(z1)<0){return (CheckSame(z2));}
		else {return (true);}
	}
	static String MakeAnswer(){
		String s;
		do{
			s=String.valueOf(FUN.Rand(1023,9876));
		}while( CheckSame(s)==true);
		return(s);
	}
	static String Guess(String msg){
		String s=""; int k=0; boolean fg;
		do{
			s=FUN.Input(msg);fg=false;
			try{ k=Integer.parseInt(s);} catch(Exception e){ fg=true;}
		}while((s.length()!=4)||(FUN.CheckSame(s)==true)||(fg==true));
		return(s);
	}
}



