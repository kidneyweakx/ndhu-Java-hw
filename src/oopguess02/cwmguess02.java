package oopguess02;

public class cwmguess02 {
	public static void main(String [] a){
		int[]  map = new int [5000]; int pt=0,k=0,A=0,B=0;
		int[]  map2 = new int [5000]; int pt2=0;
		String gus="";
		for(int i=1023;i<=9876;i++){
			if(FUN.CheckSame(String.valueOf(i))==false){
				map[pt]=i;pt++;} }
		System.out.println("TOTAL="+pt);
		do{
			gus=String.valueOf(map[FUN.Rand(0, pt+1)]);
			//System.out.println(pt) ;
			System.out.println("I guess .. "+gus) ;
			A=FUN.InputNum("?A:", "");
			B=FUN.InputNum("?B:", "");
			k=A*10+B;pt2=0;
			for(int i =0;i<pt;i++){
				if(FUN.CountAB(gus, String.valueOf(map[i]))==k){
				map2[pt2]=map[i];pt2++;}
		}
		System.out.println("TOTAL="+pt2);
		for(int i=0;i<pt2;i++){map[i]=map2[i];}
		pt=pt2;
		}while((A != 4)&&(pt2>0));
		if(pt2==0){ System.out.println("´¼»Ù!!");}
	}
}


