package practice;
import java.util.*;
class DATA{
	String key; //�`�I������r
	String name;
	int age;
}
class SLType{ //�w�q�`�Ǧ�C���c
	static final int MAXLEN=100; 
	DATA[] ListData=new DATA[MAXLEN+1]; //�x�s�`�Ǧ�C�����c�}�C
	int ListLen; //�`�Ǧ�C�w�s�`�I���ƶq
	void SLInit(SLType SL) { //��l�ƴ`�Ǧ�C
		SL.ListLen=0; //��l�Ƭ��Ŧ�C
	}
	int SLLength(SLType SL) {
		return (SL.ListLen); //�Ǧ^�`�Ǧ�C�������ƶq
	}
	int SLInsert(SLType SL,int n,DATA data) {
		int i;
		if(SL.ListLen>=MAXLEN) { //�`�Ǧ�C�`�I�ƶq�w�W�L�̤j�ƶq
			System.out.println("�`�Ǧ�C�w���A���ഡ�J�`�I");
			return 0; //�Ǧ^0��ܴ��J�����\
		}
		if(n<1 || n>SL.ListLen) { //���J�`�I�Ǹ������T
			System.out.println("���J�������~�A���ഡ�J����");
			return 0; //�Ǧ^0��ܴ��J�����\
		}
		for(i=SL.ListLen;i>=n;i--) { //�N�`�Ǧ�C������ƦV�Ჾ��
			SL.ListData[i+1]=SL.ListData[i];
		}
		SL.ListData[n]=data; //���J�`�I
		SL.ListLen++; //�`�Ǧ�C�`�I�ƶq�W�[1
		return 1; //���\���J�A�Ǧ^1
	}
	
	int SLAdd(SLType SL,DATA data) {
		if(SL.ListLen>=MAXLEN) { //�`�Ǧ�C�`�I�ƶq�w�W�L�̤j�ƶq
			System.out.println("�`�Ǧ�C�w���A���ഡ�J�`�I");
			return 0; //�Ǧ^0��ܴ��J�����\
		}
		SL.ListData[++SL.ListLen]=data;
		return 1;
	}
	
}
public class P2_1 {

}
