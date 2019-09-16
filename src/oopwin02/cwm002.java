package oopwin02;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class cwm002 extends Frame implements ActionListener  {
	Button bt,bt2;
	cwm002(){
		this.setSize(600,500);this.setLocation(200,50);this.setLayout(null);
		bt = new Button("EXIT");bt.setSize(80, 40);bt.setLocation(200, 200);
		bt.addActionListener(this);
		bt2 = new Button("OK");bt2.setSize(80, 40);bt2.setLocation(200, 300);
		bt2.addActionListener(this);
		this.add(bt);this.add(bt2);this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt){dispose();}	
		else if(e.getSource()==bt2){
			//bt2.setLabel("NO");
			int w=bt2.getWidth();int h=bt2.getHeight();
			bt2.setSize(h, w);
		}
	}
	
	public static void main(String[] a){ cwm002 mm= new cwm002(); }	
}
