package oopwin11;

import java.awt.*;


public class cwm011 extends Frame {
	card cc[]=new card[5];
	cwm011(){
		this.setSize(1000,500);this.setLocation(100,50);this.setLayout(null);
		for(int i=0; i<5; i++){cc[i] = new card();}
		cc[2].setBack();
		this.setVisible(true);
	}
	public void paint(Graphics g){
		for(int i=0; i<5; i++){cc[i].Show(g, 50+i*160, 100, this);}
	}
	
	public static void main (String[] a){ cwm011 mm = new cwm011();}

}
