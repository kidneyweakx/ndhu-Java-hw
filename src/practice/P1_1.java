package practice;
import java.util.*;

public class P1_1 {
	static int N=20;
	public static void main(String[] args) {
		int[] arr=new int[N];
		int x,i;
		int f=-1;
		
		Random r=new Random(); //隨機種子
		for(i=0;i<N;i++) {
			arr[i]=r.nextInt(100); //產生陣列
		}
		System.out.println("隨機產生的資料序列:");
		for(i=0;i<N;i++) {
			System.out.print(arr[i]+" "); //輸出序列
		}
		System.out.println("\n");
		
		System.out.print("輸入要尋找的整數");
		Scanner input=new Scanner(System.in);
		x=input.nextInt(); //輸入要尋找的數
		
		for(i=0;i<N;i++) { //循序尋找
			if(x==arr[i]) {
				f=i; break; //找到資料
			}
		}
		if(f<0) {
			System.out.println("沒找到資料:"+x);
		}
		else {
			System.out.println("資料:"+x+" 位於陣列的第"+(f+1)+" 個元素處.");
		}
	}
}
