package com.first.three3;   //声明一个叫com.first.three3的包

public class ClassObject {   //声明一个叫ClassObject的类
	
	byte a;
	short b;
    int c;       //重要   数字                             //  8种基本数据类型       数据类分为：基本数据类型  和   应用数据类型
	long d;      
	float e;
	double f;    //
	char g;
	boolean o;   //重要  对错
	
	//成员变量    在类中（不在方法中）
	//局部变量    在方法中
	//静态变量
	static int jj=8;
	
	//byte short int等等是基本类型
	
	// abcdefgoy这种是变量
	
	final static char y=5;    //变量前加final关键字变常量（意思不能修改）
	      //static 用于定义静态变量
	

	public static void main(String[] args) {   //声明一个main（）静态方法
		//y=6;
		
		
		//乘法   
		System.out.println(5*6);
		//除法
		System.out.println(6/5);
		//取模
		System.out.println(6%5);
		//加法  减法  +   -
		//比较  > <  >=  <=
		
		
		//条件   &   |    &&    ||
		
		//&和&&都是和的意思     两边等式都是对的才是true
		//|和||是或者的意思     两边等式只要一个是对的就可以了
		//区别
		// 运算符
		int num=5;
		int doub=6;
		//tab缩进    
		//shift + tab是反缩进
		if(num>5 & doub>6){
			//false
		}
        if(num>5 && doub>4){
        	//和就是两边都是对才是ture
			//中断行为    前面错的   后面就不去判断   结果为错
		}
        //第一个&      不管左边是不是对的   他都会判断右边
        //第二个&&     如果左边是错的   他就不会判断右边了   直接返回错
        //一般&&和||用的多
        
	
        if(num>5 | doub>6){
			//false
		}
        if(num>5 || doub>4){
        	//或就是一个是对的结果就是ture
			//中断行为    前面错的   后面就不去判断   结果为错
		}
            
		num++;
		++num;
		
		
	}

}
