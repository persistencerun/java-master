package com.first.five5;

/**
 * 
 * @author Administrator
 *
 */
public class Arr {
	//成员变量
	private String name;
	
	private String age;
	
	
	/**
	 * 如果有有参构造器的时候，必须添加一个无参构造器
	 */
	public Arr() {
		
	}
	
    //构造器
	public Arr(String name) {
		//初始化对象的时候给name赋值
		this.name=name;
	}
	

	
	public static void main(String[] args) {
		Arr a=new Arr("arr名字");
		System.out.println("a地址: "+a);
		
		int jj=8;
		System.out.println("jj: "+jj);
		
		
		
		
		int[] arr=new int[5];    
		int[] arrQ={1,12,3,4};  
		int[] arrW = new int[]{1,3,5,7,10,8};
		
		
		String[] strArr=new String[6];
		short[] arrS=new short[]{2,3,5,7};
		String str="曾红";
				
				
		System.out.println("str:"+str);
		System.out.println("arr:"+arrQ);
		
		
		
		Arr[] arrArr=new Arr[1];
		//0 1 2 3
		arrArr[0]=new Arr("锟皆诧拷");
		Arr arrObject=arrArr[0];
		
		
		for(int i=0;i<1;i++){
			System.out.println(arrArr[i]);
			System.out.println("名字:"+arrArr[i].name);
			System.out.println("i:"+i);
		}
		
		//foreach
		for (Arr obj : arrArr) {
			System.out.println("地址:"+obj);
			System.out.println("foreach名字:"+obj.name);
		}
		
		
		
		
		
		System.out.println("*************************************不重要");
		
		//二维数组
		int intArray[ ][ ] = { {1,2}, {2,3}, {4,5} };
		int intArrayQ[ ][ ] = new int[2][3];
		
	}

}
