package mid105;

public class two {
	static int RandomEven(int m,int n,int p) {
		int x=0;
		do {
		x=m+(int)((n-m+1)*Math.random());
		}while((x%p)!=0); // 可被P整除
		return(x);
	}
	public static void main(String[] a) {
		for(int i=0;i<5;i++)
		System.out.println(RandomEven(0,10,3)); //測試5次
	}
}
