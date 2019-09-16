package oop005;

public class stack {
	Node head=null;
	
	stack(){ head=null;}
	
	void push(int d){
		
		Node p=new Node(d);
		if(head==null){ head=p; }
		else
		{ p.pt=head; head=p; }
	}
	int pop(){
		if(head==null){ return (-9999);}
		else{ 
			int k=head.data;head=head.pt;
			return (k);			
		}
	}
}
