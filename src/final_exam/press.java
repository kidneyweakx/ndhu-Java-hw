package final_exam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class press extends Frame implements ActionListener{
	Button bt;int n=0;
	press(){
		this.setSize(500,450);this.setLocation(200,50);	this.setLayout(null);
		bt=new Button("Press");bt.setSize(80,40);bt.setLocation(80,80);
		bt.addActionListener(this);this.add(bt);
		this.setVisible(true);
	}
	public void paint(Graphics g) {
		int x=0,y=0,r=150; double f=3.141592658/180;
		for(int th=0;th<n;th+=1){
			x=(int)(r*Math.cos(th*f))+300;
			y=(int)(r*Math.sin(th*f))+200;
			g.drawRect(x,y,1,1);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	n=360;	repaint();
	}
	
	public static void main(String[] a) {press m=new press();}
}
