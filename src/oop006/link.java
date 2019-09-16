package oop006;

public class link 
{
    Node head=null;
    link() { head=null; }
    
    void append(int d)
    {
    	Node p=new Node(d);
        if(head==null) { head=p; }
        else
        {  	Node tmp=head;
        	do
        	{  if(tmp.pt==null) { tmp.pt=p; break; } //** 找到最後一個 **         	   
        	   tmp=tmp.pt; //** tmp 移到下一個 **	           		   
        	}while(tmp!=null);
        }
    }
    
    void print()
    { 	Node tmp=head;
    	while(tmp!=null)
    	{	System.out.println( tmp.data );
    	    tmp=tmp.pt;
    	}	
    }
    
    Node find(int d)
    {	Node tmp=head;
        while(tmp!=null)
        {  if(tmp.data==d) { return( tmp ); }	
    	   tmp=tmp.pt;
        } 
        return( null );	
    }
    
    boolean delete( int d )
    {
    	Node tmp=head; Node tmp2=null;
    	//** 沒有 Node 的情況 **
    	if(tmp==null) { return(false); }
    	
    	//** 只有1個 Node 的情況 **
    	if( (tmp.data==d)&&(tmp.pt==null) ) { head=null; return(true); }
    	if( tmp.pt==null ) { return( false ); }
    	
    	//** 至少 2個 Node **
    	tmp2=head; tmp=head.pt;
    	while(tmp!=null)
    	{  if(tmp.data==d){ tmp2.pt=tmp.pt; return(true); }	
    	   tmp2=tmp;  tmp=tmp.pt;
    	}
    	return(false);
    }
    boolean insert( int v )
    {
    	Node tmp=head; Node tmp2=null;Node p=new Node(v);
    	//** 沒有 Node 的情況 **
    	if(tmp==null) { head=p; return(true); }    	
    	//** 比第1個 Node 還小(<=)的情況 **
    	if((tmp.data>=v)){p.pt=head; head=p; return (true);}    	
    	//** 比第1個Node大，但link只有一個Node **
    	if((tmp.pt==null)){tmp.pt=p; head=p; return (true);}    	
    	//** 比第1個Node大，但link至少2個Node **
    	tmp=head; tmp2=head.pt;
    	while(tmp2!=null)
    	{  if(tmp2.data>=v){ p.pt=tmp2; tmp.pt=p; return(true); }	
    	   tmp=tmp2;  tmp2=tmp.pt;
    	}
    	tmp.pt=p; return(true);
    }
}



