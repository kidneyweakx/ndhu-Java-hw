package oophw2;
import java.util.*;

public class homework_normal {

	private int A=0;
    private ArrayList<String> set=new ArrayList<String>();
    public homework_normal(){
    	this(0,"");
    }

public homework_normal(int i, String string) {
		this.A=A;
		this.set=set;
	}

static int human(int A,String ans){
  //****人猜電腦****
  
  System.out.println("執行人猜電腦...");
  String gus;
  System.out.println("Ans="+ans);int k,B;
  gus = FUN.Guess("4-Digits:");
  k=FUN.CountAB(ans,gus);
  B=k%10;A=(k-B)/10;
  System.out.println( A+"A ,"+B+"B" );
  if(A==4) System.out.println("人贏");
  return A;
 }
 static homework_normal com(int A,ArrayList<String> set) {
  System.out.println("執行電腦猜人...");
  //**** Put all of the solution to a collection****
  int AB=0,B=0;homework_normal t = new homework_normal();
  String Gus="";
  
  //****Randomly select a number <N> from Collection and show it***
  Gus=String.valueOf(set.get(FUN.Rand(0,set.size()-1)));
  System.out.println("My guess is..."+Gus);  
  //****Get ?A,?B  from player ****
  A=FUN.InputNum("?A", "");B=FUN.InputNum("?B", "");AB=A*10+B;
  //****Delete the numbers form 'set' which are not ?A,?B ****
  for(int i =set.size()-1;i>=0;i--){
  if(FUN.CountAB(Gus, String.valueOf(set.get(i)))!=AB){
   set.remove(i);
   }}
  if(set.size()==0){ System.out.println("智障!!");}
  else if(A==4){System.out.println("電腦贏");}
  t.A=A;t.set=set;
  return t;
 }
 public static void main(String arg[]){
  int num=0;String ans = FUN.MakeAnswer();
  int A=0;String s="";homework_normal t=new homework_normal();
  for(int i=1023;i<=9876;i++){
   s=String.valueOf(i);
   if(FUN.CheckSame(s)==false){
    t.set.add(s);} }
  num=FUN.InputNum("輸入先後順序:1.人猜電腦,2.電腦猜人:","");
  if(num==1) {
  do{
   A=human(A,ans); 
  if(A==4) break;
   else  {t=com(A,t.set);A=t.A;}
   }while((A<4)&&(t.set.size()>0));
  }
  else if(num==2) { 
  do{  
   t=com(A,t.set); A=t.A;
   if(A==4) break;
   else A=human(A,ans);
   }while((A<4)&&(t.set.size()>0));
  }
 }
}