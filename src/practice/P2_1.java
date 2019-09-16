package practice;
import java.util.*;
class DATA{
	String key; //節點的關鍵字
	String name;
	int age;
}
class SLType{ //定義循序串列結構
	static final int MAXLEN=100; 
	DATA[] ListData=new DATA[MAXLEN+1]; //儲存循序串列的結構陣列
	int ListLen; //循序串列已存節點的數量
	void SLInit(SLType SL) { //初始化循序串列
		SL.ListLen=0; //初始化為空串列
	}
	int SLLength(SLType SL) {
		return (SL.ListLen); //傳回循序串列的元素數量
	}
	int SLInsert(SLType SL,int n,DATA data) {
		int i;
		if(SL.ListLen>=MAXLEN) { //循序串列節點數量已超過最大數量
			System.out.println("循序串列已滿，不能插入節點");
			return 0; //傳回0表示插入不成功
		}
		if(n<1 || n>SL.ListLen) { //插入節點序號不正確
			System.out.println("插入元素錯誤，不能插入元素");
			return 0; //傳回0表示插入不成功
		}
		for(i=SL.ListLen;i>=n;i--) { //將循序串列中的資料向後移動
			SL.ListData[i+1]=SL.ListData[i];
		}
		SL.ListData[n]=data; //插入節點
		SL.ListLen++; //循序串列節點數量增加1
		return 1; //成功插入，傳回1
	}
	
	int SLAdd(SLType SL,DATA data) {
		if(SL.ListLen>=MAXLEN) { //循序串列節點數量已超過最大數量
			System.out.println("循序串列已滿，不能插入節點");
			return 0; //傳回0表示插入不成功
		}
		SL.ListData[++SL.ListLen]=data;
		return 1;
	}
	
}
public class P2_1 {

}
