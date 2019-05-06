package com.first.two2;    //声明一个叫com.first.two2的包

public class IfElse {     //声明一个叫IfElse的类
	
	public static void main(String[] args){   //声明一个main（）方法
//	    if(对||错){
//	    	对
//	    }else{
//	    	错
//	    }
		
		//int代表数字的意思      基本类型
		
		//num叫变量
		
		
		
		int num=5;   //定义一个整型变量，并且赋值
		System.out.println("***********************************");  //打印***********************************
		if(num>6){
			System.out.println("大于6");
		}else{
			System.out.println("小于等于6");
		}
		
		System.out.println("***********************************");
		num=8;
		//只进一个
		if(num>6){
			System.out.println("大于6");
		}else if(num>7){
			System.out.println("大于7");
		}else if(num>=8){
			System.out.println("大于8");
		}else{
			System.out.println("小于等于6");
		}
		System.out.println("***********************************");
		//进多个
		
		if(num>6){
			System.out.println("大于6");
		}
		
		if(num>7){
			System.out.println("大于7");
		}
		
		if(num>=8){
			System.out.println("大于8");
		}
		
		
		System.out.println("***********************************");
		
		//三目运算
		
		//(boolean表达式)?(表达式1):(表达式2)
	     int numZi=8;
	     String jieguo=(numZi > 8 ? "true":"false");
	     //表达式是正确的    结果是表达式1    错误的是表达式2
	     System.out.println(jieguo);
	     System.out.println("***********************************");	 
		
		//switch  语句
		String str="你51";
		
		switch(str){
	    case "我":
	    	System.out.println("是我");
	        break;
	    case "你":
	    	System.out.println("是你");
	        break;
	    default:
	    	System.out.println("其他");
	    }
		
		
	}
	
	
}
