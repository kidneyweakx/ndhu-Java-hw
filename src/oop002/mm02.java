package oop002;

public class mm02 {		
	public static void main(String[] arg){		
		int k=0,j=0;
		k=FUN.InputNum("�üƶ}�l","again!");
		j=FUN.InputNum("�ü�End","again!");
		for (int i=0;i<10;i++){			
			System.out.println(FUN.rand(k,j));
		}	
	}
}

