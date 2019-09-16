package homework3;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hw003 extends Frame implements ActionListener {
	Button dsp; Button[] bt = new Button[16];
	String num="";int result=0, ac=0;
	hw003(){
		this.setSize(350,380);this.setLocation(200,50);this.setLayout(null);
		dsp=new Button("0"); dsp.setSize(220, 50); dsp.setLocation(50,40); this.add(dsp);
		for (int i=0;i<16;i++ ){
			if (i< 10) bt[i]=new Button(String.valueOf(i));			
			else if(i==10)bt[i]=new Button("="); else if(i==11)bt[i]=new Button("EXIT");
			else if(i==12)bt[i]=new Button("+"); else if(i==13)bt[i]=new Button("-");
			else if(i==14)bt[i]=new Button("×"); else if(i==15)bt[i]=new Button("÷");
			bt[i].setSize(40,40); bt[i].setLocation(50+(i % 4)*60,300-((int)(i / 4)*60));
			this.add(bt[i]); bt[i].addActionListener(this);
			} 
		dsp.addActionListener(this);this.setVisible(true);
	}
	public void calc() {
		/*不能四則運算*/
		if(ac==1) result+=Integer.parseInt(dsp.getLabel());
		else if(ac==2) result-=Integer.parseInt(dsp.getLabel());
		else if(ac==3) result*=Integer.parseInt(dsp.getLabel());
		else if(ac==4) result/=Integer.parseInt(dsp.getLabel());
		else if(ac==0) result=Integer.parseInt(dsp.getLabel());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String z="", k="";
		for(int i=0;i<10;i++){if(e.getSource()==bt[i]){z=String.valueOf(i); break;}}		
		if(e.getSource()==bt[12]) {	calc();ac=1;k="";} // 加
		else if(e.getSource()==bt[13]){calc();ac=2;k="";} // 減
		else if(e.getSource()==bt[14]){calc();ac=3;k="";} // 乘
		else if(e.getSource()==bt[15]){calc();ac=4;k="";} // 除
		else if(e.getSource()==bt[11]) {dispose();} // 離開
		else if(e.getSource()==bt[10]) {calc();k=String.valueOf(result);dsp.setLabel(k);} // 等於
		else if(e.getSource()==dsp) {k="";ac=0;result=0;} // 歸零
		else k=String.valueOf((Integer.parseInt(dsp.getLabel()+z))); // 數字鍵
		dsp.setLabel(k);
	}
	public static void main(String[] a){hw003 mm = new hw003();}	
}
