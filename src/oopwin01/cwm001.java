package oopwin01;
import java.awt.*;
/*�e��*/
public class cwm001 extends Frame {
	//** �غc�lconstructor **
	cwm001(){
		this.setSize(600,500); this.setLocation(100,50); this.setVisible(true);
	}
	cwm001(int w,int h,int x,int y){ // �i�]�w�d�򪺪���
		this.setSize(w,h);this.setLocation(x,y); this.setVisible(true);
	}
	//** �L�� override **
	public void paint(Graphics g){
		Color cr;int x=0,y=0,r=150; double f=3.141592658/180;
		for(int th=0;th<360;th+=1){
			cr =new Color(FUN.Rand(0,255),FUN.Rand(0,255),FUN.Rand(0,255));
			x=(int)(r*Math.cos(th*f))+300;
			y=(int)(r*Math.sin(th*f))+200;
			g.setColor(cr);
			g.drawRect(x,y,1,1); // �e��~��
			//g.drawLine(300,200,x,y);//�e�b�|
			//g.drawOval(x-10, y-10, 21, 21);
		}
		Font ff=new Font("�з���",Font.BOLD,32);
		g.setFont(ff);
		g.setColor(new Color(255,30,30));
		g.drawString("�o�O�@�Ӷ�",50,350);
		g.setColor(new Color(0,0,0));
		g.drawString("�o�O�@�Ӷ�",48,348);		
//		for(int i=0;i<1000;i++){cr =new Color(FUN.Rand(0,255),FUN.Rand(0,255),FUN.Rand(0,255));
//		g.setColor(cr);g.drawLine(FUN.Rand(0,600), FUN.Rand(0,600),FUN.Rand(0,600), FUN.Rand(0,600));}
	}
	public static void main(String[] s){
		cwm001 mm= new cwm001();
	}
}
