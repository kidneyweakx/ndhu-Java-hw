package oopwin09;
import java.awt.*;
public class ball {	
	//**** Property ****
	int x,y,r,rr,dx,dy;	Color cr;
	//**** Method ****
	ball(){
		x=FUN.Rand(50, 550); y=FUN.Rand(50, 350); r=FUN.Rand(5, 10);
		rr=r*2+1; dx=FUN.Rand(-1, 1); dy=FUN.Rand(-1, 1);
		cr =new Color(FUN.Rand(200),FUN.Rand(200),FUN.Rand(200));
	}
	void move() {
		x=x+dx; y=y+dy;
		if((y>=(489-r))||(y<=(30+r))){	dy=dy*-1;}
		if((x>=(589-r))||(x<=(10+r))){	dx=dx*-1;}		
	}
	void show(Graphics g){
		g.setColor(cr); g.fillOval(x-r, y-r, rr, rr);
	}
}
