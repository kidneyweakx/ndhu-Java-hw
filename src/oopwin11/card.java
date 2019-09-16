package oopwin11;

import java.awt.*;
import java.awt.image.ImageObserver;

public class card {
	String[] N = new String[5]; String s;
	//****Property ****
	int cr=1; int nu=1;Image im;
	//****Method****
	void GetImage(int c, int n){
		N[1]="CL";N[2]="DM";N[3]="HR";N[4]="SP";
		if(n>9){s=N[c]+String.valueOf(n)+".jpg";}
		else{s=N[c]+"0"+String.valueOf(n)+".jpg";}
		im=Toolkit.getDefaultToolkit().createImage(this.getClass().getResource(s));
	}
	card(){cr=FUN.Rand(1,4); nu=FUN.Rand(1,13); GetImage(cr,nu);}
	card(int clr, int num){ cr=clr; nu=num; GetImage(cr,nu);}
	void setBack(){im=Toolkit.getDefaultToolkit().createImage(this.getClass().getResource("back2.jpg"));}
	void setFront() { GetImage(cr,nu);}
	void Show(Graphics g, int x , int y, ImageObserver p){ g.drawImage(im, x, y,150,250, p);}
}
