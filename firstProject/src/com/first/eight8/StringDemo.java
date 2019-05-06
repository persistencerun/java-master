package com.first.eight8;

import java.util.Arrays;

import com.first.five5.Arr;
/**
 * String知识类
 * @author Administrator
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		String str="Z洪";
		System.out.println(str);
		       str="洪"+"xixi";
		System.out.println(str);
		
		
		/**
		 * 常量池
		 */
		String aa="aa";
		String bb="aa";
		//对比对象是否相等
		System.out.println(aa.equals(bb));
		//对比地址（比较变量）
        System.out.println(aa==bb);
        
        
        Arr a=new Arr();
        Arr b=new Arr();
        
        Arr c=a;
        
        System.out.println("ab：equals   "+a.equals(b));
        System.out.println("ac：equals   "+a.equals(c));
        System.out.println(a==b);
        System.out.println(a==c);
        
        System.out.println("***************************************"); 
       
        
        //             012345678
        String ttDemo="sfsdfdggg";
        System.out.println("长度："+ttDemo.length());
        String aaDemo="sdfsf";
        //相加
        System.out.println(ttDemo+aaDemo);
        //判断字符串是否有，若没有就是-1
        System.out.println(ttDemo.indexOf("g"));
        //以某某字符分割
        String[] sssss=ttDemo.split("d");
        //数组打印     java.util
        System.out.println(Arrays.toString(sssss));
        //截断
        System.out.println(ttDemo.substring(1, 3));
        System.out.println(ttDemo.substring(5));
        //API   
        jier(999);
	}
	
	
	public static void  jier(int ddd){
		System.out.println(ddd);
	}

}
