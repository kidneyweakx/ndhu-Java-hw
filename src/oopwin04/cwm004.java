package oopwin04;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class cwm004 extends Frame implements MouseListener,MouseMotionListener {
	Button bt1,bt2,bt3;int mdx,mdy;
	cwm004(){
		this.setSize(600,500);this.setLocation(200,50);this.setLayout(null);
		bt1=new Button("01");bt1.setSize(100,100);bt1.setLocation(50,50);
		bt1.addMouseListener(this);bt1.addMouseMotionListener(this);
		bt2=new Button("02");bt2.setSize(100,100);bt2.setLocation(150,50);
		bt2.addMouseListener(this);bt2.addMouseMotionListener(this);
		bt3=new Button("03");bt3.setSize(100,100);bt3.setLocation(250,50);
		bt3.addMouseListener(this);bt3.addMouseMotionListener(this);
		this.add(bt1);this.add(bt2);this.add(bt3);
		this.setVisible(true);
	} 

	@Override
	public void mouseClicked(MouseEvent arg0) { dispose();}

	@Override
	public void mouseEntered(MouseEvent arg0) { 
	/*bt1.setLocation(FUN.Rand(0, 539),FUN.Rand(0,469));*/}

	@Override
	public void mouseExited(MouseEvent arg0) { /*bt1.setLabel("Â÷¶}");*/}

	@Override
	public void mousePressed(MouseEvent e) { mdx=e.getX(); mdy=e.getY();}

	@Override
	public void mouseReleased(MouseEvent arg0) {}

	@Override
	public void mouseDragged(MouseEvent e) {
	Button bb = (Button)e.getSource();
	int x=e.getX()+bb.getX()-mdx;int y =e.getY()+bb.getY()-mdy;
	bb.setLocation(x,y);
	/*bt1.setLabel(e.getX()+","+e.getY());*/}

	@Override
	public void mouseMoved(MouseEvent e) {}

	public static void main(String[] a) { cwm004 mm=new cwm004(); }
	
}
