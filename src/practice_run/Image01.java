package practice_run;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Image01 extends Frame implements Runnable,WindowListener{
	BufferedImage bm=null; Graphics mg=null; Image im,im2;
	int x=0,dx=5;Thread th; Color wht=new Color(255,255,255);
	Image01(){
		bm=new BufferedImage(600,500,BufferedImage.TYPE_INT_ARGB_PRE);
		mg=bm.createGraphics();
		this.setSize(600,500);this.setLocation(200,50);this.setLayout(null);
		im=Toolkit.getDefaultToolkit().createImage(this.getClass().getResource("CH0001.jpg"));
		im2=Toolkit.getDefaultToolkit().createImage(this.getClass().getResource("P0002.png"));
		th = new Thread(this);th.start();
		this.addWindowListener(this);
		this.setVisible(true);
	}
	public void update(Graphics g){ paint(g);}
	public void paint(Graphics g){
		g.drawImage(bm, 0, 0, this);
	}
	
	@Override
	public void run() {
		while(true){
		x+=dx;if((x>=(1145-480))||(x<=0)){dx*=-1;}
		mg.setColor(wht);mg.fillRect(0, 0, 600, 500);
		mg.drawImage(im, 100, 100, 450, 450, x, 0, x+479, 479, this);
		mg.drawImage(im2,250, 280, 100, 150, this);repaint();
		try{Thread.sleep(10);}catch(Exception e){}
		}
	}
	
	public static void main (String[] a){ Image01 mm = new Image01();}
	
	@Override
	public void windowOpened(WindowEvent e) { }
	@Override
	public void windowClosed(WindowEvent e) { }	
	@Override
	public void windowClosing(WindowEvent e) { dispose();}
	@Override
	public void windowIconified(WindowEvent e) { }
	@Override
	public void windowDeiconified(WindowEvent e) { }
	@Override
	public void windowActivated(WindowEvent e) { }
	@Override
	public void windowDeactivated(WindowEvent e) { }
	
}
