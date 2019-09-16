package oop010;

public class cwm010 {
	/**
	 * template
	 * */
//	static int show(int p){return (p);}
//	static String show(String p){return (p);}
//	static double show(double p){return (p);}
	static <T> T show(T p){return (p);}
	//**** Class Generic****
	
	static class Node <T>
	{   //**** property ****
	    T data;  Node<T> pt;
		
		//**** (method) constructor(«Øºc¤l) ****
		Node() { pt=null; }
		Node(T k) { data=k; pt=null; }
	}
	
	public static void main(String a[]){
		int p = show(30);
		String c = show("ppp");
		System.out.println(p);
		System.out.println(c);
		
		Node<String> m1= new Node<String>();
		Node<Integer> m2= new Node<Integer>();
		
	}
}
