package oopwin13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class cwm013 extends Frame implements WindowListener,ActionListener {
	TextField tx = null;Button bt =null;  List st=null;
	Font ft=new Font(Font.DIALOG,Font.BOLD,32);
	cwm013(){
		this.setSize(600,500);this.setLocation(200,50);	this.setLayout(null);this.addWindowListener(this);
		bt=new Button("bt"); bt.setSize(60, 40);bt.setLocation(50,50);		
		tx=new TextField("AA");tx.setSize(80,40);tx.setLocation(150, 50);
		st=new List();st.setSize(140,250);st.setLocation(250,50);
		tx.setFont(ft);bt.setFont(ft);st.setFont(ft);
		this.add(tx);this.add(bt);this.add(st);
		bt.addActionListener(this);
		this.setVisible(true);
	}	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		st.add(tx.getText()); tx.setText(""); //bt.setLabel(tx.getText());	
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) { }

	@Override
	public void windowClosed(WindowEvent arg0) {}

	@Override
	public void windowClosing(WindowEvent arg0) { dispose();}

	@Override
	public void windowDeactivated(WindowEvent arg0) {}

	@Override
	public void windowDeiconified(WindowEvent arg0) {}

	@Override
	public void windowIconified(WindowEvent arg0) {}

	@Override
	public void windowOpened(WindowEvent arg0) {}

	public static void main(String[] a){ cwm013 mm= new cwm013();}

}
