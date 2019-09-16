package oopwin05;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class cwm005 extends Frame implements MouseListener,MouseMotionListener{
	int mx=-10,my=-10; Color cr = new Color(0,0,0);
	Button bt1,bt2,bt3,bt4,bt5;
	cwm005(){
		this.setSize(600,500);this.setLocation(200,50);this.setLayout(null);
		bt1=new Button("RED");bt1.setSize(60,40);bt1.setLocation(30,50);		
		bt2=new Button("Green");bt2.setSize(60,40);bt2.setLocation(30,110);		
		bt3=new Button("Blue");bt3.setSize(60,40);bt3.setLocation(30,170);
		bt4=new Button("White");bt4.setSize(60,40);bt4.setLocation(30,230);		
		bt5=new Button("Black");bt5.setSize(60,40);bt5.setLocation(30,290);
		bt1.addMouseListener(this);bt2.addMouseListener(this);bt3.addMouseListener(this);
		bt4.addMouseListener(this);bt5.addMouseListener(this);
		this.add(bt1);this.add(bt2);this.add(bt3);this.add(bt4);this.add(bt5);
		this.addMouseListener(this);this.addMouseMotionListener(this);
		this.setVisible(true);
	}
	public void update(Graphics g){ paint(g);}
	public void paint(Graphics g){ g.setColor(cr); g.fillOval(mx-10,my-10,21,21);}

	@Override
	public void mouseDragged(MouseEvent e) {mx=e.getX();my=e.getY();repaint();}


	@Override
	public void mouseMoved(MouseEvent e) {}


	@Override
	public void mouseClicked(MouseEvent e) {
		//mx=e.getX();my=e.getY(); repaint();
		if(e.getSource()==bt1) {cr=new Color(255,0,0);}
		else if(e.getSource()==bt2) {cr=new Color(0,255,0);}
		else if(e.getSource()==bt3) {cr=new Color(0,0,255);}
		else if(e.getSource()==bt4) {cr=new Color(255,255,255);}
		else if(e.getSource()==bt5) {cr=new Color(0,0,0);}
	}
	

	@Override
	public void mouseEntered(MouseEvent e) {}


	@Override
	public void mouseExited(MouseEvent e) {}
	

	@Override
	public void mousePressed(MouseEvent e) {}
	

	@Override
	public void mouseReleased(MouseEvent e) {}
	
	public static void main(String[] a) { cwm005 mm=new cwm005(); }
	
}

