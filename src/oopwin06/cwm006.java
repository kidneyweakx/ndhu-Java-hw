package oopwin06;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class cwm006 extends Frame implements MouseMotionListener, MouseListener {
	int mx1=-1,my1=-1,mx2=0,my2=0;
	cwm006() {
		this.setSize(600,500);this.setLocation(200,50); this.setLayout(null);
		this.addMouseMotionListener(this);this.addMouseListener(this);
		this.setVisible(true);
	}
	
	public void update(Graphics g) { paint(g);}
	
	public void paint(Graphics g) { g.drawLine(mx1, my1, mx2, my2); mx1=mx2;my1=my2;}
	
	
	@Override
	public void mouseDragged(MouseEvent e) 	{ mx2=e.getX(); my2=e.getY(); repaint(); }
	
	@Override
	public void mouseMoved(MouseEvent e) {}	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	
	@Override
	public void mouseExited(MouseEvent arg0) {}
	
	@Override
	public void mousePressed(MouseEvent e) { mx1=e.getX();my1=e.getY();}
	
	@Override
	public void mouseReleased(MouseEvent arg0) {}
	
	public static void main(String[] a){cwm006 mm=new cwm006();}
	
}