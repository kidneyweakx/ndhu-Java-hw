package oopwin12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class cwm012 extends Frame implements ActionListener, Runnable {
	BufferedImage bm=null; Graphics mg=null; Image im; Button bt;
	int x=150,y=150,dx=5; Thread th; Color wht=new Color(255,255,255);
	cwm012(){
		bm = new BufferedImage(600,500,BufferedImage.TYPE_INT_ARGB_PRE);
		mg=bm.createGraphics(); //mg.setColor(new Color(255,0,0)); mg.fillRect(50, 50, 200, 200);
		im = Toolkit.getDefaultToolkit().createImage(this.getClass().getResource("ball01.png"));
		mg.drawImage(im, 0 , 0 , this);
		bt=new Button("Draw"); bt.setSize(60, 40); bt.setLocation(30, 50);
		bt.addActionListener(this); this.add(bt);//²ÖÂØbutton
		th=new Thread(this);th.start();
		this.setSize(600,500);this.setLocation(200,50);	this.setLayout(null);this.setVisible(true);
	}
	
	public void update(Graphics g){ paint(g);}
	
	public void paint(Graphics g){ g.drawImage(bm, 0, 0 , this);}
	
	@Override
	public void run() {
		while(true){
			x=x+dx; if((x<50)||(x>400)){dx=dx*-1;}
			mg.setColor(wht);mg.fillRect(0, 0, 600, 500);
			mg.drawImage(im, x, y, this);
			repaint(); try{Thread.sleep(10);}catch(Exception e){}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) { mg.drawImage(im, 0 , 0,this);repaint();}
	
	public static void main (String[] a){ cwm012 mm = new cwm012();}
	
}
