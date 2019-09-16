package mid105;

public class six {
	static int Calu(int a,int b) {
		int k=a,m=0,n=0;
		do {
			int t=FUN.InputNum("Input t", "");
			k=k-b;
			m=m+t;
		}while(k>0);
		for(int i=1;i<m;i--) {
			if((a%i)==0&&(b%i)==0) {
				n=n+i;
			}
		}
		return (n);
	}
}
