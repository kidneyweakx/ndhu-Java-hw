package oopwin08;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class cwm008 extends Frame implements Runnable,MouseMotionListener{	
	Thread th; double x=300,y=250; Button bt; double mx,my;
	cwm008() {
		this.setSize(600,500);this.setLocation(200,50);this.setLayout(null);
		th=new Thread(this);th.start();
		bt=new Button("OK");bt.setSize(31,31);bt.setLocation((int)(x-15),(int)(y-15));		
		this.add(bt);this.addMouseMotionListener(this);
		this.setVisible(true);
	}
	
	@Override
	public void mouseMoved(MouseEvent e) { mx=e.getX();my=e.getY(); }
	
	@Override
	public void mouseDragged(MouseEvent e) { }
	
	@Override
	public void run() {	
		double dx,dy;
		while(true)	{
			dx=(mx-x)/20;dy=(my-y)/20;
			x=x+dx;y=y+dy;
			bt.setLocation((int)x-15,(int)y-15);
			try{ Thread.sleep(10); }catch(Exception e){}
		}
	}
		
	public static void main(String[] a){ cwm008 mm=new cwm008();}
}