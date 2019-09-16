package final_exam;

public class two {
	/*單一繼承 多重繼承
	C++屬於多重繼承 java屬於單一繼承
	多重繼承:一個類別可繼承多個類別的方式
 	優點:
 	1.可增加程式的重複使用率 
 	2.類別可包含的方法較多樣化 
 	3.彈性較大
  	缺點:
  	1.程式容易過度繼承，造成程式複雜度上升
  	2.繼承過多程式的耦合力大，分析困難
  	3.容易造成連鎖效應，修改一個地方好幾個地方跟著一起修改 
  	單一繼承:一個類別限制只能繼承一個父類別
  	優點:
  	1.程式耦合力低，結構簡單 2.程式分析較輕鬆，結構化程度較低 3.程式設計人員交接程式時較容易了解程式架構
   	缺點:
   	1.內容較單一，無彈性 2.需要額外方法時需要透過介面的方式較麻煩
   	a.繼承
   	public class name extends Frame{} //繼承Frame
	b.override
	public void update(){paint();repaint;}
	@Override
	public void update(){paint();}
	c.overload
	static int Rand(int n)	{ 
		return( (int)(n*Math.random()) ); 
	}
	
	static int Rand(int n, int m)	{ 
		return( n+Rand(m-n+1) );
	d.
	public class name implements 介面1,…..{}
*/
}
