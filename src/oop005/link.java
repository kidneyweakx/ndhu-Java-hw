package oop005;

public class link {
	Node head = null;
	link(){ head=null;}
	
	void append(int d){
		Node p=new Node(d);
		if (head==null){ head=p; }
		else{
			Node tmp=head;
			do{
				if(tmp.pt==null)//** 找到最後一個 **
				{ tmp.pt=p; break; }
				tmp=tmp.pt;//**tmp移到下一個**
			}while(tmp != null);
		}
	}
	void print(){
		Node tmp=head;
		while(tmp!=null){
			System.out.println( tmp.data);
			tmp=tmp.pt;
		}
	}
	Node find(int d){
		Node tmp=head;
		while(tmp!=null){
			if(tmp.data==d){return (tmp);}
			tmp=tmp.pt;
		}
		return (null);
	}
	boolean delete( int d ){
		Node tmp=head;Node tmp2=null;
		//**沒有Node的情況**
		if(tmp.data==d){ return (false); }
		
		//**只有1個Node的情況**
		if((tmp.data==d)||(tmp.pt==null)){ head = null; return (true); }
		if(tmp.pt==null){ return (false);}
		
		//**至少2個Node**
		tmp2=head; tmp=head.pt;
		while(tmp!=null){	
			if(tmp.data==d){ tmp2.pt=tmp.pt; return(true); }
			tmp2=tmp; tmp=tmp.pt;
		}
		return (false);
	}
}
