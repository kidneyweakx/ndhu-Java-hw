package mid105;

public class four {
 public static void main(String[] s) {
	 {
	     int a,b,c;
	     int d,e,f;
	     int g,h,i;
	 for(a=1;a<=9 ;a++){
	 for(b=1;b<=9 ;b++){
	 if(b==a) continue;
	 for(c=1;c<=9 ;c++){
	 if(c==a||c==b) continue;
	 for(d=1;d<=9 ;d++){
	 if(d==a||d==b||d==c) continue;
	 for(e=1;e<=9 ;e++){
	 if(e==a||e==b||e==c||e==d) continue;
	 for(f=1;f<=9 ;f++){
	 if(f==a||f==b||f==c||f==d||f==e) continue;
	 for(g=1;g<=9 ;g++){
	 if(g==a||g==b||g==c||g==d||g==e||g==f) continue;
	 for(h=1;h<=9 ;h++){
	 if(h==a||h==b||h==c||h==d||h==e||h==f||h==g) continue;
	 for(i=1;i<=9 ;i++){
	 if(i==a||i==b||i==c||i==d||i==e||i==f||i==g||i==h) continue;
	  if(a+b+c==18&&d+e+f==12&&g+h+i==15&&a*100+b*10+c+d*100+e*10+f+g*100+h*10+i==2556){
	 System.out.println(a+" "+b+" "+c);
	 System.out.println(d+" "+e+" "+f);
	 System.out.println(g+" "+h+" "+i);
	 }
	 }
	 }
	 }
	 }
	 }
	 }
	 }
	 }
	 }
	 } 
 }
}
