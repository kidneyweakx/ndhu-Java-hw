package practice;
import java.util.*;

public class P1_1 {
	static int N=20;
	public static void main(String[] args) {
		int[] arr=new int[N];
		int x,i;
		int f=-1;
		
		Random r=new Random(); //�H���ؤl
		for(i=0;i<N;i++) {
			arr[i]=r.nextInt(100); //���Ͱ}�C
		}
		System.out.println("�H�����ͪ���ƧǦC:");
		for(i=0;i<N;i++) {
			System.out.print(arr[i]+" "); //��X�ǦC
		}
		System.out.println("\n");
		
		System.out.print("��J�n�M�䪺���");
		Scanner input=new Scanner(System.in);
		x=input.nextInt(); //��J�n�M�䪺��
		
		for(i=0;i<N;i++) { //�`�ǴM��
			if(x==arr[i]) {
				f=i; break; //�����
			}
		}
		if(f<0) {
			System.out.println("�S�����:"+x);
		}
		else {
			System.out.println("���:"+x+" ���}�C����"+(f+1)+" �Ӥ����B.");
		}
	}
}
