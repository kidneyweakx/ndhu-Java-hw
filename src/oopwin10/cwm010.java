package oopwin10;

import java.awt.*;

public class cwm010 extends Frame implements Runnable{
	Image im,im2;int x=0,dx=1;Thread th;
	cwm010(){
		this.setSize(600,500);this.setLocation(200,50);this.setLayout(null);
		im=Toolkit.getDefaultToolkit().createImage(this.getClass().getResource("CH0001.jpg"));
		im2=Toolkit.getDefaultToolkit().createImage(this.getClass().getResource("P0002.png"));
		th = new Thread(this);th.start();
		this.setVisible(true);
	}
	public void update(Graphics g){ paint(g);}
	public void paint(Graphics g){
		/*g.setColor(new Color(255,0,0));
		g.fillRect(150, 150, 400, 300);
		g.drawImage(im, 200, 200, this);*/
		g.drawImage(im, 100, 100, 450, 450, x, 0, x+479, 479, this);
		g.drawImage(im2, 250, 340, 300, 390, 0, 0, 255, 255, this);
	}
	
	@Override
	public void run() {
		while(true){
		x+=dx;if((x>=(1145-480))||(x<=0)){dx*=-1;}repaint();
		try{Thread.sleep(1);}catch(Exception e){}
		}
	}
	
	public static void main (String[] a){ cwm010 mm = new cwm010();}
	
}
