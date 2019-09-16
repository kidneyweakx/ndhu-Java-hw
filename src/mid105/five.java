package mid105;

public class five {
	static int BuildNumeberSet(int[] set, int m) {
		int i=0;
		for(i=0;i<set.length;i++) {		}
		return(i);
	}
	static int[] add(int[] a1,int num) {
		int[] a2=new int[a1.length+1];
		for(int i=0;i<a1.length;i++) {
			a2[i]=a1[i];
		}
		a2[a1.length]=num;
		return (a2);
	}
	public static void main (String[] s) {
		int a,b,c,d,e;int[] arr=new int[0];
		int m=FUN.InputNum("Input max num:", "");
		for(a=0;a<=9 ;a++){
		for(b=0;b<=9 ;b++){
		for(c=0;c<=9 ;c++){
		for(d=0;d<=9 ;d++){
		for(e=0;e<=9 ;e++){
			if (a+b+c+d+e==m) {
				int x=a*10000+b*1000+c*100+d*10+e;
				arr=add(arr,x);
		}
		}
		}
		}
		}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(BuildNumeberSet(arr,m));
	}
		
}