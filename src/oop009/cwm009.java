package oop009;

import java.util.*;

public class cwm009 {
	
	static ArrayList<Integer> p;
	public static void main(String a[]){
		p=new ArrayList<Integer>();
		p.add(45);p.add(69);p.add(13);
		for(int i : p){
			System.out.println(i);}
		p.remove(1);
		System.out.println("===========");
		for(int i:p){
			System.out.println(i);
		}
	}
}
