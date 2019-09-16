package oop005;

public class cwm005 {
	
	public static void main(String[] a){
		
		link kk = new link();
		kk.append(1);kk.append(100);kk.append(-49);
		kk.append(75);kk.append(33);
		kk.print();
		System.out.println("=========");
		Node nn=kk.find(100);
		if(nn!=null){ nn.data=-99; }
		kk.print();
		System.out.println("=========");
		kk.delete(-99);
		kk.print();
		//stack st =new stack();
		//st.push(100);st.push(13);st.push(97);st.push(33);st.push(-22);
		
		//for (int i=1;i<=5;i++){
			//System.out.println( st.pop() );
		//}
		
		
		//Node n1 = new Node(55);
		//Node n2 = new Node(77);
		//Node n3 = new Node(82);
		//Node n4 = new Node(49);
		//**n1.pt=n2;n2.pt=n3;n3.pt=n4;**
		//Node n5 = new Node(-100);
		//n2.pt=n5;n5.pt=n3;
		//Node bb=n2.pt; n2.pt=n5;n5.pt=bb;
		//Node tmp=n1;
		//do{
			//System.out.println(tmp.data);
			//tmp=tmp.pt;
		//}while( tmp!= null);
		
	//}
	}
	
}
		

