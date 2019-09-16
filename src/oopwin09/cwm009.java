package oopwin09;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class cwm009 extends Frame implements Runnable, MouseMotionListener {
	//int x1=100,y1=100,r1=10,rr1=r1*2+1,dx1=1,dy1=1;
	int bx1=300,by1=400,bw=100,bh=40,bx2=bx1+bw-1,by2=by1+bh-1;
	int sc=0,slp=5;Thread th;boolean fg=true;ball[] b=new ball[500];
	Color bar = new Color(180, 50, 180);
	Color cr1 = new Color(FUN.Rand(256),FUN.Rand(256),FUN.Rand(256));
	cwm009(){
		this.setSize(600,500);this.setLocation(200,50);this.setLayout(null);
		for(int i=0;i<500;i++){b[i]=new ball();}
		th=new Thread(this);th.start();this.addMouseMotionListener(this);
		this.setVisible(true);
	}
	
	
	public void paint(Graphics g){ 
		for(int i=0;i<500;i++){b[i].show(g);}
		//g.setColor(cr1); g.fillOval(x1-r1, y1-r1, rr1, rr1);
		g.setColor(bar); g.fill3DRect(bx1, by1, bw, bh, true);
		g.drawString("["+sc+"]",10,40);
	}
	
	@Override
	public void run() { 
		while(fg){
			for(int i=0;i<500;i++){b[i].move();}
			/*x1=x1+dx1;y1=y1+dy1;
			if(y1<=40){dy1=dy1*-1;}
			if((x1>=580)||(x1<=20)){dx1=dx1*-1;}
			if((y1==by1-10)&&(x1>=bx1)&&(x1<=bx2)){dy1=dy1*-1;sc++;}
			if((x1==bx1)&&(y1>=by1)&&(y1<=by2)){dx1=dx1*-1;sc++;}
			if((x1==bx2)&&(y1>=by1)&&(y1<=by2)){dx1=dx1*-1;sc++;}
			if(y1>=600){fg=false;dispose();}
			if(sc>=1){slp=3;}if(sc>=2){slp=4;}if(sc>=3){slp=100;}*/
			repaint(); try{Thread.sleep(slp);}catch(Exception e){}
		}
	}


	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {
		 bx1=e.getX();bx2=bx1+bw-1;
	}

	
	public static void main (String[] a){ cwm009 mm = new cwm009();}


}
