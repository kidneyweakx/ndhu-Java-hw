package final_exam;

import java.awt.*;


public class thread01 extends Frame implements Runnable{
	Thread th1,th2;int cnt=0;
	thread01(){
		this.setSize(500,450);this.setLocation(200,50);this.setLayout(null);
		th1=new Thread(this);th2=new Thread(this);th1.start();th2.start();
		this.setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawString("cnt="+cnt, 100, 100);
	}
	@Override
	public void run() {
		if(Thread.currentThread()==th1) {	
			while(true) {	
				cnt=(cnt+FUN.Rand(1,19))%99999;				
				try{ Thread.sleep(10);}catch(Exception e){}
			} }
		else if(Thread.currentThread()==th2) {	
			while(true) {
				repaint();
				try{ Thread.sleep(200);}catch(Exception e){}
			} }
	}
	
	public static void main(String[] a) {thread01 mm=new thread01();}
}
