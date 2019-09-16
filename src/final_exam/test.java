package final_exam;

import java.awt.*;

public class test extends Frame implements Runnable {
	Thread th;Triangle[] t=new Triangle[10];
	test(){
		this.setSize(600,500);this.setLocation(200,50);this.setLayout(null);
		for(int i=0;i<10;i++){t[i]=new Triangle();}
		th=new Thread(this);th.start();
		this.setVisible(true);
	}
	public void paint(Graphics g){ 
		for(int i=0;i<10;i++){t[i].show(g);}}
	public void run() { 
		while(true){
			for(int i=0;i<10;i++){t[i].move();}
			repaint(); try{Thread.sleep(10);}catch(Exception e){}
		}
	}
	public static void main(String[] a) {test mm=new test();}
}
