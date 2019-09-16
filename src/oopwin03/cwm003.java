package oopwin03;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cwm003 extends Frame implements ActionListener {
	Button dsp;
	Button[] bt = new Button[10];
	cwm003(){
		this.setSize(600,500);this.setLocation(200,50);this.setLayout(null);
		dsp=new Button("0");dsp.setSize(160, 50);dsp.setLocation(50,40);
		this.add(dsp);
		for (int i=0;i<10;i++ ){
			bt[i]=new Button(String.valueOf(i));bt[i].setSize(40,40);
			bt[i].setLocation(50+(i % 3)*60,100+((int)(i/3)*60));
			this.add(bt[i]);bt[i].addActionListener(this);
			}
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String z="";
		for(int i=0;i<10;i++){
			if(e.getSource()==bt[i]){
				z=String.valueOf(i); break;}}
		String k =String.valueOf((Integer.parseInt(dsp.getLabel()+z)));
		dsp.setLabel(k);
		
	}
	public static void main(String[] a){cwm003 mm = new cwm003();}	
}
