package oopwin07;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class cwm007 extends Frame implements Runnable,ActionListener {	
	Thread th1,th2;int cnt=0;Button bt1,bt2;int dx1=1,dx2=2;
	cwm007(){
		this.setSize(600,500);this.setLocation(200,50);this.setLayout(null);
		bt1=new Button("OK"); bt1.setSize(60,40); bt1.setLocation(50,50);
		bt2=new Button("OK"); bt2.setSize(60,40); bt2.setLocation(50,150);
		this.add(bt1); this.add(bt2); 
		th1=new Thread(this); th1.start(); th2=new Thread(this); th2.start();		
		bt1.addActionListener(this);			
		this.setVisible(true);
	}
	@Override
	public void run() {	
		if(Thread.currentThread()==th1) {	
			while(true) {	
				//cnt=(cnt+1)%10000;
				int x=bt1.getX();int y=bt1.getY();
				if(x>=(600-bt1.getWidth())||x<=0){dx1=dx1*-1;}
				bt1.setLocation(x+dx1*FUN.Rand(3),y);
				try{ Thread.sleep(1);}catch(Exception e){}
			} }
		else if(Thread.currentThread()==th2) {	
			while(true) {
				int x=bt2.getX();int y=bt2.getY();
				if(x>=(600-bt2.getWidth())||x<=0){dx2*=-1;}
				bt2.setLocation(x+dx2*FUN.Rand(3),y);
				try{ Thread.sleep(1);}catch(Exception e){}
			} }
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
			bt1.setLabel("{"+cnt+"}");}
	
	public static void main(String[] a) {cwm007 mm=new cwm007();}
	
}
