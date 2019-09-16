package mid;
import java.util.*;

public class arraylist {
	static ArrayList <Integer> SetCollect (int a, int b , int c){
		ArrayList<Integer> p=new ArrayList<Integer>();
		for(int i=a;i<=b;i++){
			if(i%c==0){p.add(i);}
		}
		return (p);
	}
	public static void main(String[] a){
		System.out.println(SetCollect(10,80,4));
	}
}
