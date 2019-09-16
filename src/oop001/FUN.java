package oop001;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FUN {
	static  int rand(int n){
		return((int)(n*Math.random()));
	}
	static  int rand(int n,int m){
		return(n+rand(m-n+1));
	}
	static String Input(String msg){
		String s="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{System.out.print(msg); s=br.readLine();}
		catch(Exception e){}
		return (s);
	}
}
