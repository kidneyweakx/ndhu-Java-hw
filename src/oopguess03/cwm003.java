package oopguess03;
import java.util.*;

public class cwm003 {
	public static void main(String a[]){
		//**** Put all of the solution to a collection****
		ArrayList<String> set=new ArrayList<String>();int AB=0,A=0,B=0;
		String Gus="",s="";
		for(int i=1023;i<=9876;i++){
			s=String.valueOf(i);
			if(FUN.CheckSame(s)==false){
				set.add(s);} }
		//****Randomly select a number <N> from Collection and show it***
		do{
		Gus=String.valueOf(set.get(FUN.Rand(0, set.size()-1)));
		System.out.println("My guess is..."+Gus);		
		//****Get ?A,?B  from player ****
		A=FUN.InputNum("?A", "");B=FUN.InputNum("?B", "");AB=A*10+B;
		//****Delete the numbers form 'set' which are not ?A,?B ****
		for(int i =set.size()-1;i>=0;i--){
			if(FUN.CountAB(Gus, String.valueOf(set.get(i)))!=AB){
			set.remove(i);
			}}
		}while((A!=4)&&(set.size()>0));
		if(set.size()==0){ System.out.println("´¼»Ù!!");}
		else{System.out.println("Good!!");}
	}
}
		

