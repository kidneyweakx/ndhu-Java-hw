package final_exam;

import java.awt.Color;
import java.awt.Graphics;


public class Triangle {
	//**** Property ****
		int x1,y1,x2,y2,x3,y3,r,rr,dx,dy;	Color cr;
		//**** Method ****
		Triangle(){
			x1=FUN.Rand(50, 550); y1=FUN.Rand(50, 350); 
			x2=FUN.Rand(50, 550); y2=FUN.Rand(50, 350);
			x3=FUN.Rand(50, 550); y3=FUN.Rand(50, 350);
			dx=FUN.Rand(-1, 1); dy=FUN.Rand(-1, 1);
			cr =new Color(FUN.Rand(200),FUN.Rand(200),FUN.Rand(200));
		}
		void move() {
			x1=x1+dx; y1=y1+dy;x2=x2+dx; y2=y2+dy;x3=x3+dx; y3=y3+dy;
			if((y1>=(489))||(y2>=(489))||(y3>=(489))){dy=dy*-1;}
			if((y1<=(0))||(y2<=(0))||(y3<=(0))){dy=dy*-1;}
			if((x1>=(589))||(x2>=(589))||(x3>=(589))){dx=dx*-1;}
			if((x1<=(0))||(x2<=(0))||(x3<=(0))){dx=dx*-1;}
		}
		void show(Graphics g){
			g.setColor(cr); 
			g.drawLine(x1, y1, x2, y2);
			g.drawLine(x2, y2, x3, y3);
			g.drawLine(x3, y3, x1, y1);
		}
}
